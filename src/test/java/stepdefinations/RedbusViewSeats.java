package stepdefinations;

import BaseClass.BaseTest;
import Pages.ViewSeats;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RedbusViewSeats {
	@When("the user clicks on the View Seats option for an available bus")
	public void the_user_clicks_on_the_view_seats_option_for_an_available_bus() {
	    ViewSeats vs = new ViewSeats(BaseTest.driver);
	    vs.ViewSeats();
	}
}
