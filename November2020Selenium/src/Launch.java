import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {
	public static WebDriver driver;

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Desktop\\Selenium_update\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https:www.fb.com");

		//System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Desktop\\SelUp\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https:www.amazon.in");

		System.setProperty("webdriver.edge.driver","C:\\Users\\HP\\Desktop\\SelUp\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https:www.selenium.dev");

	}

}
