package LoginTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Base.BaseUI;
import Utils.ExtentReportsManager;

public class LoginTest extends BaseUI {
	
	
	
	ExtentReports report = ExtentReportsManager.getReportInstance();

	@Test
	public void testOne() throws Exception {
		ExtentTest logger = report.createTest("test all tests");
		invokeBrowser("chrome");
		goToURL("url");
		Thread.sleep(5000);
		logger.log(Status.PASS, "loaded website");
		
		driver.close();
		
	}



	@AfterMethod
	public void endReport() {
		report.flush();
	}
	
	@Test
	public void testTwo() {
		System.out.println("two");
	}
	
	@Test
	public void testThree() {
		System.out.println("three");

	}
	
}
