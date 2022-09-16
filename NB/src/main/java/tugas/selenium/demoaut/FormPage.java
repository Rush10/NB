package tugas.selenium.demoaut;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import latihan.selenium.framework.driver.connection.DriverSingleton;

public class FormPage {
private WebDriver driver;
	
	public FormPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
	@FindBy(id = "first-name")
	private WebElement firstName;
	
	@FindBy(id = "last-name")
	private WebElement lastName;
	
	@FindBy(xpath = "//form[@id='infoForm']/div[3]/div/div/label[1]/input")
	private WebElement radioMale;
	@FindBy(xpath = "//form[@id='infoForm']/div[3]/div/div/label[2]/input")
	private WebElement radioFemale;
	@FindBy(xpath = "//form[@id='infoForm']/div[3]/div/div/label[3]/input")
	private WebElement radioOther;
	
	@FindBy(id = "dob")
	private WebElement dateBirth;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "password")
	private WebElement pass;
	
	@FindBy(id = "company")
	private WebElement company;
	
	@FindBy(xpath = "//option[@value='QA']")
	private WebElement optQA;
	@FindBy(xpath = "//option[@value='Developer']")
	private WebElement optDev;
	@FindBy(xpath = "//option[@value='Manager']")
	private WebElement optMgr;
	@FindBy(xpath = "//option[@value='Technical Architect']")
	private WebElement optTA;
	@FindBy(xpath = "//option[@value='Business Analyst']")
	private WebElement optBA;
	
	@FindBy(id = "comment")
	private WebElement comment;
	
	@FindBy(id = "submit")
	private WebElement btnSubmit;
	
	@FindBy(xpath = "//span[@id='submit-msg']")
	private WebElement txtSuccess;
	
	
//	Page Object
	public void form(String firstName, String lastName, String gender, String dateBirth, String address, String email, String pass, String company, int job, String comment) {
		this.firstName.sendKeys(firstName);
		this.lastName.sendKeys(lastName);
		
		if(gender.equalsIgnoreCase("L")) {
			radioMale.click();
		}else if(gender.equalsIgnoreCase("P")) {
			radioFemale.click();
		}else {
			radioOther.click();
		}
		
		this.dateBirth.sendKeys(dateBirth);
		this.address.sendKeys(address);
		this.email.sendKeys(email);
		this.pass.sendKeys(pass);
		this.company.sendKeys(company);
		
		if(job == 1) {
			optQA.click();
		}else if(job == 2) {
			optDev.click();
		}else if(job == 3) {
			optMgr.click();
		}else if(job == 4) {
			optTA.click();
		}else {
			optBA.click();
		}
		
		driver.findElement(By.xpath("//form[@id='infoForm']/div[11]/div/div[4]/label/input")).click();
		driver.findElement(By.xpath("//form[@id='infoForm']/div[11]/div/div[6]/label")).click();
		
		this.comment.sendKeys(comment);
		btnSubmit.click();
	}
	
	public String getTxtSuccess() {
		return txtSuccess.getText();
	}
}
