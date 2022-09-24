package ujian.ujiankelima.selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import latihan.selenium.framework.driver.connection.DriverSingleton;
import latihan.selenium.framework.utils.Utils;
import latihan.selenium.framework.utils.Constants;

public class CartPage {
private WebDriver driver;
	
	public CartPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
	@FindBy(xpath = "//a[@class='button wc-backward']")
	private WebElement linkReturn;
	
	@FindBy(xpath = "//div[@id='noo-site']/section/div/div/div/span[2]/span")
	private WebElement txtReturnProduct;
	
//	Page Object
	public void clickReturn() {
//		Utils.scrollDownByVisibleElement(linkProduct, driver);
//		Utils.scrollDownByPixel(1100, driver);
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
		linkReturn.click();
		Utils.delay(1, Constants.GLOB_PARAM_DELAY);
	}
	
	public String getTxtProducts(int delays) {
		System.out.println("Actual txt: " + txtReturnProduct.getText());
		return new WebDriverWait(driver, Duration.ofSeconds(delays))
				.until(ExpectedConditions.visibilityOf(txtReturnProduct)).getText();
	}
}
