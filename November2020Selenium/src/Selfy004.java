import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Selfy004 extends BaseTest {

	public static void main(String[] args) throws IOException {
	init();
	launch("chromebrowser");
	navigateUrl("amazonurl");
	
	Date dt=new Date();
	String str=dt.toString().replace(' ', '_').replace(':','_');
	
	
	File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(srcfile, new File("C:\\Users\\HP\\Desktop\\Screenshot\\"+str+".png"));
	
	}

}
