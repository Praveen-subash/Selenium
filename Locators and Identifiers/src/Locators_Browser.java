import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		
		//Find element - Used to find the element
		//By. - Gives the Locator. Now enter the locator which you've selected
		//send keys - Used to enter the text
		//import org.openqa.selenium.By - Gets populated after entering By 
		//Whenever a html tag starts with <a> , it is a link
		driver.findElement(By.linkText("English (UK)")).click();
		driver.findElement(By.name("email")).sendKeys("Hello_Name");
		driver.findElement(By.name("pass")).sendKeys("abc");
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.navigate().back();
		
		//When there are multiples locators of same name, Selenium identifies first one 
		//Here, class name is same for ID and PW. But value is entered in ID field.
		//Selenium scans from left to right and gives preference to index
		
		//Locators with xpath
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("Hello_XPath");
		
		//Locators with CSS Selectors 
		//From chrome, Right click Copy -> Selectors
		//From Firefox, Right click Copy -> CSS Selectors
		driver.findElement(By.cssSelector("#email")).sendKeys("Hello_CSSSelector");
		
		//Customized x path using syntax
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.navigate().back();
		
		//Customized CSS using syntax
//		driver.findElement(By.cssSelector("button[name='login']")).click();
//		driver.navigate().back();
	}

}


