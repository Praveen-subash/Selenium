import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			
		driver.get("https://fa-esfe-dev19-saasfademo1.ds-fa.oraclepdemos.com/fscmUI/faces/FuseWelcome?fndThemeName=Vision_Default");
		
		driver.findElement(By.id("userid")).sendKeys("FAS01.Student");
		driver.findElement(By.id("password")).sendKeys("J6^Bj5^S");
		driver.findElement(By.id("btnActive")).click();		
		expectedConditions("//a[@title='Navigator']",driver);
		
		driver.findElement(By.xpath("//*[local-name()='svg' and @aria-label='Navigator']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@title='Collapse Supply Chain Execution']")).click();
		driver.findElement(By.xpath("//div[@title='Supply Chain Execution']/div[1]")).click();
		
		driver.findElement(By.xpath("//span[text()='Inventory Management']")).click();		
		expectedConditions("//h2[text()='Picks']", driver);
		
		//*[local-name()='svg' and @aria-label='Navigator']
		
		driver.findElement(By.xpath("//img[@title='Tasks']")).click();
		expectedConditions("//select[contains(@id,'content')]", driver);
		
		Select s = new Select(driver.findElement(By.xpath("//select[contains(@id,'content')]")));
		
		s.selectByIndex(3);
		Thread.sleep(2000);
		
		List<WebElement> listOptions = driver.findElements(By.tagName("option"));
		
		for(int i=0;i<listOptions.size();i++) {
			
			String listTxt = listOptions.get(i).getText();
			
			if(listTxt.equals("Picks")) {
				
				listOptions.get(i).click();
				break;
			}
					
			
			
		}
				
	}
	
	

	public static void expectedConditions(String locator, WebDriver driver) {
		
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
		
	}

}
