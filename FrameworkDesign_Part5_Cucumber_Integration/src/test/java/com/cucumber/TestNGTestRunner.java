package com.cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/com/cucumber",glue="com.StepDefinition",
monochrome=true,plugin = {"html:target/cucumber.html"},tags="@Regression")
public class TestNGTestRunner extends AbstractTestNGCucumberTests{
	
	//Comment out tags = REgression if yu dont need it
	//It means in the path src/test/java/com/cucumber it runs all feature files with Regression tag added

}
