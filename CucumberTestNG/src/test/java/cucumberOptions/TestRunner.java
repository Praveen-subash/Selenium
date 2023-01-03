package cucumberOptions;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//features should have the featureFiles package. Dont sspecify the feature files in the path. Else, it'llt ake only that file
//in glue, give the packe name alone. NOTE THAT THE STEP DEFINITION SHOULD BE IN THE SAME PARENT AS TEST RUNNER (src/test/java)

//@RunWith(Cucumber.class)

//NOTE : COMMENT @RunWith and add extends AbstractTestNGCucumberTests to convert this into TestNG class
@CucumberOptions(features="src/test/java/featureFiles",glue="stepDefinitions")

public class TestRunner extends AbstractTestNGCucumberTests{
	
	

}
