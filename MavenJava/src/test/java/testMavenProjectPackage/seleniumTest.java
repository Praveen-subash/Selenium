package testMavenProjectPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class seleniumTest {
	
	@Test
	public void seleniumPrint() {
		
		System.out.println("Selenium");
		
	}
	
	@BeforeMethod
	public void bfrMethod() {
		
		System.out.println("Before method is executed");
		
	}

}
