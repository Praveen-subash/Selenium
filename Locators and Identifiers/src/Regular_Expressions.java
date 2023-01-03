import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regular_Expressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://rediff.com");
		
		//Using Linktext as x path with contains for Regular Expression
		driver.findElement(By.xpath("//a[contains(@title,'Already')]")).click();
		
		//Using Xpath in Standard Form
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("X_Path_Std");
		
		//Using CSS in Standard Form
		driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("CSS_Standard");		
		
		//Using CSS for Regular Expression
		driver.findElement(By.cssSelector("input[id*='login']")).sendKeys("CSS_Regular_Exp");
		
		//Using CSS for ID
		driver.findElement(By.cssSelector("input#login1")).sendKeys("CSS_ID_Specific");
		
	}

}
