import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class CountLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Count the no of links in the page
		int count = driver.findElements(By.tagName("a")).size();
		System.out.println("No of links is "+count);
		
		
		//Print the no of links in footer section
		WebElement footerDriver = driver.findElement(By.xpath("//div[@id='gf-BIG']"));		
		int footerLinks = footerDriver.findElements(By.tagName("a")).size();
		System.out.println("Footer Links "+footerLinks);
		
		//=======================================================================================
	
		//APPROACH 1 -  RAHUL SHETTY
		//Print the no of links in a certain column in the footer section
		
		WebElement footerColDriver = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]"));
		int footerColLinks = footerColDriver.findElements(By.tagName("a")).size();
		System.out.println("Footer Column Links using APPROACH 1 is "+footerColLinks);
		
		for(int t=1;t<footerColLinks;t++) {
			
			System.out.println(footerColDriver.findElements(By.tagName("a")).get(t).getText());		
			
			
			
			//For sequencce of keyboard operations, use Keys.chord
			
			String clickonKeys = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerColDriver.findElements(By.tagName("a")).get(t).sendKeys(clickonKeys);
                                            
			
		}
		
		System.out.println("==========================================================================================");
		
		//============================================================================================================
		
		//APPROACH 2 - OWN APPROACH
		//Print the number of links in the certain column in footer section
		int size = driver.findElements(By.xpath("//div[@id='gf-BIG'] //td[1] //a")).size();
		System.out.println("Footer Column Links using APPROACH 2 is "+size);
		
		for(int i=1;i<size;i++) {
			
			System.out.println(driver.findElements(By.xpath("//div[@id='gf-BIG'] //td[1] //a")).get(i).getText());
			
			Actions m = new Actions(driver);
			m.moveToElement(driver.findElements(By.xpath("//div[@id='gf-BIG'] //td[1] //a")).get(i))
								  .keyDown(Keys.CONTROL)
			                      .click()
			                      .build().perform();
			
			
	
			
			
		}
		
		
		
	}

}
