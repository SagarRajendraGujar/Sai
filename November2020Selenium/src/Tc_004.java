import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

public class Tc_004 extends BaseTest {
	private static final Logger log = Logger.getLogger("Tc_004.class");

	public static void main(String[] args) throws IOException {
		init();
		test = report.startTest("Tc_004");
		test.log(LogStatus.INFO, "start the Tc_004");
		log.info("start the Tc_004");

		test.log(LogStatus.INFO, "intitializing the dependanccy file------");
		log.info("intitializing the dependanccy file------");

		launch("chromebrowser");
		test.log(LogStatus.PASS, "opening the browser: " + p.getProperty("chromebrowser"));
		log.info("opening the browser: " + p.getProperty("chromebrowser"));

		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "navigate the url: " + childprop.getProperty("amazonurl"));
		log.info("navigate the url: " + childprop.getProperty("amazonurl"));

		Boolean actualResult = driver.findElement(By.linkText("computers")).isDisplayed();

		if (!actualResult)
			System.out.println("element is not displayed");
		else
			System.out.println("element is displayed");

		/*
		 * if (actualResult)
		 *  System.out.println("Element is Displayed");
		 * else
		 *  System.out.println("Element is not Displayed");
		 */

		test.log(LogStatus.PASS, "End the Tc_004");
		log.info("End the Tc_004");

		report.endTest(test);
		report.flush();

	}

}
