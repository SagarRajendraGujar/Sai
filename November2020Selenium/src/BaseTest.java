import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.io.FileHandler;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
//BaseTest+ExtentManager
public class BaseTest {
	public static WebDriver driver;
	public static String projectpath = System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties p;
	public static Properties parentprop;
	public static Properties childprop;
	public static Properties orProp;
	public static ExtentReports report;
	public static ExtentTest test;

	public static void init() throws IOException {
		fis = new FileInputStream(projectpath + "/data.properties");
		p = new Properties();
		p.load(fis);

		fis = new FileInputStream(projectpath + "/environment.properties");
		parentprop = new Properties();
		parentprop.load(fis);
		String e = parentprop.getProperty("env");

		fis = new FileInputStream(projectpath + "/" + e + ".properties");
		childprop = new Properties();
		childprop.load(fis);
		System.out.println(childprop.getProperty("iciciurl"));

		fis = new FileInputStream(projectpath + "/or.properties");
		orProp = new Properties();
		orProp.load(fis);

		fis = new FileInputStream(projectpath + "/log4jconfig.properties");
		PropertyConfigurator.configure(fis);

		report = ExtentManager.getInstance();
	}

	public static void launch(String browser) {

		if (p.getProperty(browser).equals("chrome")) {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("user-data-dir=C:\\Users\\HP\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
			option.addArguments("--disable-notifications");
			option.addArguments("--start-maximized");

			driver = new ChromeDriver(option);
		} else if (p.get(browser).equals("firefox")) {
			ProfilesIni p = new ProfilesIni();
			FirefoxProfile profile = p.getProfile("SaiSeleniumProfile");
			profile.setPreference("dom.webnotifications.enabled", false);
			FirefoxOptions option = new FirefoxOptions();
			option.setProfile(profile);

			driver = new FirefoxDriver(option);
		} else if (p.get(browser).equals("edge")) {
			System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\Desktop\\SelUp\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
	}

	public static void navigateUrl(String url) {

		driver.get(childprop.getProperty(url));
	}

	public static void type(String locatorkey, String item) {
		getElement(locatorkey).sendKeys(item);
		// driver.findElement(By.name(locatorkey)).sendKeys(item);
	}

	public static void clickElement(String locatorkey) {
		getElement(locatorkey).click();
		// driver.findElement(By.cssSelector(locatorkey)).click();

	}

	public static void selectOption(String locatorkey, String item) {
		getElement(locatorkey).sendKeys(item);
		// driver.findElement(By.id(locatorkey)).sendKeys(item);

	}

	public static WebElement getElement(String locatorkey) {
		WebElement element = null;

		if (locatorkey.endsWith("_id")) {
			element = driver.findElement(By.id(orProp.getProperty(locatorkey)));
		} else if (locatorkey.endsWith("_name")) {
			element = driver.findElement(By.name(orProp.getProperty(locatorkey)));
		} else if (locatorkey.endsWith("_tagName")) {
			element = driver.findElement(By.tagName(orProp.getProperty(locatorkey)));
		} else if (locatorkey.endsWith("_className")) {
			element = driver.findElement(By.className(orProp.getProperty(locatorkey)));
		} else if (locatorkey.endsWith("_linkText")) {
			element = driver.findElement(By.linkText(orProp.getProperty(locatorkey)));
		} else if (locatorkey.endsWith("_partialLinkText")) {
			element = driver.findElement(By.partialLinkText(orProp.getProperty(locatorkey)));
		} else if (locatorkey.endsWith("_xpath")) {
			element = driver.findElement(By.xpath(orProp.getProperty(locatorkey)));
		} else if (locatorkey.endsWith("_cssSelector")) {
			element = driver.findElement(By.cssSelector(orProp.getProperty(locatorkey)));
		} else {
			System.out.println("you are giving wrong locator value, please check...!");
		}
		return element;
	}

	// for verification purpose
	public static boolean isElementEqual(String expectedLink) {

		String actualLink = driver.findElement(By.linkText("Computers")).getText();

		if (actualLink.equalsIgnoreCase(expectedLink))
			return true;
		else
			return false;
	}

	public static void reportSuccess(String passmsg) throws IOException {

		test.log(LogStatus.PASS, passmsg);
		takeScreenshot();
	}

	public static void reportFailuer(String failmsg) throws IOException {

		test.log(LogStatus.FAIL, failmsg);
		takeScreenshot();
		
	}

	private static void takeScreenshot() throws IOException {
		Date dt = new Date();
		String dateformat = dt.toString().replace(' ', '_').replace(':', '_');

		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile, new File(projectpath + "\\failureScreenshot\\" + dateformat + ".png"));
		FileHandler.copy(srcFile, new File("C:\\Users\\HP\\Desktop\\Screenshot\\" + dateformat + ".png"));
		test.log(LogStatus.INFO,
				"Screenshot...>>" + test.addScreenCapture(projectpath + "\\failureScreenshot\\" + dateformat+".png"));
	}

}
