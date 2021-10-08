import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;

public class WindowsHandle1 extends BaseTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		init();
		launch("chromebrowser");
		navigateUrl("windowurl");
		
		String parent=driver.getWindowHandle();
		System.out.println("parent window is: "+parent);
		
		driver.findElement(By.xpath("//body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]")).click();
	    Set<String> allwindows=driver.getWindowHandles();
		int count=allwindows.size();
		System.out.println("total window are: "+count);
		
	
		Set<String> wh = driver.getWindowHandles(); 
		System.out.println(wh);
		for(String windo:wh)
		{
			System.out.println("windowhandle of this Window is_: "+windo);
		}		 

	}

}
