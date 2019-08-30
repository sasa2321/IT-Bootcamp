package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import project.MainPage;
import project.PageURLs;

public class Test1 {

	public static final String SEARCH_TERM = "ITEMS";

	static WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Sasa Markovic\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void test1() throws Exception {

		driver.navigate().to(PageURLs.ARHIVE_MAIN_PAGE);

		MainPage mp = new MainPage(driver);

		Assert.assertTrue(mp.getTopElementSize() >= 20);
		Thread.sleep(3000);
		for (int i = 0; i < mp.getTextFromCollections().size(); i++) {

			Assert.assertTrue(mp.getTextFromCollections().get(i).contains(SEARCH_TERM));
		}

	}
}