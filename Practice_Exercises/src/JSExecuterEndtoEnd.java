import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JSExecuterEndtoEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		
		driver.get("https://www.redbus.in/");
		Thread.sleep(5000);
		driver.findElement(By.id("src")).sendKeys("Ban");
		Thread.sleep(7000);
		
		JavascriptExecutor js = (JavascriptExecutor)(driver);
		String str = "return document.getElementById(\"src\").value;";
		String text = (String) js.executeScript(str);
		System.out.println("Text retrieved before js  executor is "+text);
		
		int flag =0;
		int i=0;
		//While gets executed until condition becomes false
		while(!text.equalsIgnoreCase("Hebbal, Bangalore")) {
			i++;
			driver.findElement(By.id("src")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(str); //over riding the text value.
			//Since this is a while loop, break it after a certain iterations
			if(i>10) {
				System.out.println("Max iterations exceeded");
				flag =1;
				break;
				
			}
			
		}
		
		//Flag for value retrieved
		if(flag==1) {
			System.out.println("Element not found");
		}
			else {
			driver.findElement(By.id("src")).sendKeys(Keys.ENTER);
			System.out.println("Text retrieved after js  executor is "+text);
			
		}
			
		
		
		
		
	}



}
