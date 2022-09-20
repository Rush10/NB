package latihantest.cucumber.nopcom.basic;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import latihan.selenium.framework.utils.Constants;
import latihantest.cucumber.nopcom.basic.LoginHooks;
import ujian.ujiankeempat.nopcommerce.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLogin {
	
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private LoginPage loginPage = new LoginPage();
	
	public TestLogin() {
		driver = LoginHooks.driver;
		extentTest = LoginHooks.extentTest;
	}
	
	@When("User go to web NopCom")
	public void user_go_to_web_nop_com() {
		driver.get(Constants.URL_LOGIN_NOP_COMMERCE);
		extentTest.log(LogStatus.PASS, "User go to web NopCom");
	}

	@When("User enter invalid username password")
	public void user_enter_invalid_username_password() {
		String email = "admin@yourstore.c";
		String pass = "admin1234";
		
		loginPage.login(email,pass);
		
		System.out.println("=======================================");
		System.out.println("TEST INVALID LOGIN EMAIL");
		System.out.println("Email: " + email);
		System.out.println("Pass : " + pass);
		
		extentTest.log(LogStatus.PASS, "User enter invalid username password");
	}

	@When("User click button invalid login")
	public void user_click_button_invalid_login() {
		loginPage.clickBtnLogin();
		extentTest.log(LogStatus.PASS, "User click invalid button login");
	}

	@Then("User invalid credentials")
	public void user_invalid_credentials() {
		String txt = "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found";
		
		assertTrue(loginPage.getTxtErr(10).contains(txt));
		System.out.println("Text Expected: " + txt);
		System.out.println("=======================================");
		
		extentTest.log(LogStatus.PASS, "User invalid credentials");
	}

	@When("User enter valid username password")
	public void user_enter_valid_username_password() {
		String email = "admin@yourstore.com";
		String pass = "admin";
		
		loginPage.login(email, pass);
		
		System.out.println("=======================================");
		System.out.println("TEST VALID LOGIN");
		System.out.println("Email: " + email);
		System.out.println("Pass : " + pass);
		
		extentTest.log(LogStatus.PASS, "User enter valid username password");
	}

	@When("User click button valid login")
	public void user_click_button_valid_login() {
		loginPage.clickBtnLogin();
		extentTest.log(LogStatus.PASS, "User click valid button login");
	}

	@Then("User valid credentials")
	public void user_valid_credentials() {
		String txt = "John Smith";
		
		assertEquals(loginPage.getTxtProfile(10), txt);
		System.out.println("Text Expected: " + txt);
		System.out.println("=======================================");
		
		extentTest.log(LogStatus.PASS, "User valid credentials");
	}
}
