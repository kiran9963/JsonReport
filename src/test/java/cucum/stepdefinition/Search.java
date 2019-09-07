package cucum.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import cucum.objectrepository.AddtocartPage;
import cucum.objectrepository.CustomerDetails;
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

	@When("User should click the search button")
	public void user_should_click_the_search_button() {
		SearchPage object =new SearchPage() ;
	   click(object.getClksearchbtn());
		
	}
	// click the Addcart butoon
		
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
	@When("User should click checkout")
	public void user_should_click_checkout() {
		AddtocartPage add=new AddtocartPage();
		clickUsingJavaScript(add.getClkcheckout());
		
	//customer Details form	
	}
	@When("User Should provide details in form")
	public void user_should_provide_details_in_form() {
		 CustomerDetails cd=new  CustomerDetails();
		 sendKeys(cd.getFname(), "kranti");
		 sendKeys(cd.getLname(), "kiran");
		 sendKeys(cd.getDetails(), "kkgroups");
		 sendKeys(cd.getAddress1(), "sipkot");
		 sendKeys(cd.getAddress2(), "sipkot");
		 sendKeys(cd.getCity(), "chennai");
		 sendKeys(cd.getState(), "Newjersy");
		  sendKeys(cd.getCode(),"603103");
		 select(cd.getCountry(),"Mexico");
		 sendKeys(cd.getPhone(), "9885398386");
		 sendKeys(cd.getCardNor(), "0540827683356411");
		 select(cd.getCardmnth(), "05-May");
		 select(cd.getCardyear(), "2025");
		 sendKeys(cd.getCardexpire(), "010");
		 sendKeys(cd.getEmail(), "krantikiran@gmail.com");
		 sendKeys(cd.getPassword(),"kranti123456789");
		 clickUsingJavaScript(cd.getSubmitorder());
	
	
		
	}		


}