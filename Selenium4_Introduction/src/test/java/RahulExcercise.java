import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RahulExcercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		int cnt = driver.findElements(By.id("dropdown-class-example")).size();
		Thread.sleep(5000);
		for(int i=0;i<cnt;i++) {
			
			String str = driver.findElements(By.xpath("//option[contains(@value,'option')]")).get(i).getText();
			//driver.findElement(By.id("dropdown-class-example")).click();
			driver.findElement(By.xpath("//option[text()='"+str+"']")).click();
			
		}
		
		driver.findElement(By.id("checkBoxOption1")).click();
		
		boolean checkBoxEnabled = driver.findElement(By.id("checkBoxOption1")).isSelected();
		System.out.println(checkBoxEnabled);
		Assert.assertEquals(true, checkBoxEnabled);
		
		driver.findElement(By.id("checkBoxOption1")).click();
		
		boolean checkBoxDisabled = driver.findElement(By.id("checkBoxOption1")).isSelected();
		System.out.println(checkBoxDisabled);
		Assert.assertEquals(false, checkBoxDisabled);
		
		List cntCheckBoxes = driver.findElements(By.xpath("checkbox"));
		
		System.out.println(cntCheckBoxes.size());

	}

}
