import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.bytebuddy.jar.asm.Handle;

public class ChildWindowLoops {

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
	
		//APPROACH 1 -  RAHUL SHETTY
		//Print the no of links in a certain column in the footer section
		
		WebElement footerColDriver = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]"));
		int footerColLinks = footerColDriver.findElements(By.tagName("a")).size();
		System.out.println("Footer Column Links using APPROACH 1 is "+footerColLinks);
		
		for(int t=1;t<footerColLinks;t++) {
			
			System.out.println(footerColDriver.findElements(By.tagName("a")).get(t).getText());		
			
			//For sequencce of keyboard operations, use Keys.chord
			//Note that hover action is not needed
			
			String clickonKeys = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerColDriver.findElements(By.tagName("a")).get(t).sendKeys(clickonKeys);
			Thread.sleep(5000);
                                            
			
		}
		String mainWindowHandle = driver.getWindowHandle();
		//Approach 1
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> iter = handles.iterator();
		
		//hasnext verfies whether there's a new window next
		
		while(iter.hasNext()) {
			
			String windowName = iter.next();
			driver.switchTo().window(windowName);
			System.out.println("The title name is "+driver.getTitle());
			
			
			
			
		}
		
		driver.switchTo().window(mainWindowHandle);
		//Approach 2
		for(String h1 : handles) {
			
			driver.switchTo().window(h1);
			System.out.println("The title name is "+driver.getTitle());
		}
		
	
		
		
		

	}

}
