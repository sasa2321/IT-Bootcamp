package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class About_CollectionPage {

	static WebDriver driver;

	public About_CollectionPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements 20

	// lista contributor-a
	private static List<WebElement> contributorsList() {
		return driver.findElements(By.cssSelector("div.col-sm-5 div.about-box div.items_list.person"));
	}

	// lista grafikona-a (VIEWS, DISCONTINUED VIEWS, ITEMS)
	private static List<WebElement> grafsList() {
		return driver.findElements(By.cssSelector("div.col-sm-5 div.grafs.about-box"));
	}

	// lista related collections-a
	private static List<WebElement> relatedCollectionsList() {
		return driver.findElements(By.cssSelector("div.col-sm-5 div:nth-child(7) div:not(:first-child)"));
	}
	// Tabela Top Regions
		private static List<WebElement> topTableList() {
			return driver.findElements(By.cssSelector("table.stats-table tr"));
		}
}
