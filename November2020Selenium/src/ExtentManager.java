import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;

//BaseTest+ExtentManager+Tc_003=htmlreport
public class ExtentManager extends BaseTest{
	public static ExtentReports report;
	
	public static ExtentReports getInstance()
	{
		if(report==null)
		{
			report=new ExtentReports(projectpath+"//HtmlReports//htmlreport.html");
			report.loadConfig(new File(projectpath+"//extentreports.xml"));
			report.addSystemInfo("Selenium Languagebinding","3.141.59").addSystemInfo("environment", parentprop.getProperty("env"));
		}
		
		return report;
	}

}
