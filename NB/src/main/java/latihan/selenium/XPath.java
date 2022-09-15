package latihan.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
//		====================== XPATH ===============================================================
		//penggunaan xpath cocok untuk website statik tetapi tidak cocok untuk web dinamis
		
		String baseUrl = "https://formy-project.herokuapp.com/form";
//		String baseUrl = "https://demoqa.com/automation-practice-form";
		driver.get(baseUrl);
		
//		//absolute
//		driver.findElement(By.xpath("/html/body/div/form/div/div/input")).sendKeys("Marsinah");
//		
//		//contains
//		driver.findElement(By.xpath("//input[contains(@placeholder,'ame')]")).sendKeys("Marsinah");
//		
//		//relative
//		driver.findElement(By.xpath("//input[@id = 'first-name']")).sendKeys("Marsinah");
//		
//		//starts with
//		driver.findElement(By.xpath("//input[starts-with(@id,'last')]")).sendKeys("Bambang");
//		
//		/*Operator AND*/
//		driver.findElement(By.xpath("//input[@class='form-control' and @id='first-name']")).sendKeys("Bambang"); 
		/*Operator OR*/
//		driver.findElement(By.xpath("//input[@class='form-control' and @class='mr-sm-2' and @placeholder='First Name']")).sendKeys("Bambang");
//		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Bambang");
//		
//		//text (kegunaan mungkin membandingkan mockup dgn production)
//		System.out.println(driver.findElement(By.xpath("//label[text() = 'First name']")).getText());
//		
//		//AXIS ====================
//		//(demoqa)
//		
//		//descendant itu seperti superchild pada axis
//		//acestor itu seperti superparent pada axis
//		
//		//ascendant axis
//		System.out.println(driver.findElement(By.xpath("//input[@id ='firstName']//ancestor::div")).getAttribute("class")); //descendant yaitu input
//		//descendant axis
//		System.out.println(driver.findElement(By.xpath("//div[@id ='app']//descendant::input[2]")).getAttribute("id")); //descendant memakai index 2 (indexingnya dimulai dari 1)
//		 
//		//child axis 
//		System.out.println(driver.findElement(By.xpath("//form[@id= 'userForm']//child::input")).getAttribute("id"));
//		//parent axis
//		System.out.println(driver.findElement(By.xpath("//input[@id ='userName']//parent::div")).getAttribute("class"));
//		
//		//following axis (form)
//		List<WebElement> input = driver.findElements(By.xpath("//input[@id= 'last-name']//following::input"));
//		for (int i = 0; i<input.size();i++) {
//			System.out.println(input.get(i).getAttribute("id"));
//		}
//		
//		System.out.println("================================================================");
//		System.out.println(driver.findElement(By.xpath("//input[@id ='last-name']//following::input")).getAttribute("id"));
//		System.out.println("================================================================");
//		System.out.println(driver.findElement(By.xpath("//input[@id ='last-name']//following::input[3]")).getAttribute("id"));
//		
//		//sibling axis
//		List<WebElement> input = driver.findElements(By.xpath("//option[@value ='0']//following-sibling::option"));
//		for (int i = 0; i<input.size();i++) {
//			System.out.println(input.get(i).getAttribute("value"));
//		}
//		 
//		System.out.println("================================================================");
//		System.out.println(driver.findElement(By.xpath("//option[@value ='0']//following-sibling::option")).getAttribute("value"));
//		System.out.println("================================================================");
//		System.out.println(driver.findElement(By.xpath("//option[@value ='0']//following-sibling::option[4]")).getAttribute("value"));
//		
//		//proceding axis
//		List <WebElement> label = driver.findElements(By.xpath("//input[@id= 'job-title']//preceding::label"));
//		for (int i = 0; i<label.size();i++) {
//			System.out.println(label.get(i).getText());
//		}
//
//		System.out.println("================================================================");
//		System.out.println(driver.findElement(By.xpath("//input[@id = 'job-title']//preceding::label[3]")).getText());
//		System.out.println("================================================================");
//		System.out.println(driver.findElement(By.xpath("//input[@id = 'job-title']//preceding::label")).getText());
//		
//		//proceding sibling axis
//		List<WebElement> input = driver.findElements(By.xpath("//option[@value ='4']//preceding-sibling::option"));
//  		for (int i = 0; i<input.size();i++) {
//  			System.out.println(input.get(i).getAttribute("value"));
//		}
//
//		System.out.println("================================================================");
//		System.out.println(driver.findElement(By.xpath("//option[@value ='4']//preceding-sibling::option[3]")).getAttribute("value"));
//		System.out.println("================================================================");
//		System.out.println(driver.findElement(By.xpath("//option[@value ='4']//preceding-sibling::option")).getAttribute("value"));
	
	}
}
