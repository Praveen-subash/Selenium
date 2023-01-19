package com.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abstractComponents.AbstractComponent;

public class CheckoutPage extends AbstractComponent{
	
	WebDriver driver;  //**44
	
	public CheckoutPage(WebDriver driver) {  //**45
		
		super(driver); 
		this.driver = driver; 
		
		PageFactory.initElements(driver, this);  
	}
	
	
	By applyCoupon = By.xpath("//button[text()='Apply Coupon']");  //**46
	
	@FindBy(xpath="//input[@placeholder='Select Country']")
	WebElement selectCountry;
	
	@FindBy(css = "[class*=ta-results]")  //**49
	WebElement results;
	
	@FindBy(css = "[class*=ta-results]>button>span")  //**50
	List<WebElement> resultsSpecificCountryName;
	
	@FindBy(xpath="//a[text()='Place Order ']")
	WebElement submit;
	
	
	public void selectCountry(String countryName) throws InterruptedException {    //**47
		
		
		waitForElementToAppear(applyCoupon);
		selectCountry.sendKeys(countryName);
		
		Thread.sleep(2000);
		
		if(results.isDisplayed()) {  //**51
			
			jsScrollIntoViewInvisibleElement(results);
			
			for(int i=0;i<resultsSpecificCountryName.size();i++) {
				
				if(resultsSpecificCountryName.get(i).getText().equalsIgnoreCase(countryName)) {
					
					resultsSpecificCountryName.get(i).click();
				}
				
			}
		}
	}
	
	public ConfirmationPage submitOrder() throws InterruptedException {  //**52
		jsScrollIntoViewInvisibleElement(submit);
		Thread.sleep(2000);
		submit.click();
		ConfirmationPage confirmationPage = new ConfirmationPage(driver);
		return confirmationPage; //**65
	}
	
	

}
