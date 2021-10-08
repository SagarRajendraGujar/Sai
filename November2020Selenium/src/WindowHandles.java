import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;

public class WindowHandles extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		init();
		launch("chromebrowser");
		//navigateUrl("windowurl");
		driver.get("https://www.naukri.com");
		String parent=driver.getWindowHandle();
		System.out.println("parent window is: "+parent);
		
		//driver.findElement(By.xpath("//body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();
	    Set<String> allwindows=driver.getWindowHandles();
		int count=allwindows.size();
		System.out.println("total window are: "+count);
		
		for(String child:allwindows)
		{
			if(!child.equalsIgnoreCase(parent))
			{
				driver.switchTo().window(child);
				System.out.println("childwindow title is: "+driver.getTitle());
				Thread.sleep(3000);
				 
			}
		}
		driver.switchTo().window(parent);
		System.out.println("parent window tital is: "+driver.getTitle());
		
		/*
		 * Set<String> wh = driver.getWindowHandles(); System.out.println(wh);
		 */
	}

}
