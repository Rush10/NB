package latihan.selenium.formy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormyListCoba {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String baseUrl3 = "https://formy-project.herokuapp.com/";
		driver.get(baseUrl3); 
		
//		//click partiallink (get first)
//		click = driver.findElement(By.partialLinkText("Drop"));
//		click.click();
		
		//click partiallink (get all element drop)
		List<WebElement>drop = driver.findElements(By.partialLinkText("Drop"));
		drop.get(1).click();	
	}
}
