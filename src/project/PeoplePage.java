package project;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PeoplePage {

	static WebDriver driver;

	public PeoplePage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements 12

	// Svi objekti na strani u listu (Ne news)
	private static List<WebElement> elementsPeopleList() {
		return driver.findElements(By.cssSelector("div.bio div"));

	}

	// Actions

	// Metoda za ekstraktovanje imena, prezimena i pozicije svakog ucesnika (to je
	// sve jedan String, tipa Brewster Kahle, Founder & Digital Librarian, Internet
	// Archive). Metoda vraca listu takvih Stringova (

	public List<String> getPeopleListInfo() {

		List<String> infoPeopleList = new ArrayList<String>();
		for (int i = 0; i < elementsPeopleList().size(); i++) {
			String str1 = elementsPeopleList().get(i).findElement(By.cssSelector("b")).getText();
			String str2 = elementsPeopleList().get(i).findElement(By.cssSelector("i")).getText();
			infoPeopleList.add(str1 + " " + str2);
		}
		return infoPeopleList;
	}
}