import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Static_Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(10000);
		driver.findElement(By.id("divpaxinfo")).click();
		
		// Create a object of class select
		Select s = new Select(driver.findElement(By.xpath("//select[@name='ControlGroupSearchView$AvailabilitySearchInputSearchView$DropDownListPassengerType_ADT']")));
		
		//To select the static dropdown using value. See the dom for value
		s.selectByValue("6");
		
		//To select the static dropdown using Index
		s.selectByIndex(5);
		
		//To select the static dropdown using Visible text on screen
		s.selectByVisibleText("7");
		
		int a=0;
		int b =0;
		int c=0;
		
		//Looping statements to execute until a particular condition is satisfied
		
		while(a<5)
		{	
			
			a++;			
			s.selectByIndex(b);		
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			b++;
		}
		
		//Looping statements to execute until a particular condition is satisfied
		
		for(int j=0;j<5;j++)
		{
			s.selectByIndex(c);	
			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			c++;
		}
		
		
		
		driver.close();
		
	}

}
