package com.StepDefinition;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.runner.RunWith;
import org.testng.Assert;

import com.pageobjects.CartPage;
import com.pageobjects.CheckoutPage;
import com.pageobjects.ConfirmationPage;
import com.pageobjects.LandingPage;
import com.pageobjects.ProductCatalogue;
import com.testComponents.BaseTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinition_Implementation extends BaseTest{
	
	//**90 is adding feature file
	public LandingPage landingPage;
	public ProductCatalogue productCatalogue;
	public CartPage cartPage;
	public CheckoutPage checkout;
	public ConfirmationPage confirmationPage;
	List<String> aList = new ArrayList<String>();//**94
	
	@Given("I landed on ecommerce page") //**91
	public void I_landed_on_ecommerce_page() throws IOException {  //Just a syntax to write same given method with underscore
		
		landingPage = launchApplication();  //Since this method returns landingPage object, we are catching it
	
	}
	  
	@Given("^Logged in with username (.+) and password (.+)$")  //**92 (.+) is given as regular expression
	//SInce there is a regular expression, we are starting with ^ and ending with $
	public void Logged_in_with_username_and_password(String uname, String pwd) {  
		//Cucumber smartly gets the parameters and stores it in uname and pwd
		
		productCatalogue = landingPage.loginApplication(uname,pwd); 
	}
	
	@When("^I add the product (.+) to the cart$")
	public void I_add_the_product_to_the_cart(String prod_name) {  //**93

		aList.add(prod_name);
		productCatalogue.getProductList();
		productCatalogue.addProductsToCart(aList);  
		aList.remove(prod_name);
		
	}
	
	@And("^Checkout (.+) and submit the order$")  //**95
	public void Checkout_and_submit_the_order(String prod_name) throws InterruptedException { //**95
		
		cartPage = productCatalogue.goToCartPage();
		cartPage.waitForCartPageToLoad(); 
		cartPage.verifyProductDisplay(aList);
		checkout  = cartPage.goToCheckout(); 
		checkout.selectCountry("India");
		confirmationPage = checkout.submitOrder();  
		
	}
	
	@Then("{string} message is displayed")//**96
	//Imp note that since we are getting the string to be verified from the .feature file, .+ wont work
	//so {string} is taken as reg exp
	public void message_displayed_confirmation_page(String msg) {
		
		
		Assert.assertEquals(confirmationPage.getConfirmationMessage(), msg); 
	}
	
	@Then("{string} is displayed")   //**97
	public void incorrect_id_pw_is_displayed(String msg) {
		
		String errorMsg = landingPage.getErrorMessage(); 
		Assert.assertEquals("Incorrect email or password.", errorMsg); 
		
	}

}
