package com.tests;
import java.time.Duration;
import java.util.Arrays;
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

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EdgeOptions e = new EdgeOptions();
		e.addArguments("start-maximized");
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(e);
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//Login
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("Tapamth@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Tapamth1!0");
		driver.findElement(By.id("login")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='card-body']")));
		
		//Add items to cart
		String[] arr = {"IPHONE", "ZARA"};
		List<String> aList = Arrays.asList(arr);
		
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='card-body']"));
		
		for(int i=0;i<ele.size();i++) {

			String itemName = driver.findElements(By.xpath("//div[@class='card-body']//h5/b")).get(i).getText().split(" ")[0];
			System.out.println(itemName);
			
			if(aList.contains(itemName)) {
				
				System.out.println("Item "+itemName+" is available in the list");
				
				driver.findElements(By.xpath("//button[text()=' Add To Cart']")).get(i).click();
				
				
				w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#toast-container")));
				w.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div#toast-container")));
			
			}			
			
			
			
		}
		
		driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Continue Shopping']")));
		
		
		//Check if the added items are available in the cart
		List<WebElement> itemsListInTheCart = driver.findElements(By.xpath("//div[@class='cartSection']/h3"));
		
		if(itemsListInTheCart.size()==aList.size()) {
			
			
			System.out.println("The no of items in the cart matches with the added items");
			
			for(int i=0;i<itemsListInTheCart.size();i++) {
				
				String cartItem = itemsListInTheCart.get(i).getText().split(" ")[0].trim(); 	
				
				if(aList.contains(cartItem)) {
					
					System.out.println("The item "+cartItem+" is available in the cart");
				}
				
				else {
					
					System.out.println("The item "+cartItem+" is NOT available in the cart");
				}
				
			}
			
		}
		
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", driver.findElement(By.cssSelector(".totalRow button")));
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Apply Coupon']")));
		
		driver.findElement(By.xpath("//input[@placeholder='Select Country']")).sendKeys("India");
		
		Thread.sleep(2000);
		
		if(driver.findElement(By.cssSelector("[class*=ta-results]")).isDisplayed()) {
			
			js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.cssSelector("[class*=ta-results]>button>span")));
			
			List<WebElement> dropDownList = driver.findElements(By.cssSelector("[class*=ta-results]>button>span"));
			
			for(int i=0;i<dropDownList.size();i++) {
				
				if(dropDownList.get(i).getText().equalsIgnoreCase("India")) {
					
					dropDownList.get(i).click();
				}
				
			}
			
		}
		
		
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//a[contains(@class,'action__submit')]")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Place Order ']")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.hero-primary")));
		
		String confirmTxt = driver.findElement(By.cssSelector("h1.hero-primary")).getText();
		
		Assert.assertEquals(confirmTxt.trim(), "THANKYOU FOR THE ORDER.");
		
		

		
	}

}
