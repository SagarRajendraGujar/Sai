import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class ElementMethod extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		init();
		launch("chromebrowser");
        navigateUrl("amazonurl");
        //1)sendKeys()
        //2)clear()
        //3)click()
        //4)submit
        WebElement loc=driver.findElement(By.id("twotabsearchtextbox"));
        loc.sendKeys("harry potter");//sendKeys() method
        Thread.sleep(3000);
        loc.clear();//clear() method
        loc.sendKeys("harry potter");//sendKeys() mehtod
        Thread.sleep(3000);
        driver.findElement(By.id("nav-search-submit-button")).submit();//submit() method
        //driver.findElement(By.id("nav-search-submit-button")).click();//click() method
        
        //5)getText()
        String logoname=driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText();
        System.out.println(logoname);
        
        //6)getAttribute()
        //String attribute=driver.findElement(By.linkText("Computers")).getAttribute("href");
        String attribute=driver.findElement(By.xpath("//a[contains(text(),'Computers')]")).getAttribute("innerHTML");
        System.out.println(attribute);
        
        //InnerHTML properties
        attribute=driver.findElement(By.xpath("//a[contains(text(),'Computers')]")).getAttribute("innerHTML");
        System.out.println(attribute);
        
        //7)getSize()
        Dimension size = driver.findElement(By.linkText("Computers")).getSize();
        System.out.println(size);
        
        //*8)getCssValue()
        //Point cssSelLoc = driver.findElement(By.linkText("Computers")).getCssValue();
        //9)getLocation().
        int location = driver.findElement(By.linkText("Computers")).getLocation().getX();
        System.out.println(location);
        location = driver.findElement(By.linkText("Computers")).getLocation().getY();
        System.out.println(location);
        Point locations = driver.findElement(By.linkText("Computers")).getLocation();
        System.out.println(locations);
        
        //10)getTagname()
        String tagname = driver.findElement(By.linkText("Computers")).getTagName();
        System.out.println(tagname);
        
        //11)isSelected()
        //12)isEnabled()
        //13)isDisplayed()
        driver.get("http://mahafood.gov.in/pggrams/Entrygrv.aspx");
        WebElement loc_of_Radio=driver.findElement(By.id("ctl00_ContentPlaceHolder1_egf_rbtnrcno_0"));
        System.out.println(loc_of_Radio.isDisplayed());//isDisplayed() method
        System.out.println(loc_of_Radio.isEnabled());//isEnabled() method
        
        System.out.println(loc_of_Radio.isSelected());//isSelected() method
        Thread.sleep(5000);
        loc_of_Radio.click();
        
        Boolean status=driver.findElement(By.id("ctl00_ContentPlaceHolder1_egf_rbtnrcno_0")).isSelected();
        System.out.println(status);
        

	}

}
