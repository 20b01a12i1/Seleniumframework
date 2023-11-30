package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSeachPagePOM {

	WebDriver driver=null;
	By text_search = By.id("APjFqb");
	By search_button = By.name("btnK");
	public GoogleSeachPagePOM(WebDriver driver) {
		this.driver=driver;
	}
	
	public void textSearch(String text) {
		driver.findElement(text_search).sendKeys(text);
	}
	
	public void clickbutton() {
		driver.findElement(search_button).sendKeys(Keys.RETURN);
	}
	
}
