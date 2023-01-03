import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Buttons {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		//Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@value='Butter']")).click();
		//Thread.sleep(7000);

		// To select a specific value
		//***********note***********
		int size = driver.findElements(By.xpath("//input[@name='group1']")).size();

		System.out.println("The no of radio boxes are" + size);
		// Observe the main difference between get and get attribute. get is used only
		// for arrays

		Thread.sleep(4000);

		for (int i = 0; i < size; i++)
		{
			String s = driver.findElement(By.xpath("//input[@name='group1']")).getAttribute("value");
			System.out.println("The value printed with getAttribute is " + s);
		}

		Thread.sleep(4000);

		for (int p = 0; p < size; p++)
		{
			// If we use webelements, we must use List<WebElement>. Here we are not using
			// since, only a single value is retreived using get

			String str = driver.findElements(By.xpath("//input[@name='group1']")).get(p).getAttribute("value");
			System.out.println("The value printed with get and get attribute is " + str);
			if (str.equalsIgnoreCase("Cheese"))
			{
				driver.findElements(By.xpath("//input[@name='group1']")).get(p).click();
				System.out.println("The value selected is " + str);
			}

		}

		Thread.sleep(4000);

		// Different approach without get
		for (int c = 1; c <= size; c++)
		{

			String val = driver.findElement(By.xpath("(//input[@name='group1'])[" + c + "]")).getAttribute("value");
			System.out.println("The value printed without get and get attribute is " + val);
		}
		
		//Example 2
		
		driver.get("https://www.spicejet.com/");
		
		List<WebElement> btns = driver.findElements(By.name("ctl00$mainContent$rbtnl_Trip"));
		
		for(int s=0;s<btns.size();s++) {
			
			String p = driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']/following-sibling::label")).get(s).getText();
			System.out.println(p);
			
			
		}

	}

}