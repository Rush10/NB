package tugas.selenium.demoaut;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import latihan.selenium.framework.driver.connection.DriverSingleton;
import latihan.selenium.framework.utils.Constants;

import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class FormPageTest {
	public static WebDriver driver;
	private FormPage formPage;
	
	@BeforeClass
	public void setUp() {
		
	}
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.FIREFOX);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL_FORM_DEMO_AUT);
		formPage = new FormPage();	
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		DriverSingleton.closeObjectInstance();
	}
	
//	Positive Case
	@Test
	public void testValidSubmitForm() {
		String fn = "Nada";
		String ln = "Nada";
		String gender = "F";
		String dateb = "12/12/1997";
		String address = "Jl.Jkt";
		String email = "nada@jkt.com";
		String pass = "nadanadacinta";
		String company = "Nada";
		int job = 2;
		String comment = "Terbaik lah";
		
		formPage.form(fn,ln,gender,dateb,address,email,pass,company,job,comment);
		assertTrue(formPage.getTxtSuccess().contains("Successfully submitted!"));
	}

 }


