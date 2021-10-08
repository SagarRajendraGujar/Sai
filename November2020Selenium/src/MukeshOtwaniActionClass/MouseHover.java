package MukeshOtwaniActionClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHover extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		init();
		launch("chromebrowser");
		navigateUrl("mousehoverurl");
        //driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-perform-mouse-hover-in-selenium.html");
        WebElement element=driver.findElement(By.cssSelector("body.variant-bold:nth-child(2) div.content:nth-child(3) div.content-outer div.fauxborder-left.content-fauxborder-left div.content-inner div.main-outer:nth-child(3) div.fauxborder-left.main-fauxborder-left div.region-inner.main-inner div.columns.fauxcolumns div.columns-inner:nth-child(4) div.column-center-outer div.column-center-inner div.main.section div.widget.Blog div.blog-posts.hfeed div.date-outer div.date-posts div.post-outer div.post.hentry.uncustomized-post-template div.post-body.entry-content:nth-child(6) div:nth-child(1) div.dropdown:nth-child(3) > button.dropbtn:nth-child(1)"));
        Actions act=new Actions(driver);
        act.moveToElement(element).perform();
        Thread.sleep(5000);
	}

}
