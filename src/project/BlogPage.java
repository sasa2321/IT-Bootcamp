package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BlogPage {

static WebDriver driver;
	
	public BlogPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements 6
	
	//elementi navigacionog menija 8 kom
	private static List<WebElement> elementsNavigationMenu() {
		return driver.findElements(By.cssSelector("div#access li"));
	}
	//slicice za Facebook i Twiter
	private static List<WebElement> elementsFaceTwitter() {
		return driver.findElements(By.cssSelector("div.archive-sharing-widget img"));
	}
	//Archives dropdown
	private static WebElement elementsArhivesDrop() {
		return driver.findElement(By.cssSelector("select#archives-dropdown-2"));
	}
	//Search field
		private static WebElement elementSearchField() {
			return driver.findElement(By.cssSelector("input#s"));
	}
	//Search button
		private static WebElement elementSearchButton() {
			return driver.findElement(By.cssSelector("input#searchsubmit"));
	}
	//Elementi koji se generisu dinamicki kada se odradi search u listu
		private static List<WebElement> elementsDynamicSearch() {
			return driver.findElements(By.cssSelector("div#content a"));
	}
		
	//Actions
		//Metoda za klik na Facebook
		public void clickFacebookElement() {
			elementsFaceTwitter().get(0).click();
		}
		//Metoda za klik na Tweeter
		public void clickTweeterElement() {
			elementsFaceTwitter().get(1).click();
		}
		//Metoda za sendkeys za Search bar
		public void sendElementSearchField() {
			elementSearchField().sendKeys("test");
		}
		//Metoda za klik na Search Button
		public void clickElementSearchField() {
			elementSearchButton().click();
		}
		//Metoda za manipulaciju Select dropdown-om
		public void selectElementsArhivesDrop(Integer i) {
			Select dropDate = new Select(elementsArhivesDrop());
			dropDate.selectByIndex(i);
		}
}


