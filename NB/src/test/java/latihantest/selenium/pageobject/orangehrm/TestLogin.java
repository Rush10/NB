package latihantest.selenium.pageobject.orangehrm;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import latihan.selenium.framework.driver.connection.DriverSingleton;
import latihan.selenium.framework.utils.Constants;
import latihan.selenium.pageobject.orangehrm.LoginPage;

public class TestLogin {
	public static WebDriver driver;
	private LoginPage loginPage;
	
	@BeforeClass
	public void setUp() {
		
	}
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL_OHRM);
		loginPage = new LoginPage();	
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(1000);
		DriverSingleton.closeObjectInstance();
	}
	
//	Positive Case
	@Test
	public void testValidLogin() {
		loginPage.login("Admin", "admin123");
		assertEquals(loginPage.getTxtEmp(), "Employee Information");
//		assertTrue(loginPage.getTxtEmp().contains("Employee"));
	}
	
	@Test
	public void testValidLoginUppercaseUsername() {
		loginPage.login("ADMIN", "admin123");
		assertEquals(loginPage.getTxtEmp(), "Employee Information");
//		assertTrue(loginPage.getTxtEmp().contains("Employee"));
	}
	
//	Negative Case
	@Test
	public void testInvalidLoginEmptyField() {
		loginPage.login("", "");
		assertEquals(loginPage.getTextRequired(), "Required");
//		assertTrue(loginPage.getTextRequired().contains("Required"));
	}
	
//	@Test
	public void testInvalidLogin() {
		loginPage.login("admincuy", "admincuy");
		assertEquals(loginPage.getTextCredential(), "Invalid credentials");
	}
	
//	@Test
	public void testInvalidLoginEmptyUsername() {
		loginPage.login("", "admin123");
		assertEquals(loginPage.getTextRequired(), "Required");
//		assertTrue(loginPage.getTextRequired().contains("Required"));
	}
	
//	@Test
	public void testInvalidLoginEmptyPassword() {
		loginPage.login("Admin", "");
		assertEquals(loginPage.getTextRequired(), "Required");
//		assertTrue(loginPage.getTextRequired().contains("Required"));
	}
	
//	@Test
	public void testInvalidLoginInvalidUsername() {
		loginPage.login("admincuy", "admin123");
		assertEquals(loginPage.getTextCredential(), "Invalid credentials");
//		assertTrue(loginPage.getTextCredential().contains("Invalid credentials"));
	}
	
//	@Test
	public void testInvalidLoginInvalidPassword() {
		loginPage.login("Admin", "admin12");
		assertEquals(loginPage.getTextCredential(), "Invalid credentials");
//		assertTrue(loginPage.getTextCredential().contains("Invalid credentials"));
	}
}
