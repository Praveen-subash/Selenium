import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Split_Trim {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://gourmetdelight.in/fruits-vegetables/fresh-fruits");
		driver.manage().window().maximize();
		
		List<WebElement> prod = driver.findElements(By.xpath("//div[@class='name']/a"));
		
		String [] name = {"Mandarin Orange","Banana Elaichi"};
		List list_Val = Arrays.asList(name);
		int count=0;
		for(int i=0;i<prod.size();i++)
		{
			String text = driver.findElements(By.xpath("//div[@class='name']/a")).get(i).getText();
			
			if(list_Val.contains(text))
			{
				System.out.println("The value is "+text);	
				Thread.sleep(5000);
				count++;
				driver.findElements(By.xpath("//a[contains(@class,'add_to_cart')]")).get(i).click();
				if(count==name.length)
				{
					System.out.println("All the values are passed");	
					break;
				}
			}
			
			
		}
		

	}

}
