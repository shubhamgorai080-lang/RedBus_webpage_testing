package stepdefinations;

import BaseClass.BaseTest;
import Pages.SelectSeatsWithBoarding;
import io.cucumber.java.en.Then;

public class SeatbookingSteps {
	SelectSeatsWithBoarding SeatSelect = new SelectSeatsWithBoarding(BaseTest.driver); ;
	
	@Then("User select their seat as per their choice")
	public void user_select_their_seat_as_per_their_choice() {
	  SeatSelect.chooseSeat("25");
	  SeatSelect.Click_Boarding();
	}
	
	@Then("User choose boarding and drop Location")
	public void user_choose_boarding_and_drop_location() {
	   SeatSelect.Board_location();
	   SeatSelect.Drop_location();
	}
}
