package cucum.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucum.resources.*;
import cucumber.api.java.Before;

public class Hook  {
	
	public static WebDriver driver;
	
	@Before
	public void user_should_launch_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-kk\\cucumber\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.tactics.com/account/login");
		
		}
	@Before("@tag2")
	public void taggedhook() {
		System.out.println("searchpage");
		
			}

		

	}

	
	
	
	
	
	
	
		
		
		
	


