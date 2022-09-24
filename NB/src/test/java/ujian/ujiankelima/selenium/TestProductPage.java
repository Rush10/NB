package ujian.ujiankelima.selenium;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import latihan.selenium.framework.driver.connection.DriverSingleton;
import latihan.selenium.framework.utils.Constants;
import ujian.ujiankelima.selenium.HomePage;

public class TestProductPage {
	public static WebDriver driver;
	private ProductPage productPage;
	
	@BeforeTest
	public void setUp() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get("https://shop.demoqa.com/product/pink-drop-shoulder-oversized-t-shirt/");	
	}
	
	@BeforeMethod
	public void pageObject() {
		productPage = new ProductPage();	
	}
	
	@Test
	public void testValidAddProductToCart() {
		String strExpected = "have been added";
		System.out.println("===== Test Valid Add Product To Cart =====");
		productPage.fillProduct();
		assertTrue(productPage.getTxtProductAddToCart(10).contains(strExpected));
		System.out.println("Expected Message: " + strExpected);
		System.out.println("==========================================");
//		assertEquals(productPage.getTxtProductAddToCart(10), strExpected);
	}
	
	@AfterTest
	public void closeBrowser() throws InterruptedException {
		DriverSingleton.closeObjectInstance();
	}
}
