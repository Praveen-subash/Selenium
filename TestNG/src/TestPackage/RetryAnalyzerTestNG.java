package TestPackage;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerTestNG implements IRetryAnalyzer{
	
	int count = 0;
	int retryCount = 2;
	
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(count<retryCount) {
			count ++;
			return true;
			
		}else {
			
			return false;
		}
		
	}

}
