package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.abstractComponents.AbstractComponent;

public class ConfirmationPage extends AbstractComponent{
	
	WebDriver driver;  //**54
	
	public  ConfirmationPage(WebDriver driver) {  //**55
		
		super(driver); 
		this.driver = driver; 
		
		PageFactory.initElements(driver, this);  
	}
	
	@FindBy(css="h1.hero-primary") //**56
	WebElement confirmationMessage;
	
	By confirmMsg = By.cssSelector("h1.hero-primary"); //**57
	
	public String getConfirmationMessage() { //**58
		
		
		waitForElementToAppear(confirmMsg);
		jsScrollIntoViewInvisibleElement(confirmationMessage);
		String confirmTxt = confirmationMessage.getText();
		
		return confirmTxt;
		
	}

	
	
}	