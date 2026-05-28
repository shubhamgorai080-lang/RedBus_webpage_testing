package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumFunctionalities.SelUtility;

public class ViewSeats {
 public WebDriver driver;
 SelUtility su;
 
 public ViewSeats(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements( driver,this);
	 
	 su=new SelUtility(driver);
 }
 
 //To check that seats are visible
 @FindBy(xpath="(//button[text()='View seats'])[1]")
 WebElement viewSeats;
 public void ViewSeats() {
	 su.waitTime(viewSeats);
	 su.clickElement(viewSeats);
	 su.TakeScreenshot("View_Seats");
 }
}
