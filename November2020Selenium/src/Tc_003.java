import org.apache.log4j.Logger;

import com.relevantcodes.extentreports.LogStatus;

public class Tc_003 extends BaseTest{
	 private static final Logger log=Logger.getLogger(Tc_003.class);
	public static void main(String[] args) throws Exception {
		init();
		test=report.startTest("Tc_003");
		test.log(LogStatus.INFO,"start the Tc_003");
		log.info("start the Tc_003");
		
		test.log(LogStatus.INFO,"intitializing the dependanccy file------");
		log.info("intitializing the dependanccy file------");
		
		launch("chromebrowser");
		test.log(LogStatus.PASS,"opening the browser: "+p.getProperty("chromebrowser"));
        log.info("opening the browser: "+p.getProperty("chromebrowser"));
        
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS,"navigate the url: " + childprop.getProperty("amazonurl"));
        log.info("navigate the url: " + childprop.getProperty("amazonurl"));
        
        selectOption("amazondropdown_id","Books");
        test.log(LogStatus.PASS,"select the dropdown option by using locator: " + orProp.getProperty("amazondropdown_id"));
        log.info("select the dropdown option by using locator: " + orProp.getProperty("amazondropdown_id"));
        
        type("amazonsearchtext_name","Harry Potter");
        test.log(LogStatus.PASS,"enter the text harry potter by using locator : " + orProp.getProperty("amazonsearchtext_name"));
        log.info("enter the text harry potter by using locator : " + orProp.getProperty("amazonsearchtext_name"));
        
        clickElement("amazonsearchbutton_xpath");
        test.log(LogStatus.PASS,"click the search button by using locator : " + orProp.getProperty("amazonsearchbutton_xpath"));
        log.info("click the search button by using locator : " + orProp.getProperty("amazonsearchbutton_xpath"));
        
        test.log(LogStatus.PASS,"End the Tc_003");
        log.info("End the Tc_003");
        
        report.endTest(test);
        report.flush();
        
	}

}
