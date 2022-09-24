package ujian.ujiankelima.cucumber.articlepage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/test/resources/features/shop-demoqa-outline/invalid-comment/01commentinvalid.feature"},
glue = "ujian.ujiankelima.cucumber.articlepage",
monochrome=true,
plugin = {"pretty","html:target/shop-demoqa/htmlreport/ArticleRunnerOutline.html",
		"json:target/shop-demoqa/jsonreport/ArticleRunnerOutline.json",
		"junit:target/shop-demoqa/junitreport/ArticleRunnerOutline.xml"})

public class OutlineRunner extends AbstractTestNGCucumberTests{

}
