import java.io.IOException;

import org.openqa.selenium.By;

public class PopulationCounter extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		init();
		launch("chromebrowser");
		navigateUrl("populationurl");
		Thread.sleep(5000);
		
		String str=driver.findElement(By.className("maincounter-number")).getText();
		System.out.println("total world population is: "+str+" its too more than more");

	}

}
