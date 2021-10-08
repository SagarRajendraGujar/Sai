package Actionclass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Slider extends BaseTest {
public static Actions a;
	public static void main(String[] args) throws IOException {
		init();
		launch("chromebrowser");
		navigateUrl("sliderurl");
		driver.switchTo().frame(0);
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		a=new Actions(driver);
		//first approch-notworking
		//a.moveToElement(drag, 200, 0);
		
		//second approch-working
		a.clickAndHold(drag).moveToElement(drag, 200, 0).release(drag).build().perform();
	}

}
