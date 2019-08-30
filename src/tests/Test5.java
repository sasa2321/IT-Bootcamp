package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import project.MainPage;
import project.PageURLs;
import project.UploadPage;
import project.Header.NavigationPage;

public class Test5 {

	static WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Sasa Markovic\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void test5() throws Exception {

		driver.navigate().to(PageURLs.ARHIVE_MAIN_PAGE);
		NavigationPage np = new NavigationPage(driver);
		UploadPage up = new UploadPage(driver);

		np.clickUploadButton();

		Assert.assertTrue(up.getTextLoginSingup().contains("Log in or Sign up"));

	}
}