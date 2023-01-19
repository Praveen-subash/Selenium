package com.tests;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pageobjects.CartPage;
import com.pageobjects.CheckoutPage;
import com.pageobjects.ConfirmationPage;
import com.pageobjects.LandingPage;
import com.pageobjects.OrderPage;
import com.pageobjects.ProductCatalogue;
import com.testComponents.BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SubmitOrderTest extends BaseTest{  //**68 where yu are extending base test

	@Test(dataProvider = "getData",groups={"Purchase"}) //**84
	public void submitOrder(String email,String password) throws IOException, InterruptedException {
		
		
		//Landing Page
//		LandingPage landingPage = launchApplication();  //**72 In launch application 71 object is created
		//**74 - commenting this step bcos 73 is beforeMethod

		ProductCatalogue productCatalogue = landingPage.loginApplication(email,password);  //**9
		//In 61 we have created a object for the next page and returning here.
		
		//Product catalog page 	
		String[] arr = {"IPHONE", "ZARA"};
		List<String> aList = Arrays.asList(arr);
//		ProductCatalogue productCatalogue =  new ProductCatalogue();
//		productCatalogue = new ProductCatalogue(driver); //*24
		productCatalogue.getProductList();
		productCatalogue.addProductsToCart(aList);  //**30
		CartPage cartPage = productCatalogue.goToCartPage(); //**34 as per inheritance even productCatalogue has access
		//In 63 we have created a object for the next page and returning here.
		
		//Cart Page
//		CartPage cartPage = new CartPage(driver); //**35
		cartPage.waitForCartPageToLoad();  //**36
		cartPage.verifyProductDisplay(aList);  //**37
		CheckoutPage checkout = cartPage.goToCheckout(); //**43
		//In 64 we have created a object for the next page and returning here.
		
		//Checkout Page
//		CheckoutPage checkout = new CheckoutPage(driver);  //**48
		checkout.selectCountry("India");
		ConfirmationPage confirmationPage = checkout.submitOrder();  //**53
		//In 65 we have created a object for the next page and returning here.
		
		//Confirmation Page
//		ConfirmationPage confirmationPage = new ConfirmationPage(driver); //**59
		Assert.assertEquals(confirmationPage.getConfirmationMessage(), "THANKYOU FOR THE ORDER.");  //**60

	}
	
	@Test(dependsOnMethods = "submitOrder",dataProvider = "getDataUsingHashMap")  //**85
	public void orderHistoryTest(HashMap<String,String> input) {  //**83  //**88 is add input as a parameter
		
		String[] arr = {"IPHONE", "ZARA"};
		List<String> aList = Arrays.asList(arr);
		ProductCatalogue productCatalogue = landingPage.loginApplication(input.get("email"),input.get("password"));
		productCatalogue.getProductList();
		OrderPage ordersPage = productCatalogue.goToOrdersPage();
		boolean flagVal = ordersPage.verifyOrderDisplay(aList);
		Assert.assertEquals(flagVal, true);
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] object = new Object [2][2];
		
		object[0][0] = "Tapamth@gmail.com";
		object[0][1] = "Tapamth1!0";
		object[1][0] = "tod@gmail.com";
		object[1][1] = "Tapamth1!0";
		
		return object;

	}
	
	@DataProvider
	//This method has data from json file Purchase order.json
	public Object[][] getDataUsingHashMap() throws IOException { //**86
		
		
		List<HashMap<String,String>> data = getJsonDataToMap(System.getProperty("user.dir")+"\\src\\test\\java\\com\\data\\PurchaseOrder.json");
		Object[][] object = new Object[][] {{data.get(0)}, {data.get(1)}};
		
		return object;
		
		
		
		
		
	}

}
