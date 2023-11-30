package test;

import org.testng.annotations.Test;

import Pages.GoogleSearchPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class GoogleSearch_TestNG {

	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	@Test
	public void googleSearch() throws InterruptedException {
		GoogleSearchPage.text_box(driver).sendKeys("page object model");
		Thread.sleep(2000);
		GoogleSearchPage.search_button(driver).sendKeys(Keys.RETURN);
		Thread.sleep(2000);
	}

	@AfterTest
	public void afterTest() {
		driver.close();
		driver.quit();
	}

}
