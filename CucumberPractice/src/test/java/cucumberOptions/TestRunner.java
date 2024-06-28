package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//features should have the featureFiles package. Dont specify the feature files in the path. Else, it'll take only that file
//in glue, give the pack name alone. NOTE THAT THE STEP DEFINITION SHOULD BE IN THE SAME PARENT AS TEST RUNNER (src/test/java)
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/featureFiles",glue={"stepDefinitions"})

public class TestRunner {
	
	

}
