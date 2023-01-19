package com.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abstractComponents.AbstractComponent;

public class OrderPage extends AbstractComponent{
	
	WebDriver driver;  
	
	public OrderPage(WebDriver driver) {  
		
		super(driver); 
		this.driver = driver; 
		
		PageFactory.initElements(driver, this);  
	}
	
	@FindBy(css="tr td:nth-child(3)")  //**85
	List<WebElement> productNames;
	
	@FindBy(css="div.ng-star-inserted")  //**86
	WebElement waitForOrderPage;
	
	public boolean verifyOrderDisplay(List aList) {  //**84
		
		waitForElementToAppear(waitForOrderPage);
		boolean flag = false;
		for(int i=0;i<productNames.size();i++) {
			
			String prodName = productNames.get(i).getText().split(" ")[0].trim().toUpperCase();
			if(aList.contains(prodName)) {
				flag = true;
				
			}
			else{
				
				flag = false;
				break;
			}
			
		}
		
		return flag;
		
		
	}

}
