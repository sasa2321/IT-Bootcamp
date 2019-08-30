package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectPage {

	static WebDriver driver;

	public ProjectPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements 7

	// svi projekti sa stranice slicice i text
	private static List<WebElement> elementsProject() {
		return driver.findElements(By.cssSelector("div.col-md-9 div.row.xxx div"));
	}

	// Actions
	// Metoda koja vraca broj elemenata liste objekata - Internet Archive Projekata
	public int getSizeElementProject() {
		return elementsProject().size();
	}
}