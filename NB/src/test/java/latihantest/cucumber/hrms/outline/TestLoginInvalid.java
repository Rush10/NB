package latihantest.cucumber.hrms.outline;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLoginInvalid {
	@When("Browser open Web HRM Outlinee")
	public void browser_open_web_hrm_outlinee() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^Enter invalid (.*) and (.*) Outlinee$")
	public void enter_invalid_password_and_username_outlinee(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("DAPAT BOSS USERNAME: " + username);
		System.out.println("DAPAT BOSS PASSWORD: " + password);
	}

	@When("button login clicked Outlinee")
	public void button_login_clicked_outlinee() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("System check credentials invalid Outlinee")
	public void system_check_credentials_invalid_outlinee() {
	    // Write code here that turns the phrase above into concrete actions
	}
}
