package SeleniumFunctionalities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelUtility {
	public WebDriver driver;
	
	public SelUtility(WebDriver driver) {
		this.driver=driver;
	}
	
	//add explicit wait time to the element
	public void waitTime(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	//Insert text in the element
	public void insertText(WebElement element, String Value) {
		waitTime(element);
		element.sendKeys(Value);
	}
	
	//Click the element 
	public void clickElement(WebElement element) {
		waitTime(element);
		element.click();
	}
	
	//add implicit wait to the element
	public void implicitwait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	//Takes the screenshot of the output
	public void TakeScreenshot(String Filename) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		File src=ts.getScreenshotAs(OutputType.FILE);
		String path = "src/test/resources/Screenshots/" + Filename + ".png";
	    try {
			FileUtils.copyFile(src, new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
