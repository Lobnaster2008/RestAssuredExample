package stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/" }, plugin = { "pretty", "html:target/cucumber-report-registration.html" ,
		"json:target/cucumber-allure.json" },
            tags = ("@books"))
public class RunCukeIT {

}