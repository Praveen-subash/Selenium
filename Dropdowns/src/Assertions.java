import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");		
		
		//Assert.assertfalse is used to validate a particular condition. If false is returned, execution proceeds
		boolean s = driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_friendsandfamily']")).isSelected();
		Assert.assertFalse(s);
		System.out.println("Assert equals condition returns False. Execution proceeds");
		
		String str = driver.findElement(By.xpath("//input[@name='ctl00_mainContent_ddl_originStation1_CTXT']")).getAttribute("value");
		
		//AssertEquals is used to validate whether the expected value and actual value are same 
		Assert.assertEquals("Departure City",str);
		System.out.println("Assert equals condition returns "+str);
		
		//To select a particular checkbox
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_friendsandfamily']")).click();
		
		//Here execution does not proceed since it returns true.
		Assert.assertFalse(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_friendsandfamily']")).isSelected());
		System.out.println("Assert equals condition returns False. Execution proceeds");
	}

}
