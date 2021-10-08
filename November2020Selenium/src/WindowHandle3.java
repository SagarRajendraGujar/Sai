import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;

public class WindowHandle3 extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		init();
		launch("chromebrowser");
        navigateUrl("hdfcurl");
        String parent=driver.getWindowHandle();
        System.out.println("parent windowID: "+parent);
        driver.findElement(By.cssSelector("body.page-homepage.user-logged-out.path-frontpage.navbar-is-fixed-top.has-glyphicons.chrome.chrome93.win.desktop.english.www:nth-child(2) div.mm-page.mm-slideout:nth-child(2) div.dialog-off-canvas-main-canvas:nth-child(2) header.navbar.navbar-default.navbar-fixed-top div.container div.col-lg-9.col-md-9.col-sm-6.col-xs-6 div.region.region-navigation-collapsible section.block.block-hdfc-menu.block-hdfc-menu-block.clearfix div:nth-child(1) div.wrapper.hdfc-menu-links ul:nth-child(2) li:nth-child(1) > a.apply-for-home-loan")).click();
        
        Set<String> whad=driver.getWindowHandles();
        ArrayList<String> alltabs=new ArrayList<>(whad);
        System.out.println("total no.of windows: "+alltabs.size());
        for(int i=0;i<alltabs.size();i++)
        {
        	if(!alltabs.get(i).equalsIgnoreCase(parent))
        	{
        		System.out.println("child windowID: "+alltabs.get(i));
        		driver.switchTo().window(alltabs.get(i));
        	}
        }
        driver.findElement(By.cssSelector("div.container-fluid.bg-img.bg-white:nth-child(3) div.row div.col-md-6:nth-child(2) div.row.login-tab.tab-main-div ul.nav.nav-tabs li.nav-item:nth-child(2) a.nav-link div:nth-child(1) > label.radio-custom-label")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("user_id")).sendKeys("SagarRajendraGujar");
        Thread.sleep(3000);
        driver.findElement(By.name("password")).sendKeys("SagarRajendraGujar");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("div.container-fluid.bg-img.bg-white:nth-child(3) div.row div.col-md-6:nth-child(2) div.row.login-tab.tab-main-div div.tab-content div.tab-pane.active:nth-child(2) div:nth-child(2) form:nth-child(2) div.row:nth-child(2) div.col-lg-12.col-sm-12.col-md-12.col-xs-12.mt-40.text-center:nth-child(4) > button.btn-common.btn-login")).click();
}

}
