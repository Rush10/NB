package ujian.ujiankelima.cucumber.articlepage;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import latihan.selenium.framework.driver.connection.DriverSingleton;
import latihan.selenium.framework.utils.Constants;
import ujian.ujiankelima.cucumber.scenariotest.ShopDemoqaArticleOutline;
import latihan.selenium.framework.utils.Utils;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class OutlineHooks {
	public static WebDriver driver;
	public static ExtentTest extentTest;
	public static ExtentReports reports = new ExtentReports("target/shop-demoqa/extentreport/shop-demoqa-comment-outline.html");
	private static ShopDemoqaArticleOutline[] tests = ShopDemoqaArticleOutline.values();
	private static final int[] DATA_OUTLINE = {6,6,1,1};
	private String testReport = "";
	
	@Before
	public void setUp() {
		
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		testReport = tests[Utils.testCount].getTestName();
		extentTest = reports.startTest(testReport);
		Utils.countOutline++;
		if(Utils.countOutline==DATA_OUTLINE[Utils.testCount])
		{
			Utils.countOutline=1;
			Utils.testCount++;
		}
	}
	
	@AfterStep
	public void getResultStatus(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			String screenshotPath = Utils.getScreenshot(driver, "SHOP_DEMOQA_OutlineHooks"+scenario.getName().replace(" ", "_"));
			extentTest.log(LogStatus.FAIL, scenario.getName()+"\n"
					+extentTest.addScreenCapture(screenshotPath));
		}
	}
	
	@After
	public void closeObject() {
		reports.endTest(extentTest);
		reports.flush();
	}
	
//	@AfterTest
	@AfterAll
	public static void closeBrowser() {
		Utils.delay(2, Constants.GLOB_PARAM_DELAY);
		DriverSingleton.closeObjectInstance();
	}
}
