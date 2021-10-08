import java.io.IOException;

import org.apache.log4j.Logger;

public class Tc_002 extends BaseTest {
    private static final Logger log=Logger.getLogger(Tc_002.class);
	public static void main(String[] args) throws IOException {
		init();
		log.info("start the Tc_002");
		log.info("intitializing the dependanccy file------");
		
		launch("chromebrowser");
		log.info("opening the browser: "+p.getProperty("chromebrowser"));
        
		navigateUrl("amazonurl");
        log.info("navigate the url: " + childprop.getProperty("amazonurl"));
        
        selectOption("amazondropdown_id","Books");
        log.info("select the dropdown option by using locator: " + orProp.getProperty("amazondropdown_id"));
        type("amazonsearchtext_name","Harry Potter");
        log.info("enter the text harry potter by using locator : " + orProp.getProperty("amazonsearchtext_name"));
        clickElement("amazonsearchbutton_xpath");
        log.info("click the search button by using locator : " + orProp.getProperty("amazonsearchbutton_xpath"));
        log.info("End the Tc_002");
	}

}
