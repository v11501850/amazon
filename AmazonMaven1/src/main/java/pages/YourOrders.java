package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourOrders {
			 //variable -private
			 @FindBy (xpath ="//a[@id='nav-link-accountList']")
		        private WebElement clickonAccountandList;	
			 
			 @FindBy (xpath ="//div[@data-card-identifier='YourOrders']")
			    private WebElement clickonYourOrder;	
			
			 @FindBy (xpath ="//a[text()='Cancelled Orders']")
			    private WebElement clickoncancelledorder;
			 
			 
			 
			 public YourOrders(WebDriver driver)
				{
				// To Find Element
				PageFactory.initElements(driver, this);
				
				}
			 
			 public void  clickonAccountandList() {
				 clickonAccountandList.click();
				} 
			
			 public void  clickonYourOrder() {
				 clickonYourOrder.click();
				} 
			
			 public void  clickoncancelledorder() {
				 clickoncancelledorder.click();
				} 
			 
			 
			 
}
