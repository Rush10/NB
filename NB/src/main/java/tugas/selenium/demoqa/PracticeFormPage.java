package tugas.selenium.demoqa;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import latihan.selenium.framework.driver.connection.DriverSingleton;

public class PracticeFormPage {
	private WebDriver driver;
	private Robot robot;
	
	public PracticeFormPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
	@FindBy(id = "firstName")
	private WebElement firstName;
	
	@FindBy(id = "lastName")
	private WebElement lastName;
	
	@FindBy(id = "userEmail")
	private WebElement email;
	
	@FindBy(xpath = "//label[@for='gender-radio-1']")
	private WebElement radioMale;
	@FindBy(xpath = "//label[@for='gender-radio-2']")
	private WebElement radioFemale;
	@FindBy(xpath = "//label[@for='gender-radio-3']")
	private WebElement radioOther;
	
	@FindBy(id = "userNumber")
	private WebElement phone;
	
	@FindBy(id = "dateOfBirthInput")
	private WebElement dateBirth;
	
	@FindBy(id = "subjectsInput")
	private WebElement subject;
	
	@FindBy(xpath = "//input[@type='file']")
	private WebElement file;
	
	@FindBy(id = "currentAddress")
	private WebElement address;
	
	@FindBy(id = "submit")
	private WebElement btnSubmit;
	
	@FindBy(id = "closeLargeModal")
	private WebElement btnCloseModal;
	
//	Page Object
	public void formPractice(String firstName, String lastName, String email, String gender, String phone, String bdate, String subject, String path, String address) throws AWTException, InterruptedException {
		this.robot = new Robot();
		
		zoomOut(4);
		
		this.firstName.sendKeys(firstName);
		this.lastName.sendKeys(lastName);
		this.email.sendKeys(email);
		
		if(gender.equalsIgnoreCase("L")) {
			radioMale.click();
		}else if(gender.equalsIgnoreCase("P")) {
			radioFemale.click();
		}else {
			radioOther.click();
		}
		
		this.phone.sendKeys(phone);
		
		bDateInput(bdate);
		
		subjectInput(subject);
		
		driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]/div/label")).click();
	    driver.findElement(By.xpath("//div[@id='hobbiesWrapper']/div[2]/div[3]/label")).click();
		
		this.file.sendKeys(path);
		this.address.sendKeys(address);
		
		driver.findElement(By.xpath("//div[@id='state']/div/div")).click();
	    driver.findElement(By.id("react-select-3-option-1")).click();
	    
	    driver.findElement(By.xpath("//div[@id='city']/div/div/div")).click();
	    driver.findElement(By.id("react-select-4-option-1")).click();
		
		btnSubmit.click();
		
		Thread.sleep(2000);
		
		btnCloseModal.click();
	}
	
	public void zoomOut(int n) throws AWTException{
	  	this.robot = new Robot();
	  	for (int i = 0; i < n; i++) {			
	  		robot.keyPress(KeyEvent.VK_CONTROL);
	  		robot.keyPress(KeyEvent.VK_SUBTRACT);
	  		robot.keyRelease(KeyEvent.VK_CONTROL);
	  		robot.keyPress(KeyEvent.VK_SUBTRACT);
		}
	}
	
	public void bDateInput(String bdate) throws InterruptedException, AWTException {
		robot = new Robot();
		
		this.dateBirth.click();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_A);
		
		Thread.sleep(300);
		
		this.dateBirth.sendKeys(bdate);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void subjectInput(String subject) throws InterruptedException, AWTException {
		robot = new Robot();
		
		this.subject.click();
		this.subject.sendKeys(subject);
		
		Thread.sleep(300);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}