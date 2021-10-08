package Actionclass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//context_click means Right_click
public class RightClick extends BaseTest {
public static Actions a;
	public static void main(String[] args) throws IOException {
		init();
		launch("chromebrowser");
        navigateUrl("rightclickurl");
        
        WebElement drag=driver.findElement(By.xpath("//a[contains(text(),'Selectable')]"));
        a=new Actions(driver);
        a.contextClick(drag).perform();
	}

}
