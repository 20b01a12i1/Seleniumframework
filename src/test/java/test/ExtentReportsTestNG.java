package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReportsTestNG {

	ExtentSparkReporter extentReporter;
	ExtentReports extent;
	WebDriver driver;
	@BeforeSuite
	public void setUp() {
		extentReporter = new ExtentSparkReporter("ReportFileTestNG.html");
		extent = new ExtentReports();
		extent.attachReporter(extentReporter);
	}
	
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void test() {

		ExtentTest test1= extent.createTest("Google search Test one", "To test the functionality of google.com");
		test1.log(Status.INFO, "Info of the testcase1");
		test1.pass("test case 1 Passed successfully!!");

	}
	
	@Test
	public void test2() {

		ExtentTest test3= extent.createTest("Google search Test one", "TestNG");
		test3.log(Status.INFO, "Info of the testcase2");
		test3.pass("test case 2 Passed successfully!!");
	}
	
	@AfterTest
	public void afterTest() {
		driver.close();
		driver.quit();
		System.out.println("Test case completed!");
	}
	
	@AfterSuite
	public void teardown() {
		extent.flush();
	}
}
