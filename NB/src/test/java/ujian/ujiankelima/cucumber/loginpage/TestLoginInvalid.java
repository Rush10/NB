package ujian.ujiankelima.cucumber.loginpage;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import latihan.selenium.framework.utils.Constants;
import latihan.selenium.framework.utils.Utils;
import ujian.ujiankelima.selenium.MyAccountPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLoginInvalid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private MyAccountPage loginPage = new MyAccountPage();
	
	public TestLoginInvalid() {
		driver = OutlineHooks.driver;
		extentTest = OutlineHooks.extentTest;
	}
	
	@When("browser open Web shop demoqa outline")
	public void browser_open_web_shop_demoqa_outline() {
		driver.get("https://shop.demoqa.com/my-account/");
		extentTest.log(LogStatus.PASS, "browser open Web shop demoqa outline");
	}

	@When("^enter invalid (.*) and (.*) outline$")
	public void enter_invalid_email_and_password_outline(String email , String password) {
		loginPage.login(email, password);
		extentTest.log(LogStatus.PASS, "enter invalid email and password outline");
	}

	@When("button login clicked outline")
	public void button_login_clicked_outline() {
		loginPage.clickBtnLogin();
		extentTest.log(LogStatus.PASS, "button login clicked outline");
	}

	@Then("system check credentials invalid outline")
	public void system_check_credentials_invalid_outline() {
		String strExpected = "Username is required";
		assertTrue(loginPage.getErrTxt(10).contains(strExpected));
		extentTest.log(LogStatus.PASS, "system check credentials invalid outline");
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
	}
}
