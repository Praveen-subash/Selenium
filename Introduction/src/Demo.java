import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SELENIUM CODE
		
	    // Create Driver Object for Chrome Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Create a class for chrome driver
		driver.get("http://www.google.com"); //To reach the URL
		System.out.println(driver.getTitle());  //To get the page title
		System.out.println(driver.getCurrentUrl()); // TO get the current URL
		//System.out.println(driver.getPageSource()); // TO get the current URL
		driver.get("http://yahoo.com"); //To reach the URL
		driver.navigate().back(); //To navigate to the previous page
		driver.navigate().forward(); //To navigate to the next page
		driver.close(); //Closes the current browser
		driver.quit(); //Closes all the opened browsers - NOT WORKING
		
		}
		
	
//	// Defining System Property for the IEDriver 
//	System.setProperty("webdriver.ie.driver", "D:IE Driver ServerIEDriverServer.exe"); 
//
//	// Instantiate a IEDriver class. 
//	WebDriver driver=new InternetExplorerDriver();
}
