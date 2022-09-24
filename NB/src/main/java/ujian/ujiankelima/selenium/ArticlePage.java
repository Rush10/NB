package ujian.ujiankelima.selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import latihan.selenium.framework.driver.connection.DriverSingleton;
import latihan.selenium.framework.utils.Utils;
import latihan.selenium.framework.utils.Constants;

public class ArticlePage {
private WebDriver driver;
	
	public ArticlePage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
	@FindBy(xpath = "//input[@id='author']")
	private WebElement inputAuthor;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement inputEmail;
	
	@FindBy(xpath = "//input[@id='url']")
	private WebElement inputWeb;
	
	@FindBy(xpath = "//textarea[@id='comment']")
	private WebElement inputComment;
	
	@FindBy(xpath = "//input[@id='aiowps-captcha-answer']")
	private WebElement inputCaptcha;
	
	@FindBy(xpath = "//input[@id='submit']")
	private WebElement btnSubmit;
	
	@FindBy(xpath = "//div[@class='wp-die-message']//p[1]")
	private WebElement txtErrMsg;
	
//	Page Object
	public void addComment(String name, String email, String website, String comment, String captcha) {
//		Utils.scrollDownByVisibleElement(selectColor, driver);
		Utils.scrollDownByPixel(2200, driver);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		inputAuthor.sendKeys(name);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		inputEmail.sendKeys(email);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		inputWeb.sendKeys(website);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		inputComment.sendKeys(comment);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		inputCaptcha.sendKeys(captcha);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);	
	}
	
	public void clickBtnSubmit() {
		btnSubmit.click();	
	}
	
	public String getErrTxt(int delays) {
		System.out.println("Actual Message : " + txtErrMsg.getText());
		return new WebDriverWait(driver, Duration.ofSeconds(delays))
				.until(ExpectedConditions.visibilityOf(txtErrMsg)).getText();
	}
}
