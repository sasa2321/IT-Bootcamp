package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DonatePage {

	static WebDriver driver;

	public DonatePage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements 9

	// Dugmici sa novcanim iznosima i Other amount
	private static List<WebElement> elementsAmountList() {
		return driver.findElements(By.cssSelector("ul.donation-radio-list.donationlevel li"));
	}

	// Other amount
	private static WebElement otherAmount() {
		return driver.findElement(By.cssSelector("input#amount_custom"));
	}

	// Actions
	
	
	// Metoda za klik na neki od donate opcija
	public void clickElementsAmountList(Integer i) {
		elementsAmountList().get(i).click();
	}

	// Metoda za slanje custom iznosa u zadnje polje
	public void sendOtherAmount() {
		otherAmount().sendKeys("56");
	}
}
