import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Path");
		WebDriver driver = new ChromeDriver();
		driver.get("Path");
		
		driver.findElement(By.xpath("")).sendKeys("user");
		
	}

}
