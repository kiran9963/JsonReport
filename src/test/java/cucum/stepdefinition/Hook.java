package cucum.stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucum.resources.*;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook  {
	
	
	
	@Before
	public void user_should_launch_browser() {
	System.out.println("before");
		Base.getDriver();
	
	Base.loadurl("https://www.tactics.com/account/login");
	
		
		} 
	
	/*public void addScreenShot(Scenario scenar) {
		if(scenar.isFailed()) {
			System.out.println(scenar);
			TakesScreenshot tk=	(TakesScreenshot)driver;
                    final byte[] screen = tk.getScreenshotAs(OutputType.BYTES);
                    System.out.println(screen);
                    scenar.embed(screen,"img/png");
                    System.out.println(screen);
 		}*/
	
	@After
	public void addScreenShot(Scenario scenario) {
		System.out.println("after");
		if(scenario.isFailed()) {
			System.out.println(scenario);
			 final byte[] screen=((TakesScreenshot)Base.driver).getScreenshotAs(OutputType.BYTES);
                    
                    System.out.println(screen);
                    scenario.embed(screen,"img/png");
                    System.out.println(screen);
		}
	}
	

		

	}

	
	
	
	
	
	
	
		
		
		
	


