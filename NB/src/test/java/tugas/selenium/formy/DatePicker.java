package tugas.selenium.formy;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {
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
  public void testDatePicker() throws Exception {
    driver.get("https://formy-project.herokuapp.com/datepicker");
    driver.findElement(By.id("datepicker")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='«'])[1]/following::th[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='«'])[2]/following::th[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='«'])[3]/following::th[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[2]/following::th[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[2]/following::th[2]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[2]/following::th[2] | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='«'])[3]/following::th[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='»'])[3]/following::span[4]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='«'])[2]/following::th[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::th[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Clear'])[1]/following::th[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='«'])[2]/following::th[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Oct'])[1]/following::span[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='November 2022'])[1]/following::th[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Datepicker'])[2]/following::th[2]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Datepicker'])[2]/following::th[2]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='Datepicker'])[2]/following::th[2] | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sa'])[1]/following::td[18]")).click();
    driver.findElement(By.id("datepicker")).click();
    driver.findElement(By.id("datepicker")).clear();
    driver.findElement(By.id("datepicker")).sendKeys("10/10/20034");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Datepicker'])[2]/following::div[3]")).click();
    driver.findElement(By.id("datepicker")).click();
    driver.findElement(By.id("datepicker")).clear();
    driver.findElement(By.id("datepicker")).sendKeys("06/03/0");
    driver.findElement(By.xpath("//*/text()[normalize-space(.)='']/parent::*")).click();
    driver.findElement(By.id("datepicker")).click();
    driver.findElement(By.id("datepicker")).clear();
    driver.findElement(By.id("datepicker")).sendKeys("07/04/3000");
    driver.findElement(By.xpath("//*/text()[normalize-space(.)='']/parent::*")).click();
    driver.findElement(By.id("datepicker")).click();
    driver.findElement(By.id("datepicker")).clear();
    driver.findElement(By.id("datepicker")).sendKeys("01/03/2023");
    driver.findElement(By.xpath("//*/text()[normalize-space(.)='']/parent::*")).click();
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

