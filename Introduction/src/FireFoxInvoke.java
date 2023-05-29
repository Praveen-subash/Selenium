import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxInvoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SELENIUM CODE
		
	// Create Driver Object for Chrome Browser
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
	}

}
