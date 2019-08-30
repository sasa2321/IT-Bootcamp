package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FeedSubjectPage {

	static WebDriver driver;
	public FeedSubjectPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements 14
	private static List<WebElement> feedSubject() {
		return driver.findElements(By.cssSelector("div.box.well.well-sm a"));	
	}
	
}
