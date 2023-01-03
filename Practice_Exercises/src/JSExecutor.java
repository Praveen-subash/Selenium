import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Setup\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		Thread.sleep(5000);
		driver.findElement(By.id("src")).sendKeys("Ban");
		Thread.sleep(7000);
		driver.findElement(By.id("src")).sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		driver.findElement(By.id("src")).sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		//driver.findElement(By.id("FromTag")).sendKeys(Keys.ENTER);
		
		System.out.println("Text retrieved before js  executor is "+driver.findElement(By.id("src")).getText());
		//The text will not be available in the application even if it is entered.
		//This is because the text is hidden. We are using js to retreieve it
		
		
		//JS DOM can identify hidden DOM elements whereas selenium cannot identify hidden elements
		//Using this method shifts to javascript API.
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String str = "return document.getElementById(\"src\").value;";
		String text = (String) js.executeScript(str);
		System.out.println("Text retrieved after js  executor is "+text);
		
		
		//For scrolling ------------
		js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//li[text()='KR Puram, Bangalore']")));
		
	
		
		//In console, check document.getElementById("FromTag").value;
		//See https://www.w3schools.com/js/js_htmldom_document.asp
		

	}

}
