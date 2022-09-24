package latihan.selenium.framework.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class Utils {
	private static Robot robot;
	private static JavascriptExecutor js;
	public static int testCount = 0;
	public static int countOutline = 1;
	
	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+"/FailedTestScreenshot/"
				+screenshotName+"_"+dateName+".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}
	
	public static void delay(int detik, String delays) {
		if(delays.equalsIgnoreCase("y"))
		{
			try {
				Thread.sleep(1000*detik);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
	
	public static void scrollDownByVisibleElement(WebElement element, WebDriver driver) {
		js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();",element );	
	}
	
	public static void scrollDownByPixel(int vertical, WebDriver driver) {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+vertical+")");
	}
	
	public static void scrollDownToButtom(WebDriver driver) {
		js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public static void zoomOut(int n) throws AWTException{
	  	robot = new Robot();
	  	for (int i = 0; i < n; i++) {			
	  		robot.keyPress(KeyEvent.VK_CONTROL);
	  		robot.keyPress(KeyEvent.VK_SUBTRACT);
	  		robot.keyRelease(KeyEvent.VK_CONTROL);
	  		robot.keyRelease(KeyEvent.VK_SUBTRACT);
		}
	}
	
	public static void zoomIn(int n) throws AWTException{
	  	robot = new Robot();
	  	for (int i = 0; i < n; i++) {			
	  		robot.keyPress(KeyEvent.VK_CONTROL);
	  		robot.keyPress(KeyEvent.VK_ADD);
	  		robot.keyRelease(KeyEvent.VK_CONTROL);
	  		robot.keyRelease(KeyEvent.VK_ADD);
		}
	}
}