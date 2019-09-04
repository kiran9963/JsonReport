package cucum.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import cucum.objectrepository.SearchPage;
import cucum.resources.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search extends Base{
	
	
	
	/*@Given("User should launch the Browser")
	public void user_should_launch_the_Browser() {
		getDriver();
        launchurl("https://www.tactics.com/account/login");

	}*/

	@When("User Shuould enter the product name")
	public void user_Shuould_enter_the_product_name() {
		
		
		sendKeys(new SearchPage().getText(),"TravellBags");
	}

	@Then("User should click the search button")
	public void user_should_click_the_search_button() {
		SearchPage object =new SearchPage() ;
		WebElement chekcout = object.getClksearchbtn();
		JavascriptExecutor j= (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click()", "checkout");
		
		
			}


}