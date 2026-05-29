package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumFunctionalities.SelUtility;

public class PersonalDetails {
   WebDriver driver;
   SelUtility su;
   
	public PersonalDetails(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
		su=new SelUtility(driver);
	}
	
	@FindBy(xpath="//input[@placeholder='Phone']")
	WebElement Phonenumber;
	public void addMobile(String value) {
		su.insertText(Phonenumber, value);
	}
	
	@FindBy(xpath="//input[@placeholder='Enter email id']")
	WebElement Emailid;
	public void addEmail(String value) {
		su.insertText(Emailid, value);
	}
	
	
	@FindBy(xpath="//input[@id='0_201']")
	WebElement State;
	public void chooseState(String value) {
		su.clickElement(State);
		
		WebElement searchStateElement=driver.findElement(By.xpath("//input[@placeholder='Search for state']"));
		su.waitTime(searchStateElement);
		searchStateElement.sendKeys(value);
		
		List<WebElement> States=driver.findElements(By.xpath("//*[contains(text(),'"+value+"')]"));
		for(WebElement state:States) {
			if(state.isDisplayed()) {
				state.click();
				break;
			}
		}
	}
	
	
	@FindBy(xpath="//input[@placeholder='Enter your Name']")
	WebElement Passenger_name;
	public void Enter_name(String value) {
		su.insertText(Passenger_name, value);
	}
	
	
	@FindBy(xpath="//input[@placeholder='Enter Age']")
	WebElement Passenger_age;
	public void Enter_age(String value) {
		su.insertText(Passenger_age, value);
	}
	
	@FindBy(xpath="//span[text()='Male']/parent::div")
	WebElement Gender;
	public void select_gender() {
		su.clickElement(Gender);
	}
	

	@FindBy(xpath="//button[text()='Continue booking']")
	WebElement Booking_btn;
	public void booking () {
		su.clickElement(Booking_btn);
		su.TakeScreenshot("Personal_Details");
	}
}
