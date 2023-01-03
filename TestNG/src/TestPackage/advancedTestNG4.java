package TestPackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class advancedTestNG4 {
	
	@Test  //[Add TestNG Library and Import Test]
	
	//Whatever method follows after the annotation @Test, will be treated as a single test case by testNG 
	//Now run as java compiler will not be there
	//Run as TestNG Test
	public void Demo1() {
		
		System.out.println("Test NG CLASS 4 - method 1 is executed");
	}
	
	@Test(groups= {"Smoke Testing"})
	public void Demo2() {
		
		System.out.println("Test NG class 4 - method 2 is executed");
	}
	
	@Test(description="This is demo3")
	public void Demo3() {
		
		System.out.println("Test NG class 4 - method 3 is executed");
		System.out.println("======================================");
	}
	
	@BeforeGroups("Smoke Testing")
	public void beforeGroup() {
		
		System.out.println("BEFORE GROUP SMOKE TEST IS EXECUTED");
		System.out.println("======================================");
	}
	
	@AfterGroups("Smoke Testing")
	public void afterGroup() {
		
		System.out.println("======================================");
		System.out.println("AFTER GROUP SMOKE TEST IS EXECUTED");
		
	}

}
