package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactPage {
	static WebDriver driver;

	public ContactPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements 5

	// elementi Mape iz ContactPage
	private static List<WebElement> elementsMaps() {
		return driver.findElements(By.cssSelector("div.col-md-9 img"));
	}

	// Actions
	// Metoda za klik na sliku mape
	public void clickElementMaps() {
		elementsMaps().get(0).click();
	}
}
