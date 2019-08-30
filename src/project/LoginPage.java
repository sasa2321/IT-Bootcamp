package project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BC {

	static WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Elements 15
	// LOGIN strana - svi elementi

	private static WebElement usernameBox() {
		return driver.findElement(By.name("username"));
	}

	private static WebElement passwordBox() {
		return driver.findElement(By.name("password"));
	}

	private static WebElement loginButton() {
		return driver.findElement(By.name("submit-to-login"));
	}

	private static WebElement errorAlert() {
		return driver.findElement(By.cssSelector("span.login-error.password-error"));

	}

	private static WebElement forgetPassword() {
		return driver.findElement(By.cssSelector("div.password-message a"));
	}

	private static WebElement singUpForFree() {
		return driver.findElement(By.cssSelector("section.login-header.text-center a"));
	}

	private static WebElement termsOfService() {
		return driver.findElement(By.cssSelector("fieldset:nth-child(8) div a"));
	}

	// Actions

	// Metoda za sendkeys username
	public void sendUsername() {
		usernameBox().sendKeys("foo@gmail.com");
	}

	// Metoda za sendkeys password
	public void sendPassword() {
		passwordBox().sendKeys("bar");
	}

	// Metoda za klik na SignIn ili Login Button
	public void clickLoginButton() {
		loginButton().click();
	}

	public WebElement getLoginButton() {
		return loginButton();
	}

	public String getErrorAlert() {
		visibilityOf(errorAlert());
		return errorAlert().getText();
	}

	public WebElement getForgetPassword() {
		visibilityOf(forgetPassword());
		return forgetPassword();
	}

	public void clickSingUpForFree() {
		singUpForFree().click();
	}

	public void clickTermsOfService() {
		termsOfService().click();
	}

	public String getChildWindow() {
		Set<String> window = driver.getWindowHandles();
		Iterator iterator = window.iterator();
		String currentWindowId = null;
		String mainPage = driver.getWindowHandle();
		while (iterator.hasNext()) {
			currentWindowId = iterator.next().toString();
			// Takes the url from child window
			if (!currentWindowId.equals(mainPage)) {
				driver.switchTo().window(currentWindowId);
			}
		}
		return driver.getCurrentUrl();
	}
}
