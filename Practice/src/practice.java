import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.bigbasket.com/cl/fruits-vegetables/");
		Thread.sleep(5000);
		

		
		String[] arr_Name = {"Broccoli"};
		List str_List = Arrays.asList(arr_Name);
		
		List<WebElement> str_Val = driver.findElements(By.xpath("//div[@qa='product_name']/a"));
		
		int t = arr_Name.length;
		int q = 1;
		
		for(int i=0;i<str_Val.size();i++)
		{
			String p = str_Val.get(i).getAttribute("uib-tooltip").trim();
			System.out.println("The value of the veg is "+p);
			
			if(str_List.contains(p))
			{
				q = q+1;
				driver.findElements(By.cssSelector("button.btn.btn-add.col-xs-9")).get(i).click();
				if(q==2)
				{
					break;
				}
				
			}
			
			
		}
		
		
		

	}

}
