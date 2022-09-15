package latihan.selenium.formy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormCoba {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 
		String baseUrl = "https://formy-project.herokuapp.com/form";
		driver.get(baseUrl);
		
		//get value tag h1
//		WebElement isiTag = driver.findElement(By.tagName("h1"));
//		System.out.println(isiTag.getText());
		
		//input first name
		driver.findElement(By.id("first-name")).sendKeys("Sutarno");
		
		//input last name
		driver.findElement(By.id("last-name")).sendKeys("Aja");
		
		//input job title
		driver.findElement(By.id("job-title")).sendKeys("Teacher");
		
		//click rb 1
		driver.findElement(By.id("radio-button-1")).click();
		
		//click rb 2
		driver.findElement(By.id("radio-button-2")).click();
		
		//click rb 3
		driver.findElement(By.id("radio-button-3")).click();
		
		//click cb 1
		driver.findElement(By.id("checkbox-1")).click();
		
		//click cb 2
		driver.findElement(By.id("checkbox-2")).click();
		
		//click cb 3
		driver.findElement(By.id("checkbox-3")).click();
		
		//input select
		//driver.findElement(By.id("select-menu")).sendKeys("5"); //hanya mengambil value dalam tag option
		
		Select select = new Select( driver.findElement(By.id("select-menu")));
		select.selectByValue("1");
		
		driver.findElement(By.cssSelector("select[id='select-menu']>option[value='2']")).click();;
		
		//input date
		driver.findElement(By.id("datepicker")).sendKeys("12/12/2022");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//click submit
		driver.findElement(By.linkText("Submit")).click();
		
	}
}
