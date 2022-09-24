package ujian.ujiankelima.selenium;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import latihan.selenium.framework.driver.connection.DriverSingleton;
import latihan.selenium.framework.utils.Constants;
import ujian.ujiankelima.selenium.HomePage;

public class TestCartPage {
	public static WebDriver driver;
	private CartPage cartPage;
	
	@BeforeTest
	public void setUp() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get("https://shop.demoqa.com/cart/");	
	}
	
	@BeforeMethod
	public void pageObject() {
		cartPage = new CartPage();	
	}
	
	@Test
	public void testValidBackShop() {
		String strExpected = "Products";
		System.out.println("===== Test Valid Back Shop =====");
		cartPage.clickReturn();
		assertEquals(cartPage.getTxtProducts(10), strExpected);
		System.out.println("Expected txt: " + strExpected);
		System.out.println("================================");
//		assertTrue(homePage.getTxtProduct(10).contains("pink drop shoulder oversized t shirt"));
	}
	
	@AfterTest
	public void closeBrowser() throws InterruptedException {
		DriverSingleton.closeObjectInstance();
	}
}
