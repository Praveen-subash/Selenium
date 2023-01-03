package TestPackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class basicsTestNG {
	
	
	@Test  //[Add TestNG Library and Import Test]
	
	//Whatever method follows after the annotation @Test, will be treated as a single test case by testNG 
	//Now run as java compiler will not be there
	//Run as TestNG Test
	public void Demo1() {
		
		System.out.println("Test NG CLASS 1 - method 1 is executed");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
	}
	
	@Test
	public void Demo2() {
		
		System.out.println("Test NG class 1 - method 2 is executed");
	}
	
	@Test
	public void Demo3() {
		
		System.out.println("Test NG class 1 - method 3 is executed");
		System.out.println("======================================");
	}
	
	//==========================ANNOTATIONS==================================================
	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("BEFORE TEST \"BasicTestCases\" IS EXECUTED");
		System.out.println("======================================");
	}
	
	@AfterTest
	public void afterTest() {
		
		
		System.out.println("AFTER TEST \"BasicTestCases\" IS EXECUTED");
		System.out.println("======================================");
		
	}

	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("BEFORE SUITE IS EXECUTED");
	}
	
	@AfterSuite
	public void afterSuite() {
		
		System.out.println("AFTER SUITE IS EXECUTED");
	}
	
}
