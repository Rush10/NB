package tugas.selenium.demoqa.elements;

import java.util.regex.Pattern;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Buttons {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private Robot robot;
  private Actions action;
  private WebElement rightBtn, doubleBtn;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	WebDriverManager.firefoxdriver().setup();
    driver = new FirefoxDriver();
    robot = new Robot();
    baseUrl = "https://www.google.com/";
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testButtons() throws Exception {
	  
//	Thread.sleep(3000);
    driver.get("https://demoqa.com/buttons");
    action = new Actions(driver);
    rightBtn = driver.findElement(By.id("rightClickBtn"));
    doubleBtn = driver.findElement(By.id("doubleClickBtn"));
    
    //one click
//    driver.findElement(By.xpath("//div[@value='Click Me']")).click();
    rightBtn.click();
    doubleBtn.click();
    
    //double click
    //btn click me belum
    action.doubleClick(rightBtn).perform();
    action.doubleClick(doubleBtn).perform();
    
    //right click
    //btn click me belum
    action.contextClick(rightBtn).perform();
    action.contextClick(doubleBtn).perform();
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

