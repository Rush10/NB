package ujian.ujiankelima.cucumber.loginpage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/test/resources/features/shop-demoqa-outline/invalid-login/01logininvalid.feature"},
glue = "ujian.ujiankelima.cucumber.loginpage",
monochrome=true,
plugin = {"pretty","html:target/shop-demoqa/htmlreport/LoginRunnerOutline.html",
		"json:target/shop-demoqa/jsonreport/LoginRunnerOutline.json",
		"junit:target/shop-demoqa/junitreport/LoginRunnerOutline.xml"})

public class OutlineRunner extends AbstractTestNGCucumberTests{

}
