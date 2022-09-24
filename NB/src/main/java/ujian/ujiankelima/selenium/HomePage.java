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

public class HomePage {
private WebDriver driver;
	
	public HomePage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
	@FindBy(xpath = "//a[normalize-space()='pink drop shoulder oversized t shirt']")
	private WebElement linkProduct;
	
	@FindBy(xpath = "//div[@id='product-1497']/div/div[2]/h1")
	private WebElement txtProduct;
	
//	Page Object
	public void clickProduct() {
//		Utils.scrollDownByVisibleElement(linkProduct, driver);
		Utils.scrollDownByPixel(1100, driver);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		linkProduct.click();
	}
	
	public String getTxtProduct(int delays) {
		System.out.println("Actual Product: " + txtProduct.getText());
		return new WebDriverWait(driver, Duration.ofSeconds(delays))
				.until(ExpectedConditions.visibilityOf(txtProduct)).getText();
	}
}
