package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCardTabOnHeader {
		 //variable -private
	 @FindBy (xpath ="//a[@id='nav-cart']")
     private WebElement clickonaddtocardtab;				  
   
	 @FindBy (xpath ="//input[@data-feature-id='proceed-to-checkout-action']")
     private WebElement proccedtobuy;				  
   
	 
	 
	 public AddToCardTabOnHeader(WebDriver driver)
		{
		// To Find Element
		PageFactory.initElements(driver, this);
		
		}
	 
	 public void  clickonaddtocardtab() {
		 clickonaddtocardtab.click();
		}
	 
	 public void  clickonproccedtobuy() {
		 proccedtobuy.click();
		}

	 
	 
	 
}
