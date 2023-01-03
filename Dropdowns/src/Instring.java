import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Instring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://spicejet.com");		
		
		//Here, even if it is disabled, value is printed as true.
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		
		//To overcome this, we check which values gets changed when the box changes from enabled to disabled
		driver.findElement(By.xpath("//input[@value='OneWay']")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		
		//Similar to instr in uft. We are checking whether a particular string is available inside a value
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			Assert.assertTrue(true);
			System.out.println("The values is enabled");
		}
		else
		{
			System.out.println("The values is not enabled");
			Assert.assertTrue(true);
		}
		
	}

}
