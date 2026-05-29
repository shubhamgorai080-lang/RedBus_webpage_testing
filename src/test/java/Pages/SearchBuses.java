package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumFunctionalities.SelUtility;

public class SearchBuses {
   public WebDriver driver;
   SelUtility su;
   
   public SearchBuses(WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver,this);
	   su = new SelUtility(driver);
   }
   
   @FindBy(id="srcinput")
   WebElement Source;
   public void Source(String value) {
	   su.insertText(Source, value);
	   su.implicitwait();
	   List<WebElement> cities = driver.findElements(By.xpath("//*[contains(text(),'Asansol')]"));
	   for(WebElement city:cities) {
		   if(city.isDisplayed()) {
			   city.click();
			   break;
		   }
	   }
   }
   
   
   
   @FindBy(id="destinput")
   WebElement Destination;
   public void Destination(String value) {
	   su.insertText(Destination, value);
	   su.implicitwait();
	   List<WebElement> Cities= driver.findElements(By.xpath("//*[contains(text(),'Esplanade')]"));
	   for(WebElement city:Cities) {
		   if(city.isDisplayed()) {
			   city.click();
			   break;
		   }
	   }
   }
   
   
//   @FindBy(xpath="//div[@role='combobox']")
//   WebElement selectDate;
//   public void selectDate(String value) {
//	   su.clickElement(selectDate);
//	   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    String dynamicXpath = "//div[contains(@aria-label, '" + value + "')]";
//	    
//	  
//	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(dynamicXpath)));
//	        
//	        List<WebElement> dates = driver.findElements(By.xpath(dynamicXpath));
//	        
//	        
//	        for (WebElement date : dates) {
//	            if (date.isDisplayed()) {
//	                date.click();
//	                break;
//	            }
//	        
//	        }
//   }
   
   
   
   @FindBy(xpath="//button[@aria-label='Search buses']")
   WebElement search;
   public void Searchbus() {
	   su.clickElement(search);
	   su.TakeScreenshot("SearchBus");
   }
}
