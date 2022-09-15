package latihan.selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CobaSelenium {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 
		String baseUrl = "https://www.makemytrip.com/";
		driver.get(baseUrl);
		 
		Thread.sleep(5000);
		driver.findElement(By.linkText("webklipper-publisher-widget-container-notification-close-div"));
		String target = "Jayapura, Indonesia";
		WebElement ngisiKota = driver.findElement(By.xpath("//input[@id='fromCity']"));
		ngisiKota.sendKeys("Jayapura");
		Thread.sleep(4000);
		List<WebElement> opsiKota = driver.findElements(By.xpath("//ul[@class='reactautosuggest__suggestions-list']//child::li"));
		for (int i = 0; i<opsiKota.size();i++) {
			WebElement opsi = opsiKota.get(i);
			String isiOpsi = opsi.getText();
			if (isiOpsi.contains(target)) {
				opsi.click();
				break;
			}
		}
	}
}
