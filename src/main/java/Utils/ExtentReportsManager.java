package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsManager {
	
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports report;
	
	public static ExtentReports getReportInstance() {
		
		if(report==null) {
			htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"//test-output//ExtentReports//testReport.html");
			report= new ExtentReports();
			report.attachReporter(htmlReporter);
			
			report.setSystemInfo("Tester", "Ujjwal");
			report.setSystemInfo("Website", "Flipkart");
			
			htmlReporter.config().setDocumentTitle("Flipkart Basic Test");
			htmlReporter.config().setReportName("TestNG Extent Report");
		}
		return report;
		
	}
	

}
