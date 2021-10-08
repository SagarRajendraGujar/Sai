import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Selfy003 extends BaseTest {

	public static void main(String[] args) throws IOException {
		init();
		launch("chromebrowser");
        navigateUrl("googleurl");
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        
        for(int i=0;i<links.size();i++)
        {
        	if(!links.get(i).getText().isEmpty())
        	{    
        		 String linkname=links.get(i).getText();
        		 driver.findElement(By.linkText(linkname)).click();
        		 File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        	     FileHandler.copy(srcFile,new File("C:\\Users\\HP\\Desktop\\Screenshot\\"+linkname+".png"));
        	     driver.navigate().back();
        	     links = driver.findElements(By.tagName("a"));
        	}
        }
       
        

	}

}
