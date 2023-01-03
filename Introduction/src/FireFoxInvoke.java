import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxInvoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SELENIUM CODE
		
	// Create Driver Object for Chrome Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Setup\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
	}

}
