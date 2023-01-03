package TestPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametrizationClass {
	
	@Parameters({"Suite"})

	@Test
	public void paramSuite(String a) {
		
		
		System.out.println("Suite Parametrization");
		System.out.println(a);
		
	}
	
	@Parameters({"Test1"})
	@Test
	public void paramTest(String s) {
		
		
		System.out.println("Test Parametrization");
		System.out.println(s);
		
	}

}
