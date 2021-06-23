package tests.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	//"html:target/cucumb	er-reports", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
	plugin = { "pretty", "json:target/cucumber.json", "html:target/cucumber.html" }, 
	glue = { "steps.definitions", "app.hooks" }, 
	features = {"src/test/resources/features" }, 
	tags = "@cc5",
	monochrome = true,
	dryRun=false
)



public class RunnerTest {
	
	


}
