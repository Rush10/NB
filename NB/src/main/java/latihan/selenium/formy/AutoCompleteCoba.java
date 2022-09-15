package latihan.selenium.formy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoCompleteCoba {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebElement input;
		 
		
		//class
		WebElement logo = driver.findElement(By.className("navbar-brand"));
		logo.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String baseUrl2 = "https://formy-project.herokuapp.com/autocomplete";
		driver.get(baseUrl2); 
		
		//input address
		input = driver.findElement(By.id("autocomplete"));
		input.sendKeys("Jl.Jkt");
		
		//input sn 1
		input = driver.findElement(By.id("street_number"));
		input.sendKeys("1");
		
		//input sn2
		input = driver.findElement(By.id("route"));
		input.sendKeys("2");
		
		//input city
		input = driver.findElement(By.id("locality"));
		input.sendKeys("Jakarta");
		
		//input state
		input = driver.findElement(By.id("administrative_area_level_1"));
		input.sendKeys("Jakarta");
		
		//input postal code
		input = driver.findElement(By.id("postal_code"));
		input.sendKeys("787878");
		
		//input country
		input = driver.findElement(By.id("country"));
		input.sendKeys("Indonesia");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
