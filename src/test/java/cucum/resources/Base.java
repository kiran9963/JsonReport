package cucum.resources;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucum.stepdefinition.Hook;

public class Base  {
	public static WebDriver driver;
public static WebDriver getDriver() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-kk\\cucumber\\chrome\\chromedriver.exe");
	driver = new ChromeDriver();

	return driver;
	
}
public static void loadurl(String url) {
	driver.get(url);

	

}

public static void clickUsingJavaScript(WebElement ele) {
	JavascriptExecutor j= (JavascriptExecutor) driver;
	j.executeScript("arguments[0].click()", ele);
	
}
public static void click(WebElement ele) {
	ele.click();
	
}
public static void sendKeys(WebElement ele,String name) {
	ele.sendKeys(name);
}
public static void select(WebElement ele,String name) {
	Select s=new Select(ele);
	s.selectByVisibleText(name);
	
	

}
}