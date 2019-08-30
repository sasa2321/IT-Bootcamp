package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelpPage {

	static WebDriver driver;

	public HelpPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements 8

	// Search Bar
	private static WebElement searchBar() {
		return driver.findElement(By.id("query"));
	}

	// dugmici u listu
	private static List<WebElement> elementsBloksList() {
		return driver.findElements(By.cssSelector("ul.blocks-list li"));
	}

	// Sign In link
	private static WebElement linkSingIn() {
		return driver.findElement(By.cssSelector("a.login"));
	}

	// Actions
	// Metode za klik na 4 buttona
	public void clickElementsBloksList(Integer i) {
		elementsBloksList().get(i).click();
	}
	//Metode za sendkeys u Search bar
	public void sendSearchBar() {
		searchBar().sendKeys("radio");
	}
	//Actions metoda za Press ENTER
	public void clickEnterSearchBar() {
		searchBar().sendKeys(Keys.RETURN);
	}
	//Metoda za klik na Sign In link
	public void clickLinkSingIn() {
		linkSingIn().click();
	}
}
