import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluent_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("div#start button")).click();
		
		//Fluent Wait is a class implementing Wait Interface
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)							
				.withTimeout(Duration.ofSeconds(30)) 	//Total timeout durations
				.pollingEvery(Duration.ofSeconds(3)) 	//Polling time
				.ignoring(NoSuchElementException.class); //Ignore if any error is populated before total timeout
		
		
		WebElement foo = wait.until(new Function<WebDriver, WebElement>(){ //Forget this outer part
		
			public WebElement apply(WebDriver driver ) {   //Wait until apply method returns webelement specified below
				return driver.findElement(By.cssSelector("[id='finish'] h4"));
			}
		});
		
		System.out.println("The fetched val is"+driver.findElement(By.cssSelector("[id='finish'] h4")).getText());
		// Here, the val is not displayed bcos the element is found on html. But not visible on the page.
		//Hence even while it is loaded, it gets passed.
		//Hence, we have element to be clickable in Explicit wait where, even if element appears on html,
		//it waits until the element becomes clickable on the browser 
		
	}

}
