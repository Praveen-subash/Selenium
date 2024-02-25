import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



//dont leave.. its time



public class Child_Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Setup\\chromedriver.exe");
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		By ele = By.cssSelector("span.CwaK9");
		String str = "The home page is loaded";
		explicit_Wait(driver,ele,str);
		
		driver.findElement(By.linkText("Privacy")).click();
		
		
		//Get all the window handles
		
		Set<String> handles = driver.getWindowHandles();
		
		//Iterate using Java concept		
		Iterator<String>iter =  handles.iterator();
		String parent_id = iter.next();  //The first .next brings to parent window
		System.out.println("The parent window name is "+parent_id+" and the URL is "+driver.getTitle());
		
		//The second .next brings to child window
		String child_id = iter.next();		
		System.out.println("SWITCHING TO CHILD WINDOW");
		driver.switchTo().window(child_id);
		System.out.println("The child window name is "+child_id+" and the URL is "+driver.getTitle());
		
		//For switching back to parent window
		System.out.println("SWITCHING BACK TO PARENT WINDOW");
		driver.switchTo().window(parent_id);
		System.out.println("The parent window name is "+parent_id+" and the URL is "+driver.getTitle());
		
		
		//To print all the window handles

		for(String ite : handles)
		{
			System.out.println("The handle name is "+ite);
		}
		
		//To get the current window handle
		String str_CurrentHandle = driver.getWindowHandle();
		System.out.println(str_CurrentHandle);
		
	

	}

	private static void explicit_Wait(WebDriver driver, By ele, String str) {
		// TODO Auto-generated method stub
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(ele));
		System.out.println(str);
		
	}

}
