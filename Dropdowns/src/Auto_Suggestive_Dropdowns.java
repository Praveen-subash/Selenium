import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestive_Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://makemytrip.com");
		
		driver.findElement(By.xpath("//li[@data-cy='account']")).click();
		
		driver.findElement(By.id("fromCity")).click();
		
		//Defining a object for web element
		
		WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));
		source.sendKeys("MUM");
		
		Thread.sleep(2000);
		
		//Sendkeys for keyboard characters
		source.sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(2000);
		source.sendKeys(Keys.ENTER);
		
		
		Thread.sleep(2000);
		WebElement dest = driver.findElement(By.xpath("//input[@placeholder='To']"));
		Thread.sleep(2000);
		dest.sendKeys("DEL");
		
		source.sendKeys(Keys.ARROW_DOWN);
		
		Thread.sleep(2000);
		source.sendKeys(Keys.ENTER);
		
		
		
	}

}
