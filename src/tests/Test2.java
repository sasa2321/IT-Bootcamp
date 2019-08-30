package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import project.MainPage;
import project.PageURLs;

public class Test2 {

	static WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Sasa Markovic\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void test2() throws Exception {

		driver.navigate().to(PageURLs.ARHIVE_MAIN_PAGE);
		MainPage mn = new MainPage(driver);
		String result1 = driver.findElements(By.cssSelector("div.num-items")).get(0).getText();
		int topResult1 = Integer.parseInt(result1.replaceAll("\\D", ""));
		System.out.println(topResult1);
		mn.clickTopElements(0);

		String result2 = driver.findElement(By.cssSelector("div.results_count")).getText();
		int topResult2 = Integer.parseInt(result2.replaceAll("\\D", ""));
		System.out.println(topResult2);

		Assert.assertTrue(Math.abs(topResult1 - topResult2) <= 400);

	}
}