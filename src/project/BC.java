package project;

import java.util.List;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BC {
	
	static WebDriver driver;
	public BC(WebDriver d) {
		driver = d;
	}

	public WebDriverWait waiter() {
	       WebDriverWait wait = new WebDriverWait(driver, 30, 500);
	       return wait;
	   }
	   public void elementToAppear(By locator) {
	       waiter().until(ExpectedConditions.visibilityOfElementLocated(locator));
	   }
	   public void elementToAppear(WebElement element) {
	       waiter().until(ExpectedConditions.visibilityOf(element));
	   }
	   public void elementToAppear(By locator, By locator2) {
	       waiter().until(ExpectedConditions.and(
	               ExpectedConditions.visibilityOfElementLocated(locator),
	               ExpectedConditions.visibilityOfElementLocated(locator2)));
	   }
	   public void elementToAppear(WebElement element, WebElement element2) {
	       waiter().until(ExpectedConditions.and(
	               ExpectedConditions.visibilityOf(element),
	               ExpectedConditions.visibilityOf(element2)));
	   }
	   public void elementToAppear(By locator, By locator2, By locator3) {
	       waiter().until(ExpectedConditions.and(
	               ExpectedConditions.visibilityOfElementLocated(locator),
	               ExpectedConditions.visibilityOfElementLocated(locator2),
	               ExpectedConditions.visibilityOfElementLocated(locator3)));
	   }
	   public void elementToBeClickable(By locator) {
	       waiter().until(ExpectedConditions.elementToBeClickable(locator));
	   }
	   public void urlToContain(String url) {
	       waiter().until(ExpectedConditions.urlContains(url));
	   }
	   public void visibilityOfElements(List<WebElement> elements) {
		   waiter().until(ExpectedConditions.visibilityOfAllElements(elements));
	   }
	   public void attributeContains(WebElement locator, String attribute, String value) {
		   waiter().until(ExpectedConditions.attributeContains(locator, attribute, value));
	   }
	   public void attributeContains(By locator, String attribute, String value) {
		waiter().until(ExpectedConditions.attributeContains(locator, attribute, value));
	   }
	   public void attributeToBe(By locator, String attribute, String value) {
		   waiter().until(ExpectedConditions.attributeToBe(locator, attribute, value));
	   }
	   public void attributeToBe(WebElement element, String attribute, String value) {
		   waiter().until(ExpectedConditions.attributeToBe(element, attribute, value));
	   }
	   
	   public void attributeToBeNotEmpty(WebElement element,String attribute) {
		   waiter().until(ExpectedConditions.attributeToBeNotEmpty(element, attribute));
	   }
	   public void elementSelectionStateToBe(By locator, boolean selected)  {
		   waiter().until(ExpectedConditions.elementSelectionStateToBe(locator, selected));
	   }
	   public void visibilityOfElement(WebElement element) {
		   waiter().until(ExpectedConditions.visibilityOf(element));
	   }
	   
	   public void elementSelectionStateToBe(WebElement element, boolean selected) {
		   waiter().until(ExpectedConditions.elementSelectionStateToBe(element, selected));
	   }
	   
	   public void elementToBeClickable(WebElement element){
		   waiter().until(ExpectedConditions.elementToBeClickable(element));
	   }
	   
	   public void elementToBeSelected(By locator) {
		   waiter().until(ExpectedConditions.elementToBeSelected(locator));
	   }
	   
	   public void elementToBeSelected(WebElement element){
		   waiter().until(ExpectedConditions.elementToBeSelected(element));
	   }
	   public void frameToBeAvailableAndSwitchToIt(By locator){
		   waiter().until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
	   }
	   public void frameToBeAvailableAndSwitchToIt(int frameLocator){
		   waiter().until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	   }
	   public void 	frameToBeAvailableAndSwitchToIt(String frameLocator){
		   waiter().until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	   }
	   public void frameToBeAvailableAndSwitchToIt(WebElement frameLocator){
		   waiter().until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	   }
	   public void invisibilityOf(WebElement element){
		   waiter().until(ExpectedConditions.invisibilityOf(element));
	   }
	   public void 	invisibilityOfAllElements(List<WebElement> elements){
		   waiter().until(ExpectedConditions.invisibilityOfAllElements(elements));
	   }
	   public void invisibilityOfElementLocated(By locator){
		   waiter().until(ExpectedConditions.invisibilityOfElementLocated( locator));
	   }
	   public void invisibilityOfElementWithText(By locator, String text){
		   waiter().until(ExpectedConditions.invisibilityOfElementWithText( locator, text));
	   }
	   public void javaScriptThrowsNoExceptions(String javaScript){
		   waiter().until(ExpectedConditions.javaScriptThrowsNoExceptions(javaScript));
	   }
	   public void jsReturnsValue(String javaScript){
		   waiter().until(ExpectedConditions.jsReturnsValue( javaScript));
	   }
	   public void not(ExpectedCondition<?> condition){
		   waiter().until(ExpectedConditions.not(condition));
	   }
	   public void numberOfElementsToBe(By locator,Integer number){
		   waiter().until(ExpectedConditions.numberOfElementsToBe( locator, number));
	   }
	   public void numberOfElementsToBeLessThan(By locator, Integer number){
		   waiter().until(ExpectedConditions.numberOfElementsToBeLessThan(locator, number));
	   }
	   public void numberOfElementsToBeMoreThan(By locator,Integer number){
		   waiter().until(ExpectedConditions.numberOfElementsToBeMoreThan(locator, number));
	   }
	   public void numberOfWindowsToBe(int a) {
		   waiter().until(ExpectedConditions.numberOfWindowsToBe(a));
	   }
	   public void or(ExpectedCondition<?>... conditions){
		   waiter().until(ExpectedConditions.or(conditions));
	   }
	   public void presenceOfAllElementsLocatedBy(By locator){
		   waiter().until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	   }
	   public void presenceOfElementLocated(By locator){
		   waiter().until(ExpectedConditions.presenceOfElementLocated( locator));
	   }
	   public void presenceOfNestedElementLocatedBy(By locator, By childLocator){
		   waiter().until(ExpectedConditions.presenceOfNestedElementLocatedBy( locator,  childLocator));
	   }
	   public void presenceOfNestedElementLocatedBy(WebElement element, By childLocator){
		   waiter().until(ExpectedConditions.presenceOfNestedElementLocatedBy( element,  childLocator));
	   }
	   public void presenceOfNestedElementsLocatedBy(By parent, By childLocator){
		   waiter().until(ExpectedConditions.presenceOfNestedElementsLocatedBy( parent,  childLocator));
	   }
	   public void stalenessOf(WebElement element){
		   waiter().until(ExpectedConditions.stalenessOf( element));
	   }
	   public void textMatches(By locator, Pattern pattern){
		   waiter().until(ExpectedConditions.textMatches( locator, pattern));
	   }
	   public void textToBe(By locator, String value){
		   waiter().until(ExpectedConditions.textToBe( locator, value));
	   }
	   public void textToBePresentInElement(WebElement element, String text){
		   waiter().until(ExpectedConditions.textToBePresentInElement( element, text));
	   }
	   public void textToBePresentInElementLocated(By locator, String text){
		   waiter().until(ExpectedConditions.textToBePresentInElementLocated( locator, text));
	   }
	   public void textToBePresentInElementValue(By locator, String text){
		   waiter().until(ExpectedConditions.textToBePresentInElementValue( locator, text));
	   }
	   public void textToBePresentInElementValue(WebElement element, String text){
		   waiter().until(ExpectedConditions.textToBePresentInElementValue( element, text));
	   }
	   
	   public void titleContains(String title){
		   waiter().until(ExpectedConditions.titleContains( title));
	   }
	   public void titleIs(String title){
		   waiter().until(ExpectedConditions.titleIs( title));
	   }
	   public void urlContains(String fraction){
		   waiter().until(ExpectedConditions.urlContains(fraction));
	   }
	   public void urlMatches(String regex){
		   waiter().until(ExpectedConditions.urlMatches( regex));
	   }
	   public void urlToBe(String url){
		   waiter().until(ExpectedConditions.urlToBe(url));
	   }
	   
	   public void 	visibilityOf(WebElement element){
		   waiter().until(ExpectedConditions.visibilityOf( element));
	   }
	   
	   public void visibilityOfAllElements(List<WebElement> elements){
		   waiter().until(ExpectedConditions.visibilityOfAllElements(elements));
	   }
	   
	   public void visibilityOfAllElements(WebElement... elements){
		   waiter().until(ExpectedConditions.visibilityOfAllElements(elements));
	   }
	   
	   public void visibilityOfAllElementsLocatedBy(By locator){
		   waiter().until(ExpectedConditions.visibilityOfAllElementsLocatedBy( locator));
	   }
	   public void visibilityOfElementLocated(By locator){
		   waiter().until(ExpectedConditions.visibilityOfElementLocated( locator));
	   }
	   public void visibilityOfNestedElementsLocatedBy(By parent, By childLocator){
		   waiter().until(ExpectedConditions.visibilityOfNestedElementsLocatedBy( parent,  childLocator));
	   }
	   public void visibilityOfNestedElementsLocatedBy(WebElement element, By childLocator){
		   waiter().until(ExpectedConditions.visibilityOfNestedElementsLocatedBy( element,  childLocator));
	   }
	   public void alertIsPresent() {
		   waiter().until(ExpectedConditions.alertIsPresent());
	   }
	   public void and(ExpectedCondition<?>... conditions) {
		   waiter().until(ExpectedConditions.and(conditions));
	   }
	   
	   
}


