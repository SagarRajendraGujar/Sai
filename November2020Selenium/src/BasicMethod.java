
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasicMethod extends BaseTest {

	public static void main(String[] args) throws IOException {
		init();
		launch("chromebrowser");
        navigateUrl("amazonurl");
        
//1)close()
          //driver.close();
//2)findElement()
          //driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
//3)findElements()
			/*
			 * List<WebElement> elements=driver.findElements(By.tagName("div")); for(int
			 * i=0;i<elements.size();i++) { String str = elements.get(0).toString();
			 * System.out.println(str); }
			 */
//4)get()
       //driver.get("https://www.fb.com");
//5)getCurrentUrl()
		/*
		 * String str = driver.getCurrentUrl(); System.out.println(str);
		 */
//6)getPageSource()
		/*
		 * String ps=driver.getPageSource(); System.out.println(ps);
		 */
//7)getTitle()
		/*
		 * String pagetitle = driver.getTitle(); System.out.println(pagetitle);
		 */
//8)getWindowHandle()
		/*
		 * String tabid=driver.getWindowHandle(); System.out.println(tabid);
		 */
//9)getWindowHandle()
		/*
		 * Set<String> alltabid = driver.getWindowHandles(); ArrayList<String> tabs=new
		 * ArrayList<>(alltabid); for(String tab:tabs) {
		 * System.out.println("tabid of this tab is: "+tab); }
		 */
       
//10)manage()
       //driver.manage().window().maximize();
//11)navigate()
		/*
		 * driver.navigate().to("https://www.google.com"); driver.navigate().back();
		 * driver.navigate().forward();
		 */
       
//12)quit()
       //driver.quit();
//13)switchTo()
		/*
		 * driver.switchTo().window("windowID"); driver.switchTo().frame(0);
		 */
       
	}

}
