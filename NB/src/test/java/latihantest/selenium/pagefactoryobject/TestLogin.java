package latihantest.selenium.pagefactoryobject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import latihan.selenium.pagefactoryobject.drivers.DriverSingleton;
import latihan.selenium.pagefactoryobject.pages.LoginPage;
import latihan.selenium.pagefactoryobject.utils.Constants;

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
		driver.get(Constants.URL);
		loginPage = new LoginPage();
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		DriverSingleton.closeObjectInstance();
	}
	
	@Test
	public void testValidLogin() {
		loginPage.login("Admin", "admin123");
		assertEquals(loginPage.getTxtEmp(), "Employee Information");
	}
	
	@Test
	public void testValidLoginUsernameCapital() {
		loginPage.login("ADMIN", "admin123");
		assertTrue(loginPage.getTxtEmp().contains("Employee"));
	}
}
