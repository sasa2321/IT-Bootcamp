package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadPage {

	static WebDriver driver;
	public UploadPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// Elements 16
	
	//2 Upload buttona
	private static WebElement uploadFilesButton() {
		return driver.findElement(By.cssSelector("a.buttonG.btn.btn-success"));	
	}
	private static WebElement uploaderLiveMusicButton() {
		return driver.findElement(By.cssSelector("a.btn.btn-primary"));	
	}
	//Klikabilni znak pitanja
	private static WebElement qustButton() {
		return driver.findElement(By.cssSelector("a.stealth"));	
	}
	private static WebElement textLoginSingup() {
		return driver.findElement(By.cssSelector("div.container p:nth-child(1) b:nth-child(5)"));	
	}
	
	//Actions
	
	//
	public String getTextLoginSingup() {
		return textLoginSingup().getText();
}
}
