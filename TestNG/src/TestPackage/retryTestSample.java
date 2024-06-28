package TestPackage;

import org.testng.annotations.Test;

public class retryTestSample {
	
	@Test(retryAnalyzer = RetryAnalyzerTestNG.class)
	public void tryRetrying() {
		
		try {
			
			int a =6/0;
			
		}
		
		
		catch(ArithmeticException e) {
			
			e.printStackTrace();
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}

}
