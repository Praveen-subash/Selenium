package TestPackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class helperAttributes {
	
	@Test
	
	public void clickValues() {
		
		System.out.println(" Step 1 is executed");
		
	}
	
	
	
	@Test(dependsOnMethods={"qRandom"})
	public void attRandom() {
		
		System.out.println(" Step 2 is executed");
		
	}
	
	@Test
	public void tcRandom() {
		System.out.println(" Step 3 is executed");
		
	}
	
	@Test(timeOut=4000)
	public void qRandom() {
		System.out.println(" Step 4 is executed");
		
	}
	
	@Test
	
	public void ctNew() {
		
		System.out.println("Step 5 is executed");
		
	}

}
