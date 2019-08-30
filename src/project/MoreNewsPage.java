package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoreNewsPage {
	
	static WebDriver driver;
	public MoreNewsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements 13
	
	//Svaki red tabele je jedan objekat, staviti ih u listu
	private static List<WebElement> newsTable() {
		return driver.findElements(By.className("table.table-hover tr"));	
	}
	//mail icon kod News-a
	private static WebElement mailButton() {
		return driver.findElement(By.cssSelector("div.box a:nth-child(1)"));		
	}
	private static WebElement moreButton() {
		return driver.findElement(By.cssSelector("div.box a"));		
	}
}
