package stepdefinations;

import BaseClass.BaseTest;
import Pages.SearchBuses;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RedbusSearchSteps {
	SearchBuses sb= new SearchBuses(BaseTest.driver);
	@Given("the user navigates to the bus booking website homepage")
	public void the_user_navigates_to_the_bus_booking_website_homepage() {
	    
	}
	@When("the user enters a valid origin location in the source field")
	public void the_user_enters_a_valid_origin_location_in_the_source_field() {
	   sb.Source("Asans");
	}
	@When("the user enters a valid destination location in the destination field")
	public void the_user_enters_a_valid_destination_location_in_the_destination_field() {
	    sb.Destination("Esplanade");
	}
	@When("the user selects a valid upcoming travel date from the calendar picker")
	public void the_user_selects_a_valid_upcoming_travel_date_from_the_calendar_picker() {
	    //sb.selectDate("30");
		System.out.println("Default date is chosen");
	}
	@Then("user clicks the Search Buses button")
	public void user_clicks_the_search_buses_button() {
	    sb.Searchbus();
	}
}
