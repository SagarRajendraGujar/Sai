package Actionclass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop0 extends BaseTest {
public static Actions a;
	public static void main(String[] args) throws IOException {
		init();
		launch("chromebrowser");
        navigateUrl("dragdropurl");
        
        driver.switchTo().frame(0);
        WebElement drag=driver.findElement(By.id("draggable"));
        WebElement drop=driver.findElement(By.id("droppable"));
        a=new Actions(driver);
        //first approch
        //a.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
        //a.dragAndDrop(drag,drop).perform();
       
        //second approch
        a.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();

	}

}
