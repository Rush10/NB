package ujian.ujiankelima.selenium;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import latihan.selenium.framework.driver.connection.DriverSingleton;
import latihan.selenium.framework.utils.Constants;
import latihan.selenium.framework.utils.Utils;

public class TestArticlePage {
	public static WebDriver driver;
	private ArticlePage articlePage;
	
	@BeforeTest
	public void setUp() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		driver.get("https://shop.demoqa.com/2016/05/09/the-new-marc-jacobs-gotham-saddle-bag/");	
	}
	
	@BeforeMethod
	public void pageObject() {
		articlePage = new ArticlePage();	
	}
	
	@Test
	public void testInvalidEmail() {
		String strExpected = "Please enter a valid email address";
		String name = "deni", email = "deni", chapcha = "deni";
		String website = "deni", comment = "deni asyik";
		
		System.out.println("===== Test Invalid Login =====");
		articlePage.addComment(name,email,website,comment,chapcha);
		articlePage.clickBtnSubmit();
		assertTrue(articlePage.getErrTxt(10).contains(strExpected));
		System.out.println("Expected Message: " + strExpected);
		System.out.println("==============================");
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
//		assertEquals(articlePage.getErrTxt(10), strExpected);
	}
	
	@AfterTest
	public void closeBrowser() throws InterruptedException {
		DriverSingleton.closeObjectInstance();
	}
}
