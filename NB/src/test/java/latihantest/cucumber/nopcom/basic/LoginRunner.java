package latihantest.cucumber.nopcom.basic;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/test/resources/features/nopcom/basic/01login.feature"},
glue = "latihantest.cucumber.nopcom.basic",
monochrome=true,
plugin = {"pretty","html:target/nopcom/htmlreport/LoginRunner.html",
		"json:target/nopcom/jsonreport/LoginRunner.json",
		"junit:target/nopcom/junitreport/LoginRunner.xml"})

public class LoginRunner extends AbstractTestNGCucumberTests{

}
