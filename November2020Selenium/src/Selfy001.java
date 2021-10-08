import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Selfy001 extends BaseTest{

	public static void main(String[] args) throws IOException {
		init();
		launch("chromebrowser");
        navigateUrl("amazonurl");
        File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(srcFile,new File("C:\\Users\\HP\\Desktop\\Screenshot\\amazon.png"));
        
	}

}
