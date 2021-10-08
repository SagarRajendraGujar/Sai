import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

public class WindowsHandle2 extends BaseTest{

	public static void main(String[] args) throws IOException {
		init();
		launch("chromebrowser");
		navigateUrl("naukriurl");
		String parent=driver.getWindowHandle();
		System.out.println("parent window id is: "+parent);

		Set<String> allwindow=driver.getWindowHandles();
		int no_of_Window=allwindow.size();
		System.out.println("total no.of window are:"+no_of_Window);
		
		ArrayList<String> tabs=new ArrayList<>(allwindow);
		for(int i=tabs.size()-1;i>0;i--)
		{
			if(!(tabs.get(i).equalsIgnoreCase(parent)))
			{
				System.out.println(tabs.get(i));
				driver.switchTo().window(tabs.get(i));
			}
		}
	}

}
