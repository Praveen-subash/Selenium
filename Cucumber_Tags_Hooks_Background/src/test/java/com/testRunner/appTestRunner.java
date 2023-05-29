package com.testRunner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import io.cucumber.testng.CucumberOptions;





@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/com/feature",glue={"com/stepDefinition"},monochrome=true,plugin = {"html:target/cucumber.html"},tags="@Smoke and @Important")

public class appTestRunner {
	
	
	

}
