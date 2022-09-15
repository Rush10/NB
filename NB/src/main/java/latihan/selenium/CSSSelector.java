package latihan.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSSelector {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://demoqa.com/automation-practice-form";
		driver.get(baseUrl);
		
		//css selector
		
		driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("Miing");
		driver.findElement(By.cssSelector("input#firstName")).sendKeys("Miing");
		driver.findElement(By.cssSelector("textarea[class = 'form-control']")).sendKeys("Jalan Rusak no. 145 Kelurahan Kuvukiland Kota Jakarta Tenggara");
		driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("Jalan Rusak no. 145 Kelurahan Kuvukiland Kota Jakarta Tenggara");
		
		driver.findElement(By.cssSelector("input[placeholder = 'First Name']")).sendKeys("Depan");
		
		//sama seperti like 'a%' pada query (first)
		driver.findElement(By.cssSelector("input[id ^= 'fir']")).sendKeys("Supono");
		//sama seperti like '%a%' pada query (contain)
		driver.findElement(By.cssSelector("input[id *= 'Nam']")).sendKeys("Supono");
		//sama seperti like '%a' pada query (last)
		driver.findElements(By.cssSelector("input[id $= 'astName']"));
		
		//List CSS
		List<WebElement>temp = driver.findElements(By.cssSelector("input[id $= 'stName']"));
		System.out.println(temp);
		temp.get(0).sendKeys("Depan");
		temp.get(1).sendKeys("Belakang");
	}	
}
