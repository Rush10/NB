package ujian.ujiankeempat.nopcommerce;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import latihan.selenium.framework.driver.connection.DriverSingleton;
import latihan.selenium.framework.utils.Constants;

public class SearchMenuSidebarTest {
	public static WebDriver driver;
	private LoginPage loginPage;
	private SearchMenuSidebar searchMenuSidebar;
	
	@BeforeClass
	public void setUp() {
		
	}
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.FIREFOX);
		driver = DriverSingleton.getDriver();
		loginPage = new LoginPage();
		searchMenuSidebar = new SearchMenuSidebar();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(1000);
		DriverSingleton.closeObjectInstance();
	}
	
//	Positive Case
	@Test(priority = 0)
	public void testValidSearchMenu() throws InterruptedException {
		driver.get(Constants.URL_LOGIN_NOP_COMMERCE);
		loginPage.login("admin@yourstore.com","admin");
		
		String txt = "SALES SUMMARY";
		
		searchMenuSidebar.searchMenu(txt);
		Thread.sleep(2000);
		
		System.out.println("=======================================");
		System.out.println("TEST SEARCH MENU VALID");
		System.out.println("Search Menu: " + txt);
		assertEquals(searchMenuSidebar.getTxtMenu(), txt);
		System.out.println("Text Expected: " + txt);
		System.out.println("=======================================");
	}
}
