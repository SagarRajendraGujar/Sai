import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class Tc_005 extends BaseTest {
    private static final Logger log=Logger.getLogger(Tc_005.class);
	public static void main(String[] args) throws IOException {
		init();
		test = report.startTest("Tc_005");
		test.log(LogStatus.INFO, "start the Tc_005");
		log.info("start the Tc_005");

		test.log(LogStatus.INFO, "intitializing the dependanccy file------");
		log.info("intitializing the dependanccy file------");

		launch("chromebrowser");
		test.log(LogStatus.PASS, "opening the browser: " + p.getProperty("chromebrowser"));
		log.info("opening the browser: " + p.getProperty("chromebrowser"));

		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "navigate the url: " + childprop.getProperty("amazonurl"));
		log.info("navigate the url: " + childprop.getProperty("amazonurl"));

//varify the links by using getText and getAttribute method.
		/*
		 * String actuallink=driver.findElement(By.linkText("Computers")).getAttribute(
		 * "innerHTML"); String expectedlink="Computers";
		 * System.out.println(actuallink); System.out.println(expectedlink);
		 * if(actuallink.equals(expectedlink))
		 * System.out.println("both links are equals"); else
		 * System.out.println("both links are not equals");
		 */
//how to get the text from textbox byusing getAttribute() method.
		//getText()=for get the visible and static text.
		//getAttribute()=for get the dynamic_text(inner_properties).
	    WebElement textbox_loc=driver.findElement(By.id("twotabsearchtextbox"));
		textbox_loc.sendKeys("sony");
		String str=textbox_loc.getAttribute("value");
		System.out.println(str);
		
		test.log(LogStatus.PASS, "End the Tc_005");
		log.info("End the Tc_005");

		report.endTest(test);
		report.flush();
	
	}

}
