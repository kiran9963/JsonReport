package cucum.stepdefinition;

import cucum.objectrepository.AddtocartPage;
import cucum.resources.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddtoCart extends Base {
	
	
	/*@Given("User Should launch the Browser")
	public void user_Shpould_launch_the_Browser() {
	    getDriver();
	    launchurl("https://www.tactics.com/account/login");
	}*/

	@When("User should click the Travell bag")
	public void user_should_click_the_Travell_bag() {
		
		AddtocartPage add=new AddtocartPage();
		click(add.getClkbag());
	   
	}
	
	@When("User should click the  ADD to cart button")
	public void user_should_click_the_ADD_to_cart_button() {
		AddtocartPage add=new AddtocartPage();
		click(add.getClkaddcart());
	}
	@Then("User should click checkout")
	public void user_should_click_checkout() {
		AddtocartPage add=new AddtocartPage();
		click(add.getClkcheckout());
	}


} 
