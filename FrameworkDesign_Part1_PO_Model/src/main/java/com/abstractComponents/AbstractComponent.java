package com.abstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pageobjects.CartPage;

public class AbstractComponent {  //**15
	
	WebDriver driver;  //**17
	// we are declaring driver bcos it is a parameter in webdriverwait
	//But we need to get the power of the driver from somewhere
	//so we are getting from pageobjects using super keyword
	//That will call the constructor here. Both has parameters driver so driver power comes to this class
	
	public AbstractComponent(WebDriver driver) {  //**19
		
		this.driver = driver; //**20
		PageFactory.initElements(driver, this);  //**33 This is added because goToCartPage is added
		
	}
	
	@FindBy(xpath="//button[@routerlink='/dashboard/cart']")  //**32
	WebElement viewCart;
	
	

	public void waitForElementToAppear(By findBy) {  //**16
		 
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(findBy)); //**21
		//In 21, By.xpath should not be hard coded.
		//so it is given in pageobjectproduct catalogue
		
		
	}
	
	public void waitForElementToDisAppear(By findBy) {  //**16
		 
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.invisibilityOfElementLocated(findBy)); //**21
		//In 21, By.xpath should not be hard coded.
		//so it is given in pageobjectproduct catalogue
		
		
	}
	
	//We have written it here instead of writing in ProductCatalog bcos the header is common.
	//So this will work for all pages
	public CartPage goToCartPage() {  //**31
		
		viewCart.click();
		
		return new CartPage(driver); //**63
		
	}
	
	public void jsClickInvisibleElement(WebElement eleToBeClicked) {  //**40
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", eleToBeClicked);
	}
	
	public void jsScrollIntoViewInvisibleElement(WebElement eleToBeScrolled) {  //**50
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", eleToBeScrolled);
		
		
	}

}
