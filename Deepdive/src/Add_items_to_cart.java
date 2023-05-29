import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Add_items_to_cart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		//If it is a single WebElement, then use the syntax WebElement prod = driver.findElement(By.cssSelector(".product-name"));
		// Since there are many elements, use the syntax List<WebElement> prod = driver.findElements(By.cssSelector(".product-name"));
		
		int count = driver.findElements(By.cssSelector(".product-name")).size();
				
		for(int i=0;i<count;i++)  //Size of the webelements is taken
		{
			String s = driver.findElements(By.cssSelector(".product-name")).get(i).getText();
			int inc = i+1;
			System.out.println("The value of incremental count is "+inc);
			System.out.println("The value is "+s);
			if(s.contains("Potato"))
			{
				System.out.println("The value Potato is displayed");
				//driver.findElement(By.xpath("(//button[text()='ADD TO CART'])["+inc+"]")).click(); //Here, we can click thro index also
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();  //We can click through array also
				System.out.println("The value Potato is clicked");
				break;
			}
		}
		
		//driver.close();
		
	}

}
