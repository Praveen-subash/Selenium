import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		
		//To select a particular checkbox
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_friendsandfamily']")).click();
		
		//To return the status of the checkbox selected
		boolean s = driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_friendsandfamily']")).isSelected();
		if (s==true)
		{
			System.out.println("The value is selected. Return type is "+s);
		}
		
		// To return no of checkboxes in the page
		int a = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.print("The no of checkboxes is "+a);
		
		//To retreive the checkbox names in the page
		for(int i=0;i<a;i++)
		{
			 String text = driver.findElements(By.xpath("//label[contains(@for,'ctl00_mainContent_chk')]")).get(i).getText();
			 System.out.println("The checkbox name is "+text);
		}
		
	}

}
