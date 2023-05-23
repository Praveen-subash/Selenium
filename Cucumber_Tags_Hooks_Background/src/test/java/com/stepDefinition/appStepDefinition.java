package com.stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class appStepDefinition {
	
	@Given("This is a background")
	public void This_is_a_background() {
		
		System.out.println("===========This is a Background==========");
		
	}
	
	@Before
	public void beforeHook() {
		
		
		System.out.println("This is Before Hook");
	}
	
	@After
	public void afterHook() {
		
		
		System.out.println("This is After Hook");
	}
	
	@BeforeStep
	public void beforeStepHook() {
		
		
		System.out.println("This is Before STEP Hook");
	}
	
	@AfterStep
	public void afterStepHook() {
		
		
		System.out.println("This is After STEP Hook");
	}
	
	@Given("User is on NetBanking Landing Page")
	public void User_is_on_NetBanking_Landing_Page() {
		
		System.out.println("Given");
		
	}
	
	
	@When("User logs into old application with username and password")
	public void User_logs_into_application_with_old_username_and_password() {
		
		System.out.println("@When");
		
	}
	
	@Then("Home Page is populated")
	public void Home_Page_is_populated() {
		
		System.out.println("@Then");
		
	}
	
	@And("Cards are displayed with message {string}")
	public void Cards_are_displayed(String msg) {
		
		System.out.println("String message is "+msg);
		
	}
	
	@When("^User logs into application with (.+) and (.+)$")
	public void User_logs_into_application_with_username_and_password(String uname,String pwd) {
		
		System.out.println("Username is "+uname+"and password is "+pwd);
		
	}
}
