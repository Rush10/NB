package tugas.selenium.formy;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception{
  	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testDropDown() throws Exception {
    driver.get("https://formy-project.herokuapp.com/dropdown");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Complete Web Form'])[1]/following::h1[1]")).click();
    driver.findElement(By.id("dropdownMenuButton")).click();
    driver.findElement(By.id("autocomplete")).click();
    Thread.sleep(500); 
    driver.navigate().back();
    driver.findElement(By.id("dropdownMenuButton")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Autocomplete'])[2]/following::a[1]")).click();
    Thread.sleep(500); 
    driver.navigate().back();
    driver.findElement(By.id("dropdownMenuButton")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Buttons'])[2]/following::a[1]")).click();
    Thread.sleep(500); 
    driver.navigate().back();
    driver.findElement(By.id("dropdownMenuButton")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Checkbox'])[2]/following::a[1]")).click();
    Thread.sleep(500); 
    driver.navigate().back();
    driver.findElement(By.id("dropdownMenuButton")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Datepicker'])[2]/following::a[1]")).click();
    Thread.sleep(500); 
    driver.navigate().back();
    driver.findElement(By.id("dropdownMenuButton")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Drag and Drop'])[2]/following::a[1]")).click();
    Thread.sleep(500); 
    driver.navigate().back();
    driver.findElement(By.id("dropdownMenuButton")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Dropdown'])[3]/following::a[1]")).click();
    Thread.sleep(500); 
    driver.navigate().back();
    driver.findElement(By.id("dropdownMenuButton")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Enabled and disabled elements'])[2]/following::a[1]")).click();
    Thread.sleep(500); 
    driver.navigate().back();
    driver.findElement(By.id("dropdownMenuButton")).click();
    driver.findElement(By.linkText("File Download")).click();
    Thread.sleep(500); 
    driver.navigate().back();
    driver.findElement(By.id("dropdownMenuButton")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='File Download'])[1]/following::a[1]")).click();
    Thread.sleep(500); 
    driver.navigate().back();
    driver.findElement(By.id("dropdownMenuButton")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Key and Mouse Press'])[2]/following::a[1]")).click();
    Thread.sleep(500); 
    driver.navigate().back();
    driver.findElement(By.id("dropdownMenuButton")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Modal'])[2]/following::a[1]")).click();
    Thread.sleep(500); 
    driver.navigate().back();
    driver.findElement(By.id("dropdownMenuButton")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Page Scroll'])[2]/following::a[1]")).click();
    Thread.sleep(500); 
    driver.navigate().back();
    driver.findElement(By.id("dropdownMenuButton")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Radio Button'])[2]/following::a[1]")).click();
    Thread.sleep(500); 
    driver.navigate().back();
    driver.findElement(By.id("dropdownMenuButton")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Switch Window'])[2]/following::a[1]")).click();
    Thread.sleep(500); 
    driver.navigate().back();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}


