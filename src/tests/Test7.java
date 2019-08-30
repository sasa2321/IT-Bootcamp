package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import project.LoginPage;
import project.PageURLs;
import project.Header.NavigationPage;

public class Test7 {
	public static final String URL_PART = "terms";

	static WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Sasa Markovic\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void test7() throws Exception {

		driver.navigate().to(PageURLs.ARHIVE_MAIN_PAGE);

		NavigationPage np = new NavigationPage(driver);
		LoginPage lp = new LoginPage(driver);

		np.clicksigninButton();
		Assert.assertTrue(lp.getForgetPassword().isDisplayed());

		lp.clickSingUpForFree();
		lp.clickTermsOfService();

		//Thread.sleep(3000);
		System.out.println(lp.getChildWindow());
		Assert.assertTrue(driver.getCurrentUrl().contains(URL_PART));

	}
}