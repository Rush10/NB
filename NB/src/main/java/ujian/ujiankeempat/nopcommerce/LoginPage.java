package ujian.ujiankeempat.nopcommerce;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import latihan.selenium.framework.driver.connection.DriverSingleton;

public class LoginPage {
	private WebDriver driver;
	
	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
	@FindBy(id = "Email")
	private WebElement email;
	
	@FindBy(id = "Password")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btnSubmit;
	
	@FindBy(xpath = "//nav[@class='main-header navbar navbar-expand-md navbar-dark bg-dark']//li[2]")
	private WebElement txtProfile;
	
	@FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
	private WebElement txtErr;
	
	@FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]")
	private WebElement txtErr2;
	//div[@class='message-error validation-summary-errors']
	
//	Page Object
	public void login(String email, String pass) {
		this.email.clear();
		this.password.clear();
		
		this.email.sendKeys(email);
		this.password.sendKeys(pass);
	}
	
	public void clickBtnLogin() {
		btnSubmit.click();
	}
	
	public String getTxtProfile(int delay) {
		String txt = new WebDriverWait(driver, Duration.ofSeconds(delay))
				.until(ExpectedConditions.visibilityOf(txtProfile)).getText();
		System.out.println("Text Actual  : " + txt);
		
		return txt;
	}
	
	public String getTxtErr(int delay) {
		String txt = new WebDriverWait(driver, Duration.ofSeconds(delay))
				.until(ExpectedConditions.visibilityOf(txtErr2)).getText();
		System.out.println("Text Actual  : " + txt);
		
		return txt;
	}
}
