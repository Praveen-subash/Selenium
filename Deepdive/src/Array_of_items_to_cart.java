import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Array_of_items_to_cart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Declaring the array
		String[] itemsneeded = {"Pumpkin","Brocolli","Cucumber"};
		
		//If it is a single WebElement, then use the syntax WebElement prod = driver.findElement(By.cssSelector(".product-name"));
		// Since there are many elements, use the syntax List<WebElement> prod = driver.findElements(By.cssSelector(".product-name"));
		
		List<WebElement> prod = driver.findElements(By.cssSelector("h4.product-name"));		
		
		System.out.println("Selecting through array list");		
		
		//Converting array to a array list
		List array_List = Arrays.asList(itemsneeded);
		int p=0;
		for(int k=0;k<prod.size();k++)
		{
			//String value = driver.findElements(By.cssSelector("h4.product-name")).get(k).getText();
			String trim_Value = driver.findElements(By.cssSelector("h4.product-name")).get(k).getText().split("-")[0].trim();
//			String[] name = value.split("-");
//			String trim_Value = name[0].trim();
			//String final_Val = value[0];
			//To check whether the value is contained in array list. Array list compares all the array values with the fetched value
			
			if(array_List.contains(trim_Value))
			{
				//int ind = k+1;
				//driver.findElement(By.xpath(("(//*[text()='ADD TO CART'])[+ind+]"))).click();
				p++;
				Thread.sleep(5000);
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(k).click();
				//System.out.println("The value selected is "+trim_Value);
				
				if(p==itemsneeded.length)
				{
					System.out.println("All values are selected");
					break;
				}
				
			}
			
		}
		
		//Selecting thro an array requires complex approach shown below
		
		/*System.out.println("Selecting through array");
		
		for(int i=0;i<prod.size();i++)
		{
			String name = driver.findElements(By.cssSelector("h4.product-name")).get(i).getText();
			for(int j=0;j<itemsneeded.length;j++)
				{
				if(itemsneeded[j].equals(name))
				{
					driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
					Thread.sleep(2000);
					System.out.println("The value selected is "+name);
				}
			}
		}*/
		
	}

}
