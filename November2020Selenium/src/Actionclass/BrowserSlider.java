package Actionclass;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserSlider extends BaseTest {
public static Actions a;
	public static void main(String[] args) throws IOException, InterruptedException {
	init();	
	launch("chromebrowser");
	navigateUrl("bsliderurl");
	
	for(int i=0;i<10;i++)
	{
		((RemoteWebDriver)driver).executeScript("window.scrollBy(0,200)");
		Thread.sleep(1000);
	}
	}

}
