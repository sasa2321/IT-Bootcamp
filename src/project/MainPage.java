package project;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

	static WebDriver driver;

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements 3
	// Top elements lista
	private static List<WebElement> topElements() {
		return driver.findElements(By.cssSelector("div.item-ia.collection-ia"));
	}

	// lista 9 elemenata web,text,audio,video...collecton.
	private static List<WebElement> internetArhiveList() {
		return driver.findElements(By.cssSelector("center.mt-big a"));
	}

	// search box u internet arhivi
	private static WebElement searchArhiveBox() {
		return driver.findElement(By.name("search"));
	}

	// lista dugmica za search
	private static WebElement searchOptions() {
		return driver.findElement(By.cssSelector("div#search_options"));
	}

	private static WebElement goButton() {
		return driver.findElement(By.cssSelector("button.btn"));
	}

	private static WebElement advancedSearch() {
		return driver.findElement(By.className("div#search_options a"));
	}

	private static WebElement seeMore() {
		return driver.findElement(By.className("div.pull-right a"));
	}

	// Actions
	// get Collections list size
	public int getTopElementSize() {
		return topElements().size();
	}

	public List<String> getTextFromCollections() {
		List<String> listOfText = new ArrayList<String>();
		for (int i = 0; i < topElements().size(); i++) {
			listOfText.add(topElements().get(i)
					.findElement(By.cssSelector("div.item-ia.collection-ia div.num-items.topinblock")).getText());
		}
		return listOfText;
	}

	// click na odredjeni element
	public void clickTopElements(Integer index) {
		topElements().get(index).click();
	}

	// click na odredjeni element
	public void clickInternetArhiveList(Integer index) {
		internetArhiveList().get(index).click();
	}

	//// Na main stranici u search koji se nalazi ispod sarenih ikonica kliknuti i
	//// proveriti da li se javlja padajuci meni
	public void clickSearchArhiveBox() {
		searchArhiveBox().click();
	}

	// uneti string "qa"
	public void sendTextSearchArhiveBox(String searchTerm) {
		searchArhiveBox().sendKeys(searchTerm);
	}

	// kliknuti na GO button
	public void clickGoButton() {
		goButton().click();
	}

	public WebElement getSearchOptions() {
		return searchOptions();
	}

}
