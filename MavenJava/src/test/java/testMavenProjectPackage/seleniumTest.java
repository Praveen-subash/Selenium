package testMavenProjectPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class seleniumTest {
	
	@Parameters("name")
	@Test
	public void seleniumPrint(String a) {
		
		System.out.println("Selenium");
		System.out.println(a);
		
	}
	
	@BeforeMethod
	public void bfrMethod() {
		
		System.out.println("Before method is executed");
		System.out.println(System.getProperty("name"));
		
	}

}
