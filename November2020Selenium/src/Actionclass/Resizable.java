package Actionclass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Resizable extends BaseTest {
public static Actions a;
	public static void main(String[] args) throws IOException, InterruptedException {
		init();
		launch("chromebrowser");
        navigateUrl("resizableurl");
        
        driver.switchTo().frame(0);
        WebElement drag=driver.findElement(By.cssSelector("body:nth-child(2) div.ui-widget-content.ui-resizable > div.ui-resizable-handle.ui-resizable-se.ui-icon.ui-icon-gripsmall-diagonal-se:nth-child(4)"));
        a=new Actions(driver);
        Thread.sleep(5000);
        //approch first
        //a.moveToElement(drag,5,10).build().perform();
        a.clickAndHold(drag).moveByOffset(100, 100).release(drag).build().perform();
       

	}

}
