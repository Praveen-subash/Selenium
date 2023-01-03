import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://login.salesforce.com");
		
		//Locators with id
		driver.findElement(By.id("username")).sendKeys("Hello_ID");
		driver.findElement(By.id("password")).sendKeys("password");
		
		//Error statement since class name with spaces is not accepted
		//driver.findElement(By.className("button r4 wide primary")).click();
		
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();	
		
		//To retrieve the text getText is used
		System.out.println(driver.findElement(By.xpath("//*[@id=\'error\']")).getText());
		
		//Customized CSS through Syntax
		driver.findElement(By.cssSelector("input[id ='username']")).sendKeys("ThroughCSS");
		driver.findElement(By.cssSelector("input#username")).sendKeys("ThroughIDCSS");
		
		//Regular expressions for x path
		
	}

}
