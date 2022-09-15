package latihantest.selenium;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CekJudul {
	@Test
	public void cekGoogle() {
		//Manual setting
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nexsoft\\Documents\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		//Auto setting
		WebDriverManager.chromedriver().setup();
//		WebDriverManager.firefoxdriver().setup();
//		WebDriverManager.iedriver().setup();
//		WebDriverManager.safaridriver().setup();;
		WebDriver driver = new ChromeDriver();
		 
//		String baseUrl = "https://formy-project.herokuapp.com/form"; 
		
		String baseUrl = "http://google.com"; 
		String expectedTitle = "Google";
		driver.get(baseUrl);
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, expectedTitle);
		 
//		driver.close();
	}
}
