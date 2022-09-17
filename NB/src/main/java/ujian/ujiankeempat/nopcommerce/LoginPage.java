package ujian.ujiankeempat.nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
//	Page Object
	public void login(String email, String pass) {
		this.email.clear();
		this.password.clear();
		
		this.email.sendKeys(email);
		this.password.sendKeys(pass);
		
		btnSubmit.click();
	}
	
	public String getTxtProfile() {
		String txt;
		
		txt = txtProfile.getText();
		System.out.println("Text Actual  : " + txt);
		
		return txt;
	}
	
	public String getTxtErr() {
		String txt;
		
		txt = txtErr.getText();
		System.out.println("Text Actual  : " + txt);
		
		return txt;
	}
}
