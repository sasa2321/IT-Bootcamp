package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CollectionPage {

	static WebDriver driver;

	public CollectionPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements 19

	// sortiranje (VIEWS, TITLE, DATE ARCHIVED, CREATOR) + 2 hidden objekta
	private static List<WebElement> sortList() {
		return driver.findElements(By.cssSelector("div.topinblock a:not(.hidden)"));
	}

	// objekte koji sadrze radio buttone 2kom na vrhu
	// private static List<WebElement> radioList() {
	// return driver.findElements(By.cssSelector("div.columns-facets
	// div.search-options input"));
	// }

	// video blok rezultati
	private static List<WebElement> videoBlockList() {
		return driver.findElements(By.cssSelector("div#ikind--downloads div.item-ia"));
	}

	// broj video klipova sa vrha stranice
	private static WebElement numvideoResults() {
	return driver.findElement(By.cssSelector("div.results_count"));
	}

	// objekti koji sadrze radio buttone,brojeve klipova i More linkove (Media type,
	// Year, Topics and Subjects, Collection, Creator, Language)
	private static List<WebElement> btnNumVidMoreList() {
		return driver.findElements(By.cssSelector("div.columns-facets div.collapse div.collapse"));
	}

	// Search this collection bar
	private static WebElement searchThisCollectionBar() {
		return driver.findElement(By.name("and[]"));
	}

	// Play opcije (Share, Favorite, RSS, Play All)
	private static List<WebElement> playOptionsList() {
		return driver.findElements(By.cssSelector("div.col-xs-1.col-sm-2.welcome-right *:not(div):not(br)"));
	}
}
