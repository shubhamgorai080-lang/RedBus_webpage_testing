package TestCases;

import org.testng.annotations.Test;

import BaseClass.BaseTest;
import Pages.SearchBuses;

public class RedbusTest extends BaseTest {
  
	@Test
	public void SearchTest() {
		SearchBuses sb = new SearchBuses(driver);
		sb.Source("Asans");
		sb.Destination("Esplan");
		//sb.selectDate("28");
		sb.Searchbus();
	}
}
