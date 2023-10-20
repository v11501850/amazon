package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCardProduct {

	    //variable -private
//	   @FindBy (xpath ="//div[@id='search']")
//       private WebElement scrollintoifram;
      
	   @FindBy (xpath ="//div[@data-component-id='19']")
       private WebElement clickonPen;
	   
	   @FindBy (xpath ="//input[@id='add-to-cart-button']")
       private WebElement addtocardpen;
    
       //Constructor- public
       // private WebDriver driver;
        private JavascriptExecutor js;
  		
        public AddtoCardProduct(WebDriver driver)
  		{
  		// To Find Element
  		PageFactory.initElements(driver, this);
  		//this.driver = driver;
  		js = (JavascriptExecutor)driver;
  		}
  		
  		
  		//Method -public
  		
//  		public void  scrollintoifram() {
//  			js.executeScript("argument[0].scrollIntoView(true)",scrollintoifram);
//  			js.executeScript("window.scrollBy(0,400)");
//  			//scrollintoifram.click();
  			
 // 		}
  		
  		public void  clickonpen() {
  			js.executeScript("argument[0].scrollIntoView(true)",clickonPen);
  			clickonPen.click();
		}
		
  		public void  addtocardpen() {
  			js.executeScript("argument[0].scrollIntoView(true)",clickonPen);
  			addtocardpen.click();
		}
		
    
    
    
    
    
    
    
    
    
    
    
    
    
}
