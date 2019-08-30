package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import project.MainPage;
import project.PageURLs;


public class Test4 {
	public static final String SEARCH_TERM = "qa";
	public static final String URL_PART = "?query=qa";

	static WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Sasa Markovic\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void test4() throws Exception {

		driver.navigate().to(PageURLs.ARHIVE_MAIN_PAGE);

		MainPage mp = new MainPage(driver);
		mp.clickSearchArhiveBox();
		mp.sendTextSearchArhiveBox(SEARCH_TERM);
		
		Assert.assertTrue(mp.getSearchOptions().isDisplayed());
		
		mp.clickGoButton();
		Thread.sleep(2000);
		String urlName = driver.getCurrentUrl();
		Thread.sleep(2000);
		Assert.assertTrue(urlName.contains(URL_PART));

	}
}
