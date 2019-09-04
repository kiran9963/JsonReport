package cucum.resources;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucum.stepdefinition.Hook;

public class Base  {
	public static WebDriver driver=Hook.driver;
public static WebDriver getDriver() {
	
	return driver;
	
}
public static void loadurl(String url) {
	driver.get(url);

	

}

public static void click(WebElement ele) {
	JavascriptExecutor j= (JavascriptExecutor) driver;
	j.executeScript("arguments[0].click()", ele);
	
}
public static void sendKeys(WebElement ele,String name) {
	ele.sendKeys(name);
}
}