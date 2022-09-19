package latihantest.cucumber.hrms.outline;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {
//		"src/test/resources/features/hrms-outline/04dashboard.feature",
//		"src/test/resources/features/hrms-outline/03loginvalid.feature",
		"src/test/resources/features/hrms-outline/01logininvalid.feature",
		"src/test/resources/features/hrms-outline/02loginempty.feature"},
glue = "latihantest.cucumber.hrms.outline",
monochrome=true,
plugin = {"pretty","html:target/hrms/htmlreport/LoginRunnerOutline.html",
		"json:target/hrms/jsonreport/LoginRunnerOutline.json",
		"junit:target/hrms/junitreport/LoginRunnerOutline.xml"})

public class OutlineRunner extends AbstractTestNGCucumberTests{

}
