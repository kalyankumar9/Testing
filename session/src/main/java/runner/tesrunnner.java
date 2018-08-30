package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "cucumber",glue = {"definition"},format = {"pretty","html:target/output"})

public class tesrunnner {
	

}
