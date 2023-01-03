package TestPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class advancedTestNG3 {
	
	@BeforeClass
	//This executes only before the specified class advancedTestNG
	public void beforeClass() {
		
		System.out.println("BEFORE CLASS 3 IS EXECUTED");
		System.out.println("======================================");
	}
	
	@AfterClass
	//This executes only after the specified class advancedTestNG3
	public void afterClass() {
		System.out.println("======================================");
		System.out.println("AFTER CLASS 3 IS EXECUTED");
	}
	
	
	@Test (priority = 0)	
	//Since tests get executed in alpha order, priority makes them prioritized.
	//Lower the priority, 1st it gets executed
	public void methodRandom() {
		
		System.out.println("Test NG CLASS 3 - method 1 is executed");
	}
	
	@Test (priority = 7)
	public void abcRandom() {
		
		System.out.println("Test NG class 3 - method 2 is executed");
	}
	
	@Test (priority = 3)
	public void typeRandom() {
		
		System.out.println("Test NG class 3 - method 3 is executed");
		
	}

}
