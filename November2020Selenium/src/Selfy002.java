import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Selfy002 extends BaseTest {

	public static void main(String[] args) throws IOException {
		init();
		launch("chromebrowser");
        navigateUrl("amazonurl");
        List<WebElement> link = driver.findElements(By.linkText("Rajanikant"));
        if(link.size()==0)
        {
        File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(srcFile,new File("C:\\Users\\HP\\Desktop\\Screenshot\\amazon.jpeg"));
        }

	}

}
