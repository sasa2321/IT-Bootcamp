package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JobsPage {

	static WebDriver driver;

	public JobsPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements 10

	// Search Bar
	private static WebElement searchBar3() {
		return driver.findElement(By.id("q"));
	}

	// Search Button
	private static WebElement searchButton3() {
		return driver.findElement(By.id("btn_search_jobs"));
	}

	// advanced Link
	private static WebElement linkAdvanced() {
		return driver.findElement(By.id("link_show_advanced_search"));
	}

	// Generated list elements
	private static List<WebElement> elementsGeneratedList() {
		return driver.findElements(By.cssSelector("table#jobs_table tr"));

	}

	// Actions

	// Metoda za brojanje pronadjenih elemenata iz liste objekata
	public int getSizeelementsGeneratedList() {
		return elementsGeneratedList().size();
	}

	// Metoda za sendkeys u Search Bar
	public void sendTextToSearchBar3(String searchTerm) {
		searchBar3().sendKeys(searchTerm);
	}
	//Metoda za klik na Search button
	public void clickSearchButton3() {
		searchButton3().click();
	}
}
