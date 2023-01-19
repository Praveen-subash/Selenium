package com.tests;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.pageobjects.CartPage;
import com.pageobjects.ProductCatalogue;
import com.testComponents.BaseTest;
import com.testComponents.RetryAnalyzer;

public class ErrorValidationsTest extends BaseTest{
	
	@Test(groups = {"Error Validation"}, retryAnalyzer = RetryAnalyzer.class) //**97 giving retryAnalyzer = RetryAnalyzer.class
	public void LoginErrorValidation() {  //**77
		
		
		landingPage.loginApplication("Tapamth@gmail.com","DUMMY");
		String errorMsg = landingPage.getErrorMessage();  //**81
		Assert.assertEquals("Incorrect email or password", errorMsg);  //**82
		
	}
	
	@Test
	public void ProductErrorValidation() {   //**83
		
		ProductCatalogue productCatalogue = landingPage.loginApplication("Tapamth@gmail.com","Tapamth1!0");  
		
		String[] arr = {"IPHONE", "ZARA"};
		List<String> aList = Arrays.asList(arr);

		productCatalogue.getProductList();
		productCatalogue.addProductsToCart(aList);  
		CartPage cartPage = productCatalogue.goToCartPage(); 
		cartPage.waitForCartPageToLoad();  
		cartPage.verifyProductDisplay(aList);
	}

}
