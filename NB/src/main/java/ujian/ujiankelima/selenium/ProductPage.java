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

public class ProductPage {
private WebDriver driver;
	
	public ProductPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
	@FindBy(xpath = "//select[@id='pa_color']")
	private WebElement selectColor;
	
	@FindBy(xpath = "//select[@id='pa_size']")
	private WebElement selectSize;
	
	@FindBy(xpath = "//div[@id='product-1497']/div/div[2]/form/div/div[2]/div/div/button[2]/i")
	private WebElement addProduct;
	
	@FindBy(xpath = "//div[@id='product-1497']/div/div[2]/form/div/div[2]/button")
	private WebElement addProductToCart;
	
	@FindBy(xpath = "//div[@id='noo-site']/div[2]/div/div/div/div")
	private WebElement txtAddProductToCart;
	
//	Page Object
	public void fillProduct() {
//		Utils.scrollDownByVisibleElement(selectColor, driver);
		Utils.scrollDownByPixel(300, driver);
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		selectColor.click();
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		new Select(selectColor).selectByVisibleText("Pink");
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		selectSize.click();
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		new Select(selectSize).selectByVisibleText("36");
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		addProduct.click();
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		addProduct.click();
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		addProductToCart.click();
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		Utils.scrollDownByVisibleElement(txtAddProductToCart, driver);
	}
	
	public String getTxtProductAddToCart(int delays) {
		System.out.println("Actual Message : " + txtAddProductToCart.getText());
		return new WebDriverWait(driver, Duration.ofSeconds(delays))
				.until(ExpectedConditions.visibilityOf(txtAddProductToCart)).getText();
	}
}
