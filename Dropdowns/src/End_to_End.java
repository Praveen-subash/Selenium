import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class End_to_End {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://spicejet.com");
		
		//Clicking on the radio button One way to make it enabled
		int size = driver.findElements(By.xpath("//input[@type='radio']")).size();
		
		for(int i=0;i<size;i++)
		{
			String s = driver.findElements(By.xpath("//input[@type='radio']")).get(i).getAttribute("value");
			System.out.print("The value is "+s);
			if(s.equals("OneWay"))
			{
				driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
				break;
			}
			
		}
		
		Thread.sleep(2000);
		
		//Entering the source location
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='IXU']")).click();
		System.out.print(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).getAttribute("value"));
		
		Thread.sleep(2000);
		
		//Entering the destination location using index
		
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		System.out.print(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT")).getAttribute("value"));
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		
		Thread.sleep(2000);
		
		//Entering the destination location using Parent Child Relationship
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")).click();
		System.out.print(driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_destinationStation1_CTXT")).getAttribute("value"));
		
		Thread.sleep(2000);
		
		//Entering the calendar date
		
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-highlight')]")).click();
		
		//Clicking on the Desired check box using for loop
		int val = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		
		for(int j=0;j<val;j++)
		{
			String d = driver.findElements(By.xpath("//input[contains(@id,'ctl00_mainContent_chk')]")).get(j).getAttribute("id");
			System.out.println("The id returned is "+d);
			if(d.contains("Senior"))
			{
				driver.findElements(By.xpath("//input[contains(@id,'ctl00_mainContent_chk')]")).get(j).click();
			}
			
		}
				
		//Clicking on the needed dropdown by passing through the loop
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
				
		Select drop = new Select(driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_Adult']")));
		
		for(int p=0;p<9;p++)
		{
			drop.selectByIndex(p);
			String st = driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText();
			System.out.println("The value fetched is "+st);
			if(st.equals("6 Adult"))
			{
				driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
				System.out.println("The value "+st+" is selected");
				break;
			}
		
		}
		
		Thread.sleep(400);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		
	}

}
