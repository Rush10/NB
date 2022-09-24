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

public class MyAccountPage {
private WebDriver driver;
	
	public MyAccountPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
	@FindBy(xpath = "//input[@id='username']")
	private WebElement inputUser;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement inputPass;
	
	@FindBy(xpath = "//input[@id='rememberme']")
	private WebElement inputRemember;
	
	@FindBy(xpath = "//button[@name='login']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//article[@id='post-8']/div/div/div/ul/li")
	private WebElement txtErrMsg;
	
//	Page Object
	public void login(String user, String pass) {
//		Utils.scrollDownByVisibleElement(selectColor, driver);
		Utils.scrollDownByPixel(300, driver);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		inputUser.sendKeys(user);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		inputPass.sendKeys(pass);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		inputRemember.click();
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);	
	}
	
	public void clickBtnLogin() {
		btnLogin.click();	
	}
	
	public String getErrTxt(int delays) {
		System.out.println("Actual Message : " + txtErrMsg.getText());
		return new WebDriverWait(driver, Duration.ofSeconds(delays))
				.until(ExpectedConditions.visibilityOf(txtErrMsg)).getText();
	}
}
