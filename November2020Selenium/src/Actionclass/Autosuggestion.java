package Actionclass;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Autosuggestion extends BaseTest {
	public static Actions a;

	public static void main(String[] args) throws IOException, InterruptedException {
		init();
		launch("chromebrowser");
		navigateUrl("googleurl");

		driver.findElement(By.name("q")).sendKeys("hadoop tutorial");
		String val = driver.findElement(By.name("q")).getAttribute("value");
		System.out.println(val);
		
		Thread.sleep(3000);
	List<WebElement> elements = driver.findElements(By.className("sbct"));
		for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i).getText().equals(val)) {
				elements.get(i).click();
				
				return;
			}
			
			elements = driver.findElements(By.className("sbct"));
			
			
		}

	}

}
