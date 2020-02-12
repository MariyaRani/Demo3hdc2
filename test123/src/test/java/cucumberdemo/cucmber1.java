package cucumberdemo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucmber1 
{
	@Given("TESTME app is launched")
	public void testme_app_is_launched() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for app is launched");
	}

	@Given("user accessing registration link in TESTME app")
	public void user_accessing_registration_link_in_TESTME_app() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("code for access register link");
	}

	@When("user providing valid data for all the required fields")
	public void user_providing_valid_data_for_all_the_required_fields() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for valid data for required fields");
	}

	@Then("user verifying registration status")
	public void user_verifying_registration_status() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for registration status");
	}

	@Given("TESTME is launched and is accessible")
	public void testme_is_launched_and_is_accessible() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for launched and accessible");
	}

	@Then("User clicks on the login link available in HomePage")
	public void user_clicks_on_the_login_link_available_in_HomePage() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("code for login link");
	}

	@Then("Provides the valid Credentials")
	public void provides_the_valid_Credentials() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("code for valid credentials");
	}

	@Then("User Checks the login status")
	public void user_Checks_the_login_status() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("code for login status");
	}
}
