package cucum.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucum.resources.Base;

public class CustomerDetails extends Base {
	public CustomerDetails() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="ShipAddress_FirstName")
	private WebElement fname;

	@FindBy(id="ShipAddress_LastName")
	private WebElement lname;
	
	@FindBy(id="ShipAddress_Company")
	private WebElement details;
	
	@FindBy(id="ShipAddress_StreetAddress")
	private WebElement address1;
	
	@FindBy(id="ShipAddress_StreetAddress2")
	private WebElement address2;


	@FindBy(xpath="//input[@id='ShipAddress_City']")
	private WebElement city;
	
	@FindBy(id="ShipAddress_State")
	private WebElement state;
	
	@FindBy(xpath="//input[@id='ShipAddress_Zip']")
	private WebElement code;

	
	@FindBy(id="ShipAddress_Country")
	private WebElement country;
	
	@FindBy(xpath="//input[@id='ShipAddress_Phone']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@id='Pay_CardNumber']")
	private WebElement cardNor;
	
	@FindBy(xpath="//select[@id='Pay_ExpirationMonth']")
	private WebElement cardmnth;
	
	@FindBy(xpath="//select[@id='Pay_ExpirationYear']")
	private WebElement cardyear;
	
	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath="//input[@id='Pay_SecurityCode']")
	private WebElement cardexpire;
	
	@FindBy(xpath="//input[@id='checkout-email']")
	private WebElement email;
	
	@FindBy(xpath="//button[@id='checkout-submit']")
	private WebElement submitorder;
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement password;
	

	public WebElement getSubmitorder() {
		return submitorder;
	}

	public WebElement getCardNor() {
		return cardNor;
	}

	public WebElement getCardmnth() {
		return cardmnth;
	}

	public WebElement getCardyear() {
		return cardyear;
	}

	public WebElement getCardexpire() {
		return cardexpire;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getDetails() {
		return details;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCode() {
		return code;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getPhone() {
		return phone;
	}

	

}
