package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumFunctionalities.SelUtility;

public class SelectSeatsWithBoarding {
	WebDriver driver;
	SelUtility su;
    WebDriverWait wait;
   public SelectSeatsWithBoarding(WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver,this);
	   su=new SelUtility(driver);
	   wait = new WebDriverWait(driver, Duration.ofSeconds(10));
   }
   
   
 //click seat as per seatnumber
   public void chooseSeat(String seatNum) {
       String dynamicXpath ="//div[@id='"+seatNum+"']"; 
       
       try {
           WebElement seat = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dynamicXpath)));
           su.clickElement(seat);
           System.out.println("Successfully selected seat: " + seatNum);
       } catch (Exception e) {
           System.err.println("Seat " + seatNum + " is likely already booked or unclickable. Error: " + e.getMessage());
       }
   }
   
   
//  public void chooseSeat(String num) {
//	  String DynamicXpath="//div[@id='"+num+"']";
//	  WebElement Seatnumber= driver.findElement(By.xpath(DynamicXpath));
//	  su.waitTime(Seatnumber);
//	  try {
//		  su.clickElement(Seatnumber);
//	  }catch(Exception e) {
//		  System.out.println("Seat is already booked");
//	  }
//	  
//  }
  
  //clicking the boarding btn
  @FindBy(xpath="//button[@aria-label='Select boarding & dropping points']")
  WebElement Boarding_btn;
  public void Click_Boarding() {
	  su.clickElement(Boarding_btn);
  }
  
  //choosing the boarding location
  @FindBy(xpath="//div[text()='Lower Chelidanga' or text()='Chelidanga']")
  WebElement Boarding;
  public void Board_location() {
	  su.clickElement(Boarding);
  }
  
  //choosing the drop location
  @FindBy(xpath = "//div[text()='Esplande Bus Stand' or text()='Esplanade']")
  WebElement Drop;
  public void Drop_location() {
	  su.clickElement(Drop);
	  su.TakeScreenshot("Seat_Selection");
  }
}
