import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Debug_fluent_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("div#start button")).click();
		
		//Fluent Wait is a class implementing Wait Interface
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(Duration.ofSeconds(30)) 	//Total timeout durations
				.pollingEvery(Duration.ofSeconds(3)) 	//Polling time
				.ignoring(NoSuchElementException.class); //Ignore if any error is populated before total timeout
		
		
		WebElement foo = wait.until(new Function<WebDriver, WebElement>(){ //Forget this outer part
		
			public WebElement apply(WebDriver driver ) {   //Wait until apply method returns webelement specified below
				if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed())
				{
					return driver.findElement(By.cssSelector("[id='finish'] h4")); 
					//This is equaal to element.clickable
						
				}
				else
				{
					return null;
				}
				
			}
		});
		
		System.out.println("The fetched text is "+driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
		// Here value is displayed becos webelement is returned only when it is displayed on the page
		
	}

}
