package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\eclipse-workspace\\TravelloBDDFramework\\src\\main\\java\\Features\\register.feature",
		glue = {"stepDefinitions"},
		format = {"pretty", "html:test-output", "json:json-output/cucumber.json"},     // using json we can generate report, read json and use it.
		monochrome = true,   // will give readable console output
		dryRun = false,
		strict = true  //fails if there is any pending features and stepdefinition 
		)


public class TestRunner {

}
