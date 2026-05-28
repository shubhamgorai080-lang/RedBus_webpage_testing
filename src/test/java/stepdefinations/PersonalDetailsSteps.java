package stepdefinations;

import BaseClass.BaseTest;
import Pages.PersonalDetails;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PersonalDetailsSteps {
	PersonalDetails pd = new PersonalDetails(BaseTest.driver);
	@When("User enter their Phone Number in mobile field")
	public void user_enter_their_phone_number_in_mobile_field() {
	    pd.addMobile("9933414170");
	}
	@When("User enter their email Id in email field")
	public void user_enter_their_email_id_in_email_field() {
	    pd.addEmail("sg321@gmail.com");
	}
	@When("User Choose their Current location State")
	public void user_choose_their_current_location_state() {
	    pd.chooseState("Jharkhand");
	}
	@When("User Enter their Name Age")
	public void user_enter_their_name_age() {
	    pd.Enter_name("Rohit");
	    pd.Enter_age("53");
	}
	@When("choose their gender")
	public void choose_their_gender() {
	    pd.select_gender();
	}
	@When("User choose their mode of Cancellation Insurance")
	public void user_choose_their_mode_of_cancellation_insurance() {
	    pd.select_Cancellation();
	    pd.Insurance();
	}
	@Then("Click on Booking Button")
	public void click_on_booking_button() {
	    pd.booking();
	}

}
