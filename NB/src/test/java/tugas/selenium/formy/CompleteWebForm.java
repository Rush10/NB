package tugas.selenium.formy;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CompleteWebForm {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	WebDriverManager.firefoxdriver().setup();
    driver = new FirefoxDriver();
    baseUrl = "https://www.google.com/";
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCompleteWebForm() throws Exception {
    driver.get("https://formy-project.herokuapp.com/form");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Complete Web Form'])[1]/following::h1[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Complete Web Form'])[1]/following::h1[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Complete Web Form'])[1]/following::h1[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Complete Web Form'])[2]/following::label[1]")).click();
    driver.findElement(By.xpath("//body")).click();
    driver.findElement(By.id("first-name")).click();
    driver.findElement(By.id("first-name")).clear();
    driver.findElement(By.id("first-name")).sendKeys("Jkt");
    driver.findElement(By.xpath("//body")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='First name'])[1]/following::label[1]")).click();
    driver.findElement(By.xpath("//body")).click();
    driver.findElement(By.id("last-name")).click();
    driver.findElement(By.id("last-name")).clear();
    driver.findElement(By.id("last-name")).sendKeys("Jkt");
    driver.findElement(By.xpath("//body")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Last name'])[1]/following::label[1]")).click();
    driver.findElement(By.xpath("//body")).click();
    driver.findElement(By.id("job-title")).click();
    driver.findElement(By.id("job-title")).clear();
    driver.findElement(By.id("job-title")).sendKeys("Web");
    driver.findElement(By.xpath("//body")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Job title'])[1]/following::label[1]")).click();
    driver.findElement(By.id("radio-button-1")).click();
    driver.findElement(By.id("radio-button-2")).click();
    driver.findElement(By.id("radio-button-3")).click();
    driver.findElement(By.id("radio-button-2")).click();
    driver.findElement(By.id("radio-button-1")).click();
    driver.findElement(By.id("radio-button-3")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Highest level of education'])[1]/following::div[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Highest level of education'])[1]/following::div[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sex'])[1]/preceding::div[1]")).click();
    driver.findElement(By.xpath("//*/text()[normalize-space(.)='Sex']/parent::*")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sex'])[1]/following::div[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sex'])[1]/following::div[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Years of experience:'])[1]/preceding::div[1]")).click();
    driver.findElement(By.id("checkbox-1")).click();
    driver.findElement(By.id("checkbox-2")).click();
    driver.findElement(By.id("checkbox-3")).click();
    driver.findElement(By.id("checkbox-1")).click();
    driver.findElement(By.id("checkbox-2")).click();
    driver.findElement(By.id("checkbox-3")).click();
    driver.findElement(By.id("checkbox-1")).click();
    driver.findElement(By.id("checkbox-2")).click();
    driver.findElement(By.id("checkbox-2")).click();
    driver.findElement(By.id("checkbox-1")).click();
    driver.findElement(By.id("checkbox-2")).click();
    driver.findElement(By.id("checkbox-3")).click();
    driver.findElement(By.id("checkbox-3")).click();
    driver.findElement(By.id("checkbox-2")).click();
    driver.findElement(By.id("checkbox-3")).click();
    driver.findElement(By.id("checkbox-1")).click();
    driver.findElement(By.id("checkbox-1")).click();
    driver.findElement(By.id("checkbox-3")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date'])[1]/preceding::label[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Complete Web Form'])[2]/following::div[1]")).click();
    driver.findElement(By.id("select-menu")).click();
    driver.findElement(By.xpath("//option[@value='0']")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Complete Web Form'])[2]/following::div[1]")).click();
    driver.findElement(By.id("select-menu")).click();
    new Select(driver.findElement(By.id("select-menu"))).selectByVisibleText("0-1");
    driver.findElement(By.xpath("//option[@value='1']")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Complete Web Form'])[2]/following::div[1]")).click();
    driver.findElement(By.id("select-menu")).click();
    new Select(driver.findElement(By.id("select-menu"))).selectByVisibleText("2-4");
    driver.findElement(By.xpath("//option[@value='2']")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Complete Web Form'])[2]/following::div[1]")).click();
    driver.findElement(By.id("select-menu")).click();
    new Select(driver.findElement(By.id("select-menu"))).selectByVisibleText("5-9");
    driver.findElement(By.xpath("//option[@value='3']")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Complete Web Form'])[2]/following::div[1]")).click();
    driver.findElement(By.id("select-menu")).click();
    new Select(driver.findElement(By.id("select-menu"))).selectByVisibleText("10+");
    driver.findElement(By.xpath("//option[@value='4']")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Complete Web Form'])[2]/following::div[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Years of experience:'])[1]/following::label[1]")).click();
    driver.findElement(By.id("datepicker")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='«'])[1]/following::th[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='«'])[2]/following::th[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='«'])[3]/following::th[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[2]/following::th[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[2]/following::th[2]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[2]/following::th[2] | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='»'])[3]/following::span[7]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='«'])[2]/following::th[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::th[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Jun'])[1]/following::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='July 2015'])[1]/following::th[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='August 2015'])[1]/following::th[1]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='September 2015'])[1]/following::th[1] | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Submit'])[1]/following::th[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Submit'])[1]/following::th[2]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Submit'])[1]/following::th[2] | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sa'])[1]/following::td[19]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Complete Web Form'])[2]/following::div[1]")).click();
    driver.findElement(By.id("datepicker")).click();
    driver.findElement(By.id("datepicker")).clear();
    driver.findElement(By.id("datepicker")).sendKeys("11/25/10");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Complete Web Form'])[2]/following::div[1]")).click();
    driver.findElement(By.id("datepicker")).click();
    driver.findElement(By.id("datepicker")).click();
    driver.findElement(By.id("datepicker")).click();
    driver.findElement(By.id("datepicker")).clear();
    driver.findElement(By.id("datepicker")).sendKeys("01/15/3001");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date'])[1]/following::div[1]")).click();
    driver.findElement(By.id("datepicker")).click();
    driver.findElement(By.id("datepicker")).clear();
    driver.findElement(By.id("datepicker")).sendKeys("03/06/2022");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Date'])[1]/following::div[1]")).click();
    driver.findElement(By.linkText("Submit")).click();
    
    Thread.sleep(2000);
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
