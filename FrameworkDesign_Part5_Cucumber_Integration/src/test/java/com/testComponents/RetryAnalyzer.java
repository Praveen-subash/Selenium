package com.testComponents;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{  //**96

	
	int count =0;
	int retrycount = 1;
	//This method gets executed only if the test fails. 
	//WE DONT HAVE CML's LIKE LISTENERS TO DECLARE IN TESTNG.XML  SO WE NEED TO ADD AS A ANNOTATION SEPERATELY IN THE TEST 
	
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(count<retrycount) {
			
			count ++;
			return true; //Now if we want to rerun once, return true. only if return is true it reruns
			
		}
		return false;
	}

}
