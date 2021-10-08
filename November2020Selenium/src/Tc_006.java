import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class Tc_006 extends BaseTest {
	private static final Logger log=Logger.getLogger(Tc_006.class);
	public static void main(String[] args) throws IOException {
		init();
		test = report.startTest("Tc_006");
		test.log(LogStatus.INFO, "start the Tc_006");
		log.info("start the Tc_006");

		test.log(LogStatus.INFO, "intitializing the dependanccy file------");
		log.info("intitializing the dependanccy file------");

		launch("chromebrowser");
		test.log(LogStatus.PASS, "opening the browser: " + p.getProperty("chromebrowser"));
		log.info("opening the browser: " + p.getProperty("chromebrowser"));

		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "navigate the url: " + childprop.getProperty("amazonurl"));
		log.info("navigate the url: " + childprop.getProperty("amazonurl"));
		
		String expectedLink="Computer";
		
		if(!isElementEqual(expectedLink))
			reportFailuer("both links are not equal");
		else
			reportSuccess("both links are equal");
		
		/*
		 * if(!isElementEqual(expectedLink))
		 * System.out.println("both links are not equal"); else
		 * System.out.println("both links are equal");
		 */
		
		
		test.log(LogStatus.PASS, "End the Tc_006");
		log.info("End the Tc_006");

		report.endTest(test);
		report.flush();

	}
	
	

}
