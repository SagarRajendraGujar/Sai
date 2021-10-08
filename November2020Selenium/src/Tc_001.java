import java.io.IOException;

import org.openqa.selenium.By;

public class Tc_001 extends BaseTest{

	public static void main(String[] args) throws IOException {
		init();
		launch("chromebrowser");
        navigateUrl("amazonurl");
        
        selectOption("amazondropdown_id","Books");
        type("amazonsearchtext_name","Harry Potter");
        clickElement("amazonsearchbutton_xpath");
	}

	

}
