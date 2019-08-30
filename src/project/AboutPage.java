package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutPage {

	static WebDriver driver;

	public AboutPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements 4

	// elementi iz News-a da se pokupe u listu zajedno sa More linkom pored NEWS
	// labele
	private static List<WebElement> elementsNewsMore() {
		return driver.findElements(By.cssSelector("tr.forumRow a"));
	}

	// Metoda za klik na More opciju
	private static WebElement moreButton() {
		return driver.findElement(By.cssSelector("div.box a font"));
	}
	
	//Actions
	// Metoda za brojanje elemenata niza
	public int getSizeNewsMore() {
		return elementsNewsMore().size();
	}

	// klik na More opciju
	public void clickMoreButton() {
		moreButton().click();
	}

}