package RunnerFilles;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "src/test/java/features/CredentialsFunctionality.feature",
		glue = "stepDefinations")
		
	
		


public class TestRunner {

}
