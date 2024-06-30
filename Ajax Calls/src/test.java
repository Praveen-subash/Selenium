import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;






//no way da




public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking","enable-automation"));
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Accepted%20Elements");
		driver.manage().window().maximize();
		
	
		
		driver.findElement(By.id("Accepted Elements")).click();
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//div[@rel-title='Accepted Elements']/p/iframe")));
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[text()='Drag me to my target']")));
		
		WebElement ele = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement trg = driver.findElement(By.cssSelector("#droppable"));
		
	
		
		Actions actions = new Actions (driver);
		actions.moveToElement(ele).dragAndDrop(ele, trg).build().perform();
		
	

	}

	

}
