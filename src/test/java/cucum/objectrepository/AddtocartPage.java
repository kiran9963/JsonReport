package cucum.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucum.resources.Base;

public class AddtocartPage extends Base {
	public AddtocartPage(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//img[@alt='Burton Multipath Carry-On Travel Bag - true black ballistic']")
	
private WebElement clkbag;
	
	@FindBy(name="addtocart")
	
	private WebElement clkaddcart;
	
@FindBy(xpath="(//button[contains(text(),'Checkout')])[1]")
	
	private WebElement clkcheckout;

	public WebElement getClkcheckout() {
	return clkcheckout;
}

	public WebElement getClkbag() {
		return clkbag;
	}

	public WebElement getClkaddcart() {
		return clkaddcart;
	}
	
}
