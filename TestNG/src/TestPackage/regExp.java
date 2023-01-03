package TestPackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class regExp {
	
	@Parameters({"Suite"})
	@Test
	
	public void LaunchURL(String a) {
		
		System.out.println(" Step 1 URL is Launched");
		System.out.println(a);
	}
	
	@Parameters({"Test2"})
	@Test
	public void LaunchLogout(String s) {
		System.out.println(" Step 3 Logout is clicked");
		System.out.println(s);
	}
	
	
	@Test(groups= {"Smoke Testing"})
	public void ClickValues() {
		
		System.out.println(" Step 2 Values are clicked");
		
	}
	
	@Test(groups= {"Smoke Testing"})
	public void DummyValues() {
		
		System.out.println(" Step 4 Values are clicked");
		
	}
	

}
