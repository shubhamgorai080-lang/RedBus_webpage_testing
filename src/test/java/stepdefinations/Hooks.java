package stepdefinations;

import org.openqa.selenium.chrome.ChromeDriver;


import BaseClass.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
	public void setup() {
		BaseTest.driver= new ChromeDriver();
		BaseTest.driver.manage().window().maximize();
		BaseTest.driver.get("https://www.redbus.in/");
	}
	
   @After
	public void tearUp() {
		BaseTest.driver.quit();
	}
}
