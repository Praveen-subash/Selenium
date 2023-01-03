package stepDefinitions;


import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {

    @Given("^User is on Net Baanking Page$")
    public void user_is_on_net_baanking_page() throws Throwable {
        
    	System.out.println("Navigated to the login url");
    }
    
    //We are passing unmae and pw as arguments
    @When("^User logs into the application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_logs_into_the_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
    	System.out.println("Logged in using "+strArg1+ " and " +strArg2);
    }

    @Then("^Home Page is displayed$")
    public void home_page_is_displayed() throws Throwable {
    	
    	System.out.println("Home page is displayed");
        
    }
    
    //Similarly we have passed with true false
    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_are_displayed_are_something(String strArg1) throws Throwable {
    	System.out.println("Cards displayed as "+strArg1);
    	System.out.println("=======");
    }

}