package com.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.abstractComponents.AbstractComponent;

public class CartPage extends AbstractComponent{
	
WebDriver driver;  //**34
	
	public  CartPage(WebDriver driver) {  //**35
		
		super(driver); 
		this.driver = driver; 
		
		PageFactory.initElements(driver, this);  
	}
	
	By contShopping = By.xpath("//button[text()='Continue Shopping']"); //**37
	 
	@FindBy(xpath="//div[@class='cartSection']/h3")  //**39
	List<WebElement> cartBox;
	
	@FindBy(css=".totalRow button")  //**41
	WebElement checkout;
	
	public void waitForCartPageToLoad() {  //**36
		
		waitForElementToAppear(contShopping);
	}
	
	public void verifyProductDisplay(List<String> aList) {   //**38
		
		if(cartBox.size()==aList.size()) {
			
			for(int i=0;i<cartBox.size();i++) {
				
				String cartItem = cartBox.get(i).getText().split(" ")[0].trim();
				
				if(aList.contains(cartItem)) {
					
					System.out.println("The item "+cartItem+" is available in the cart");
				}
				
				else {
					
					System.out.println("The item "+cartItem+" is NOT available in the cart");
				}
				
			}
			
		}
		
		
		
	}
	
	public CheckoutPage goToCheckout() {  //**42
		
		jsClickInvisibleElement(checkout);
		return new CheckoutPage(driver);   //**64
	}
	

}
