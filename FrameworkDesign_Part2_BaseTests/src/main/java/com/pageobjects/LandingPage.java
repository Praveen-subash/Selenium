package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abstractComponents.AbstractComponent;

public class LandingPage extends AbstractComponent {  //**16
	//16 has step of extending the AbstractCOmponent. We have wait method there so we may use it in this page also
	//That is a utility. So we have extended it
	
	
	WebDriver driver;  //**1
	
	public LandingPage(WebDriver driver) {
		
		super(driver); //**18
		this.driver = driver;  //**2
		//this. driver refers current class instance variable	
		// if you dont pass driver here, the above driver will have no value. It will just be a webdriver
		//So we are creating an object in SubmitOrderTest and sending the driver as a parameter which is created in the test
		PageFactory.initElements(driver, this);  //**6
		//initelements will convert below find by annotations to driver.findelement(By.)
	}

	@FindBy(id="userEmail")  //**3
	WebElement userEmail;
	
	@FindBy(id="userPassword")  //**4
	WebElement passwordEle;
	
	@FindBy(id="login")    //**5
	WebElement submit;
	
	@FindBy(css="[class*=flyInOut]") //**79
	WebElement errorMessage;
	
	public ProductCatalogue loginApplication(String userName, String password) {  //**8
		
		userEmail.sendKeys(userName);  
		passwordEle.sendKeys(password);
		submit.click();
		ProductCatalogue productCatalogue = new ProductCatalogue(driver);
		
		return productCatalogue;  //**61 (Here, instead of creating objects in the tests, we are
		                                               // creating objects in the previous page object page itself)
		//So the return type is ProductCatalogue
	}
	
	public void goTo() { //**10
		
		driver.get("https://rahulshettyacademy.com/client");
	}
	
	public String getErrorMessage() {  //**78
		
		waitForElementToAppear(errorMessage);
		return errorMessage.getText();
	}
	
	
	
	

}
