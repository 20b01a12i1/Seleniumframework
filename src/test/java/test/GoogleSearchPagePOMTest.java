package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.GoogleSeachPagePOM;

public class GoogleSearchPagePOMTest {
	
	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		googleSearch();
	}
	public static void googleSearch() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		GoogleSeachPagePOM googlesearchpage = new GoogleSeachPagePOM(driver);
		googlesearchpage.textSearch("hello world");
		Thread.sleep(3000);
		googlesearchpage.clickbutton();
		Thread.sleep(3000);
		driver.close();
	}
}
