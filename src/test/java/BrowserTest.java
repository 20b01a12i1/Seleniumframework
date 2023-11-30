import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
		
//		WebDriver driver=new FirefoxDriver();
//		WebDriver web=new InternetExplorerDriver();
//		web.get("https://www.seleniumhq.org/");
//		driver.get("https://20b01a12i1.github.io/PortFolio/");
		
		
		
//		webdriver automation
		WebDriverManager.chromedriver().setup();
		WebDriver web=new ChromeDriver();
//		these two lines will get rid of downloading .exe file make process automation
//		web.get("https://www.seleniumhq.org/");
//		web.close();
//		web.quit();

		
//		web element locators
		web.get("https://www.google.com/");
		WebElement textbox= web.findElement(By.id("APjFqb"));
		textbox.sendKeys("email");
//		or use this single line
//		web.findElement(By.tagName("textarea")).sendKeys("hello");

		Thread.sleep(3000);

	}
}
