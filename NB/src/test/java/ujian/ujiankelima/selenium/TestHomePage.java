package ujian.ujiankelima.selenium;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import latihan.selenium.framework.driver.connection.DriverSingleton;
import latihan.selenium.framework.utils.Constants;
import ujian.ujiankelima.selenium.HomePage;

public class TestHomePage {
	public static WebDriver driver;
	private HomePage homePage;
	
	@BeforeTest
	public void setUp() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL_SHOP_DEMO_QA);	
	}
	
	@BeforeMethod
	public void pageObject() {
		homePage = new HomePage();	
	}
	
	@Test
	public void testValidClickProduct() {
		String strExpected = "PINK DROP SHOULDER OVERSIZED T SHIRT";
		System.out.println("===== Test Valid Click Product =====");
		homePage.clickProduct();
		assertEquals(homePage.getTxtProduct(10), strExpected);
		System.out.println("Expected Product: " + strExpected);
		System.out.println("====================================");
//		assertTrue(homePage.getTxtProduct(10).contains("pink drop shoulder oversized t shirt"));
	}
	
	@AfterTest
	public void closeBrowser() throws InterruptedException {
		DriverSingleton.closeObjectInstance();
	}
}
