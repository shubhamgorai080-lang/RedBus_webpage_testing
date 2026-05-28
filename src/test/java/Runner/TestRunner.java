package Runner;

import io.cucumber.java.en.Then;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/resources",
		glue="stepdefinations",
		plugin = {"pretty", "html:target/cucumber-reports.html"})

public class TestRunner extends AbstractTestNGCucumberTests{
	
}
