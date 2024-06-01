package stepDefinitions;


import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


public class stepDefinition {

    @Given("^User is on Net Baanking Page$")
    public void user_is_on_net_baanking_page() throws Throwable {
        //Code to navigate to url
    	System.out.println("Navigated to the login url");
    }

    @When("^User logs into the application with Username and password$")
    public void user_logs_into_the_application_with_username_and_password() throws Throwable {
    	//Enter the credentials and click login btn
    	System.out.println("Application logged in");
        
    }

    @Then("^Home Page is displayed$")
    public void home_page_is_displayed() throws Throwable {
    	//validate if home page is displayed
    	System.out.println("Home page is displayed");
        
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
    	//Validate if cards section is displayed
    	System.out.println("Cards are displayed");
        
    }

}