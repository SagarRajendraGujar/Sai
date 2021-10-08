package MukeshOtwaniActionClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RightClick_and_DoubleClickEx extends BaseTest{
public static Actions a;
	public static void main(String[] args) throws IOException {
		init();
		launch("chromebrowser");
		/*navigateUrl("RcDcurl");
		//Right click
		 *
		 * a=new Actions(driver); WebElement
		 * element=driver.findElement(By.xpath("//span[text()='right click me']"));
		 * a.contextClick(element).perform();
		 * driver.findElement(By.xpath("//span[text()='Copy']")).click(); String
		 * alertmsg=driver.switchTo().alert().getText(); System.out.println(alertmsg);
		 * driver.switchTo().alert().accept();
		 */
		
		//Double click
		navigateUrl("doubleclickurl");
		driver.switchTo().frame(driver.findElement(By.cssSelector("body.api.jquery.single.single-post.postid-113.single-format-standard.single-author.singular:nth-child(2) div.clearfix.row:nth-child(3) div.content-right.twelve.columns article.post-113.post.type-post.status-publish.format-standard.hentry.category-mouse-events.category-65.category-78 div.entry-content article.entry.method div.entry-wrapper section.entry-examples:nth-child(6) div.entry-example:nth-child(3) div.demo.code-demo:nth-child(4) > iframe:nth-child(1)")));
		a=new Actions(driver);
		
		a.doubleClick(driver.findElement(By.xpath("//span[text()='Double click the block']//parent::body/div"))).perform();
	}

}
