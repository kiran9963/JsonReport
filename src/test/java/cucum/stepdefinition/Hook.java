package cucum.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucum.resources.*;
import cucumber.api.java.Before;

public class Hook  {
	
	public static WebDriver driver;
	
	@Before
	public void user_should_launch_browser() {
	System.out.println("before");
		Base.getDriver();
	
	Base.loadurl("https://www.tactics.com/account/login");
	
		
		}
	

		

	}

	
	
	
	
	
	
	
		
		
		
	


