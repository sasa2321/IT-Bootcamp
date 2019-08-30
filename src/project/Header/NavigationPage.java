package project.Header;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationPage {

	static WebDriver driver;

	public NavigationPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements 1,2

	// sakriven search box
	private static WebElement searchBox() {
		return driver.findElement(By.cssSelector("input#nav-wb-url"));
	}

	// lista slicica 10 kom
	private static List<WebElement> hiddenPics() {
		return driver.findElements(By.cssSelector("div.widgets center.items_list"));
	}

	// lista Features and Top 83 elementa
	private static List<WebElement> hiddenListFeaturedTop() {
		return driver.findElements(By.cssSelector("div.linx a"));
	}

	// prvih 6 elemenata
	private static List<WebElement> elementButtons() {
		return driver.findElements(By.cssSelector("ul.navbar-main li.pull-left"));
	}

	private static WebElement logoButton() {
		return driver.findElement(By.cssSelector("a.navbar-brand"));
	}

	private static WebElement signinButton() {
		return driver.findElement(By.cssSelector("a.nav-user"));
	}
	private static WebElement usernameButton() {
		return driver.findElement(By.id("user-menu"));
	}

	private static WebElement uploadButton() {
		return driver.findElement(By.cssSelector("a.nav-upload"));
	}

	private static WebElement searchBar() {
		return driver.findElement(By.cssSelector("input#search-bar-2"));
	}

	// lista od abouts - people
	private static List<WebElement> navigationsList() {
		return driver.findElements(By.cssSelector("ul#nav-abouts li"));
	}

	// Actions

	// Metoda da se posalje String u skriveni Search
	public void sendTextToSearch(String searchTerm) {
		searchBox().sendKeys(searchTerm);
	}

	// Action metoda da se klikne na Enter
	public void clickEnterSearchBox() {
		searchBox().sendKeys(Keys.RETURN);
	}

	// Akcija da se klikne na kruzne slike
	public void clickHiddenPics(Integer index) {
		hiddenPics().get(index).click();
	}

	// Metoda za klik i-tog linka (linkovi pored kruznih slika)
	public void clickHiddenListFeaturedTop(Integer index) {
		hiddenListFeaturedTop().get(index).click();
	}

	// Metoda koja ce moci da klikne na bilo koji element iz navigacionog menija
	public void clickBox(Integer index) {
		elementButtons().get(index).click();
	}
	//Klik na logo
	public void clickLogoButton() {
		logoButton().click();
	}
	//Metoda da se klikne na Upload link
	public void clickUploadButton() {
		uploadButton().click();
	}
	//klik na Sign up link (korisnik nije ulogovan)
	public void clicksigninButton() {
		signinButton().click();
	}
	//click on username (korisnik ulogovan)
	public void clickUsernameButton() {
		usernameButton().click();
	}
	//Metoda za klik na Search bar pored Upload-a
	public void clickSearchBar() {
		searchBar().click();
	}
	//click metoda za sendkeys u isti Search
	public void sendTextToSearchBar(String searchTerm) {
		searchBar().sendKeys(searchTerm);
	}
	
}