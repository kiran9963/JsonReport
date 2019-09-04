package cucum.objectrepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucum.resources.Base;

public class SearchPage extends Base {
	public SearchPage() {
		
	PageFactory.initElements(driver, this);
	}
	/*static SearchPage sp = null;
	public static SearchPage getObject() {
		if(sp==null) {
			 sp = new SearchPage();
		}
		return sp;
	}*/
		@FindBy(id="header-desktop-search-input")

		 private WebElement text;

  @FindBy(className="header-desktop-search-button")
  
  private WebElement clksearchbtn;

public WebElement getText() {
	
	return text;
}



public WebElement getClksearchbtn() {
	return clksearchbtn;
}
  
  
  }
