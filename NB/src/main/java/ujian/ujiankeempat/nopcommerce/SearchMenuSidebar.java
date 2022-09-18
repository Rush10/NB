package ujian.ujiankeempat.nopcommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import latihan.selenium.framework.driver.connection.DriverSingleton;

public class SearchMenuSidebar {
private WebDriver driver;
	
	public SearchMenuSidebar() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Page Factory
	@FindBy(xpath = "//input[@type='text']")
	private WebElement searchMenu;
	
	@FindBy(xpath = "//div[@id='user-selection']/h5")
	private WebElement txtMenu;
	
//	Page Object
	public void searchMenu(String product) throws InterruptedException {
		this.searchMenu.click();
		Thread.sleep(2000);
		this.searchMenu.sendKeys(product);
	}
	
	public String getTxtMenu() {
		String txt;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		txt = txtMenu.getText();
		System.out.println("Text Actual  : " + txt);
		
		return txt;
	}
}
