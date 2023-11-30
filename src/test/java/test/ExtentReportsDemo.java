package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsDemo {
	static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		ExtentSparkReporter extentReporter = new ExtentSparkReporter("ReportFile.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(extentReporter);
		
		ExtentTest test1= extent.createTest("Google search Test one", "To test the functionality of google.com");
		driver = new ChromeDriver();
		
		test1.info("Started testing");
		driver.get("https://www.google.com/");
		
		driver.findElement(By.id("APjFqb")).sendKeys("Automation");
		test1.pass("given chars to textbox");
//		Thread.sleep(2000);
		
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test1.pass("clicked button");
//		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
		test1.pass("closed the browser");
		
		test1.info("Test Completed");
		
//		calling flush writes everything to log files
		extent.flush();

	}

}
