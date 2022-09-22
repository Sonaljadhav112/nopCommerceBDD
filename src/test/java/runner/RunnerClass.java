package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Feature/Login.feature",
glue = "Stepdef",
dryRun =false,
plugin = {"pretty","html:Reports/report1.html",
	
		  "pretty","html:Reports/report1.xml"})
public class RunnerClass {

	


}
