import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DescendingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Setup\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//Click two times to bring in Ascending Order
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();

		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		
		
		//********************************
		List<WebElement> veg =  driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		System.out.println(veg.size());
		
		//SYNTAX to create a new array List
		ArrayList<String> orgArrayList = new ArrayList<String>();
		
		//Getting the Items in the array List
		for(int i=0;i<veg.size();i++) {
			
			String s = veg.get(i).getText();
			
			System.out.println("The vegetable is "+s);
			orgArrayList.add(s);
			
		}
		
		//Printing the arrayList		
		for(String rpt : orgArrayList) {
			
			System.out.println("The array list is "+rpt);
		}
		
		
		//Copying into a new array List
		ArrayList<String> copiedArrayList = new ArrayList<String>();
		
		for(int t=0;t<orgArrayList.size();t++) {
			
			copiedArrayList.add(orgArrayList.get(t));
			
		}
		//APPROACH 2
//		for(String rpt : orgArrayList) {
//			
//			copiedArrayList.add(rpt);
//		}
		
	
		//Sorting the array List in Ascending Order
		Collections.sort(copiedArrayList);
		
		////Sorting the array List in Descending Order (Descending can be done only after ascending)
		Collections.reverse(copiedArrayList);
		
		//Printing the values of sorted array list
		for(String cpt : copiedArrayList) {
			
			System.out.println("The copied array list is "+cpt);
		}
		
		//Validating whether both the array Lists are same
		Assert.assertEquals(orgArrayList, copiedArrayList);

	}

}
