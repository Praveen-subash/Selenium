import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		Thread.sleep(3000);
		
		//Driver is switched to alert. .Accept() is used for OK YES DONE etc
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		Thread.sleep(3000);
		
		//Driver is switched to alert. .GETETXT() is used to get the text from alerts
		System.out.println(driver.switchTo().alert().getText());
		
		//Dismiss is used to cancel the button
		driver.switchTo().alert().dismiss();
		
		//To enter values in alerts
		//driver.switchTo().alert().sendKeys("ABC");
	}

}
