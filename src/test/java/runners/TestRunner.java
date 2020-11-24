package runners;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;

//Test Comment new
@Test
@CucumberOptions(
		features = {"src/test/resources/features"},

		glue = { "stepdefinitions"},

		tags = { "@gk" },
		
		plugin = {"pretty", "json:target/cucumber.json" },
				
		
		
		monochrome = true

)

public class TestRunner extends CustomRunner {

}