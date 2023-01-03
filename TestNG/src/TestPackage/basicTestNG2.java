package TestPackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class basicTestNG2 {
	
	@Test  //[Add TestNG Library and Import Test]
	
	//Whatever method follows after the annotation @Test, will be treated as a single test case by testNG 
	//Now run as java compiler will not be there
	//Run as TestNG Test
	public void Demo1() {
		
		System.out.println("Test NG CLASS 2 - method 1 is executed");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	}
	
	@Test
	public void Demo2() {
		
		System.out.println("Test NG class 2 - method 2 is executed");
	}
	
	@Test
	public void Demo3() {
		
		System.out.println("Test NG class 2 - method 3 is executed");
		
		
	
	}
	
	//==========================ANNOTATIONS==================================================
	
	@BeforeMethod
	//Every Test is a method. So before each and every Test of this class, this method will get executed
	public void beforeMethod() {
		
		System.out.println("BEFORE METHOD IS EXECUTED");
	}
	
	@AfterMethod
	//Every Test is a method. So after each and every Test of this class, this method will get executed
	public void afterMethod() {
		
		System.out.println("AFTER METHOD IS EXECUTED");
		
	}
	

}
