package ujian.ujiankelima.cucumber.articlepage;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import latihan.selenium.framework.utils.Constants;
import latihan.selenium.framework.utils.Utils;
import ujian.ujiankelima.selenium.ArticlePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCommentInvalid {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private ArticlePage articlePage = new ArticlePage();
	
	public TestCommentInvalid() {
		driver = OutlineHooks.driver;
		extentTest = OutlineHooks.extentTest;
	}
	
	@When("browser open Web shop demoqa outline")
	public void browser_open_web_shop_demoqa_outline() {
		driver.get("https://shop.demoqa.com/2016/05/09/the-new-marc-jacobs-gotham-saddle-bag/");
		extentTest.log(LogStatus.PASS, "browser open Web shop demoqa outline");
	}

	@When("^enter (.*) (.*) (.*) (.*) and invalid (.*) outline$")
	public void enter_name_website_comment_captcha_and_invalid_email_outline(String name, String website, String comment, String captcha, String email) {
		articlePage.addComment(name, email, website, comment, captcha);
		extentTest.log(LogStatus.PASS, "enter name website comment captcha and invalid email outline");
	}

	@When("button submit clicked outline")
	public void button_submit_clicked_outline() {
		articlePage.clickBtnSubmit();
		extentTest.log(LogStatus.PASS, "button submit clicked outline");
	}

	@Then("system check credentials invalid outline")
	public void system_check_credentials_invalid_outline() {
		String strExpected = "Please enter a valid email address";
		assertTrue(articlePage.getErrTxt(10).contains(strExpected));
		extentTest.log(LogStatus.PASS, "system check credentials invalid outline");
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
	}
}
