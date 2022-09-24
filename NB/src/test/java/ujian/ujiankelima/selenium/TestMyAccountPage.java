package ujian.ujiankelima.selenium;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import latihan.selenium.framework.driver.connection.DriverSingleton;
import latihan.selenium.framework.utils.Constants;
import latihan.selenium.framework.utils.Utils;
import ujian.ujiankelima.selenium.HomePage;

public class TestMyAccountPage {
	public static WebDriver driver;
	private MyAccountPage myAccountPage;
	
	@BeforeTest
	public void setUp() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get("https://shop.demoqa.com/my-account/");	
	}
	
	@BeforeMethod
	public void pageObject() {
		myAccountPage = new MyAccountPage();	
	}
	
	@Test
	public void testInvalidLogin() {
		String strExpected = "The username or password you entered is incorrect", user = "deni@gmail.com", pass = "deni";
		System.out.println("===== Test Invalid Login =====");
		myAccountPage.login(user,pass);
		myAccountPage.clickBtnLogin();
		assertTrue(myAccountPage.getErrTxt(10).contains(strExpected));
		System.out.println("Expected Message: " + strExpected);
		System.out.println("==============================");
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
//		assertEquals(myAccountPage.getErrTxt(10), strExpected);
	}
	
	@AfterTest
	public void closeBrowser() throws InterruptedException {
		DriverSingleton.closeObjectInstance();
	}
}
