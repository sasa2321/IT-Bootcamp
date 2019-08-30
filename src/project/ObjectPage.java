package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectPage {

	static WebDriver driver;
	public ObjectPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements 18
	//Staviti sve objekte u POM listu
	private static List<WebElement> resultList() {
		return driver.findElements(By.cssSelector("ul.result-list li"));	
	}
}
