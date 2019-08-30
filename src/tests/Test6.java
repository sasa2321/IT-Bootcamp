package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import project.LoginPage;
import project.PageURLs;
import project.Header.NavigationPage;

public class Test6 {
	static WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Sasa Markovic\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void test6() throws Exception {

		driver.navigate().to(PageURLs.ARHIVE_MAIN_PAGE);

		NavigationPage np = new NavigationPage(driver);
		LoginPage lp = new LoginPage(driver);

		np.clicksigninButton();
		Assert.assertTrue(lp.getLoginButton().isDisplayed());
		lp.sendUsername();
		lp.sendPassword();
		lp.clickLoginButton();

		Assert.assertTrue(lp.getErrorAlert().contains("Email address and/or Password incorrect"));
	}
}