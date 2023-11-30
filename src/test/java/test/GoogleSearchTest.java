package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSearchPage;

public class GoogleSearchTest {
	private static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		googleSearch();
	}
	
	public static void googleSearch() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		GoogleSearchPage.text_box(driver).sendKeys("page object model");
		Thread.sleep(2000);
		GoogleSearchPage.search_button(driver).sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		driver.close();
		
	}

}
