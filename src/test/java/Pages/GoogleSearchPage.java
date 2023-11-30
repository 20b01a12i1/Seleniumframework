package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
	static WebElement element=null;
	public static WebElement text_box(WebDriver driver) {
		element=driver.findElement(By.id("APjFqb"));
		return element;
	}
	public static WebElement search_button(WebDriver driver) {
		element = driver.findElement(By.name("btnK"));
		return element;
	}

}
