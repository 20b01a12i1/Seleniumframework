package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirstTest {
	public static void main(String[] args) throws InterruptedException {
		googleSearch();
	}
	public static void googleSearch() throws InterruptedException {
		
//		System.setProperty("webdriver.chrome.driver", "C:/Users/varik/Downloads/chromedriver_win32/chromedriver.exe");
		
//		to remove socket not found exception
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(ChromeOptions.CAPABILITY, co);
		dc.merge(co);
		
		WebDriver driver = new ChromeDriver(co);
//		open google and give keys in search bar
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Automation step by step");
//		click the search button
//		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		WebElement but=driver.findElement(By.name("btnK"));
		Thread.sleep(2000);
		but.click();
		Thread.sleep(2000);
//		close the browser
		driver.close();
		System.out.println("Tested successfully!!");
		
	}
}
