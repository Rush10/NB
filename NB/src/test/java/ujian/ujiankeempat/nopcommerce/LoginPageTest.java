package ujian.ujiankeempat.nopcommerce;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import latihan.selenium.framework.driver.connection.DriverSingleton;
import latihan.selenium.framework.utils.Constants;
import ujian.ujiankeempat.nopcommerce.LoginPage;

public class LoginPageTest {
	public static WebDriver driver;
	private LoginPage loginPage;
	
	@BeforeClass
	public void setUp() {
		
	}
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.FIREFOX);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL_LOGIN_NOP_COMMERCE);
		loginPage = new LoginPage();	
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(1000);
		DriverSingleton.closeObjectInstance();
		Thread.sleep(1000);
	}
	
//	Positive Case (Scenario 1)
	@Test(priority = 0)
	public void testValidLogin() {
		String email = "admin@yourstore.com";
		String pass = "admin";
		String txt = "John Smith";
		
		loginPage.login(email,pass);
		
		System.out.println("=======================================");
		System.out.println("TEST VALID LOGIN");
		System.out.println("Email: " + email);
		System.out.println("Pass : " + pass);
		assertEquals(loginPage.getTxtProfile(), txt);
		System.out.println("Text Expected: " + txt);
		System.out.println("=======================================");
	}
	
//	Positive Case (Scenario 2)
	@Test(priority = 1)
	public void testValidLoginUpperCase() {
		String email = "ADMIN@YOURSTORE.COM";
		String pass = "admin";
		String txt = "John Smith";
		
		loginPage.login(email,pass);
		
		System.out.println("=======================================");
		System.out.println("TEST VALID LOGIN UPPERCASE");
		System.out.println("Email: " + email);
		System.out.println("Pass : " + pass);		
		assertEquals(loginPage.getTxtProfile(), txt);
		System.out.println("Text Expected: " + txt);
		System.out.println("=======================================");
	}
	
//	Negative Case (Scenario 3)
	@Test(priority = 2)
	public void testInvalidLoginEmail() {
		String email = "admin@yourstore.co";
		String pass = "admin";
		String txt = "Login was unsuccessful. Please correct the errors and try again.";
		
		loginPage.login(email,pass);
		
		System.out.println("=======================================");
		System.out.println("TEST INVALID LOGIN EMAIL");
		System.out.println("Email: " + email);
		System.out.println("Pass : " + pass);
		assertTrue(loginPage.getTxtErr().contains(txt));
		System.out.println("Text Expected: " + txt);
		System.out.println("=======================================");
	}
	
//	Negative Case (Scenario 4)
	@Test(priority = 3)
	public void testInvalidLoginPass() {
		String email = "admin@yourstore.com";
		String pass = "admi";
		String txt = "Login was unsuccessful. Please correct the errors and try again.";
		
		loginPage.login(email,pass);
		
		System.out.println("=======================================");
		System.out.println("TEST INVALID LOGIN PASSWORD");
		System.out.println("Email: " + email);
		System.out.println("Pass : " + pass);
		assertTrue(loginPage.getTxtErr().contains(txt));
		System.out.println("Text Expected: " + txt);
		System.out.println("=======================================");
	}
}
