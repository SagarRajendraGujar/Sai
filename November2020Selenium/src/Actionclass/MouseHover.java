package Actionclass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class MouseHover extends BaseTest{
    public static Actions a;
	public static void main(String[] args) throws IOException {
		init();
		launch("chromebrowser");
        navigateUrl("snapdealurl");
     
        a=new Actions(driver);
        a.moveToElement(driver.findElement(By.cssSelector("div.comp-header.reset-padding:nth-child(39) div.headerBar.reset-padding:nth-child(4) div.topBar.top-bar-homepage.top-freeze-reference-point:nth-child(20) div.header_wrapper div.col-xs-5.reset-padding.header-right.rfloat div.myAccountTab.accountHeaderClass.col-xs-13.reset-padding > div.accountInner"))).perform();
        a.click(driver.findElement(By.linkText("Shortlist"))).perform();
     
	}

}
