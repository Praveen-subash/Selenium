import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class Selenium4_Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	//Since we are using 4.6.0, we dont need system.setproperty. From 4.6.0 we dont need systen.setProperty
		
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		
		WebDriver driver = new EdgeDriver();
		driver.get("http://google.com");
		
		System.out.println(driver.getTitle());

	}

}
