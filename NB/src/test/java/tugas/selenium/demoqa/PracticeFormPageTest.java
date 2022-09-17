package tugas.selenium.demoqa;

import java.util.regex.Pattern;
import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import latihan.selenium.framework.driver.connection.DriverSingleton;
import latihan.selenium.framework.utils.Constants;

import static org.testng.Assert.*;
import org.openqa.selenium.*;

public class PracticeFormPageTest {
	public static WebDriver driver;
	private PracticeFormPage practiceFormPage;
	
	@BeforeClass
	public void setUp() {
		
	}
	
	@BeforeMethod
	public void pageObject() {
		DriverSingleton.getInstance(Constants.FIREFOX);
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL_FORM_PRACTICE_DEMO_QA);
		practiceFormPage = new PracticeFormPage();	
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		DriverSingleton.closeObjectInstance();
	}
	
//	Positive Case
	@Test
	public void testValidSubmitForm() throws AWTException, InterruptedException {
		String fn = "Nada";
		String ln = "Nada";
		String email = "nada@gmail.com";		
		String gender = "F";
		String phone = "08768564548";
		String bdate = "12/12/1993";
		String subject = "Math";
		String address = "Jl.Jkt";
		
		//pastikan mengganti path dibawah ini
		//masukkan disini path yang ada filenya
		String path = "C:\\Users\\ROG\\Downloads\\Nexsoft Bootcamp\\a.png";   
		
		practiceFormPage.formPractice(fn,ln,email,gender,phone,bdate,subject,path,address);
	}

 }




