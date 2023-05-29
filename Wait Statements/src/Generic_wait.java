import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Generic_wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		
		//Implicitly waiting for 5 seconds globally.
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);		
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Declaring the array
		String[] itemsneeded = {"Pumpkin","Brocolli","Cucumber"};
		
		//If it is a single WebElement, then use the syntax WebElement prod = driver.findElement(By.cssSelector(".product-name"));
		// Since there are many elements, use the syntax List<WebElement> prod = driver.findElements(By.cssSelector(".product-name"));
	
		List<WebElement> prod = driver.findElements(By.cssSelector("h4.product-name"));	
		
		add_items(driver,itemsneeded,prod);
	
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		//Explicit Wait
		
		WebDriverWait w = new WebDriverWait(driver,10);
		//w.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("span.promoInfo"), "Code applied ..!"));
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Code applied ..!']")));
		
		String cap = driver.findElement(By.cssSelector("span.promoInfo")).getText();
		System.out.println("The discount is "+cap);
		
		
	}	
		
		public static void add_items(WebDriver driver,String[] itemsneeded,List<WebElement> prod) throws InterruptedException
		{
			System.out.println("Selecting through array list");		
			
			//Converting array to a array list
			List array_List = Arrays.asList(itemsneeded);
			int p=0;
			for(int k=0;k<prod.size();k++)
			{
				String value = driver.findElements(By.cssSelector("h4.product-name")).get(k).getText();
				String[] name = value.split("-");
				String trim_Value = name[0].trim();
				//String final_Val = value[0];
				//To check whether the value is contained in array list. Array list compares all the array values with the fetched value
				
				if(array_List.contains(trim_Value))
				{
					//int ind = k+1;
					//driver.findElement(By.xpath(("(//*[text()='ADD TO CART'])[+ind+]"))).click();
					p++;
					Thread.sleep(5000);
					driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(k).click();
					//System.out.println("The value selected is "+trim_Value);
					
				
					
					
					if(p==itemsneeded.length)
					{
						System.out.println("All values are selected");
						break;
					}
					
					
					
				}
				
			}
			
		}
		
		

	

}
