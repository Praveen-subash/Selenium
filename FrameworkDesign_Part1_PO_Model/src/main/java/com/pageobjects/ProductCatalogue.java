package com.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.abstractComponents.AbstractComponent;

import dev.failsafe.internal.util.Assert;

public class ProductCatalogue extends AbstractComponent {   //**17 extending AbstractComponent
	
	WebDriver driver;  //**12
	
	public  ProductCatalogue(WebDriver driver) {  //**13
		
		super(driver); //**21   every page object should give the power to the abstractcomponents
		//only then the methods will be reusable
		this.driver = driver; 
		
		PageFactory.initElements(driver, this);  
	}

	@FindBy(xpath="//div[@class='card-body']")  //**14
	List<WebElement> products;
	
	By productsBy = By.xpath("//div[@class='card-body']"); //*22 This is for giving params to explicit wait
	//WE cannot use Page factory here bcos explicit wait accept only By classes
	
	@FindBy(xpath="//div[@class='card-body']//h5/b")  //**26
	List<WebElement> productName;
	
	@FindBy(xpath="//button[text()=' Add To Cart']")  //**28
	List<WebElement> addToCart;
	

	By waitForProductAddedToken = By.cssSelector("div#toast-container");  //**29
	

	public List<WebElement> getProductList() {  //*23
		
		waitForElementToAppear(productsBy); 
		return products;
	}
	
	public void addProductsToCart(List<String> aList) {  //*27
		
		for(int i=0;i<products.size();i++) {
			
			String itemName = productName.get(i).getText().split(" ")[0];
			
			if(aList.contains(itemName)) {
				
				System.out.println("Item "+itemName+" is available in the list");
				addToCart.get(i).click();
				waitForElementToAppear(waitForProductAddedToken);
				waitForElementToDisAppear(waitForProductAddedToken);
			}
			
			
			
		}
		
		
	}
	
	
	
	
	
	
	
	

}
