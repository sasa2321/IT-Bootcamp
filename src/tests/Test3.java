package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import project.MainPage;
import project.PageURLs;
import project.Header.NavigationPage;

public class Test3 {

	static WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Sasa Markovic\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void test3() throws Exception {

		driver.navigate().to(PageURLs.ARHIVE_MAIN_PAGE);

		NavigationPage navp = new NavigationPage(driver);
		MainPage mp = new MainPage(driver);
		navp.clickBox(1);
		Thread.sleep(4000);
		navp.clickHiddenListFeaturedTop(0);
		String urlNum1 = driver.getCurrentUrl();

		driver.navigate().back();
		mp.clickInternetArhiveList(1);
		String urlNum2 = driver.getCurrentUrl();

		Assert.assertTrue(urlNum1.equals(urlNum2));

	}
}