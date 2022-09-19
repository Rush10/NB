package latihantest.cucumber.hrms.outline;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLoginEmpty {
	@When("User go to Web HRM Outline")
	public void user_go_to_web_hrm_outline() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^User enter (.*) invalid Outline$")
	public void user_enter_username_invalid_outline(String username) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("DAPAT BOSS USERNAME: " + username);
	}

	@When("User click button login empty username Outline")
	public void user_click_button_login_empty_username_outline() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("User invalid empty username credentials Outline")
	public void user_invalid_empty_username_credentials_outline() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^User enter (.*) invalid Outline$")
	public void user_enter_password_invalid_outline(String password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("DAPAT BOSS PASSWORD: " + password);
	}

	@Then("User click button login empty password Outline")
	public void user_click_button_login_empty_password_outline() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("User invalid empty password credentials Outline")
	public void user_invalid_empty_password_credentials_outline() {
	    // Write code here that turns the phrase above into concrete actions
	}
}
