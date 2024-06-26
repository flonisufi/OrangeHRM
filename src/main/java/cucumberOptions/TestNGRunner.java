package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/features",monochrome = true,publish = true
,tags = "@Test",glue = "stepDefinitions"
,plugin = {"html:target/cucumber.html"
,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
,"rerun:target/failed_scenarios.txt"})

public class TestNGRunner extends AbstractTestNGCucumberTests {
}
