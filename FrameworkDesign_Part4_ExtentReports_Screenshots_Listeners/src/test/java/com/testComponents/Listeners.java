package com.testComponents;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.resources.ExtentReporterNG;

public class Listeners extends BaseTest implements ITestListener {  //**87  //**93 for extending base test

	ExtentTest test ;
	ExtentReports extent = ExtentReporterNG.getReportObject();
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test = extent.createTest(result.getMethod().getMethodName()); //result is something that gets generated when a test is run
		// so use that method to get the test case name  //**89
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(Status.PASS, "This test is passed");  //**90
		
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub //**92
		test.fail(result.getThrowable()); //Instead of just printing that test is failed we are printing the error msg
		
		//****************** VERY IMPORTANT NOTE ******************
		//If yu see we do not have the control of driver in getScreenshot method.
		//Listeners get executed even before the test starts. We get driver only when the test executes (Before method)
		//So we are now trying to generate driver from the listener to the getScreenshot method
		//The below method generates driver from the class
		//gettestclass goes to testng xml. get real class goes to original class
		//From there we are getting driver. Now we are passing the driver to getScreenshot
		//See tpurchase.xml to know where listener is there
		
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());//**94
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		
		
		try {
			String filePath = getScreenshot(result.getMethod().getMethodName(),driver); //**95 passing driver
			test.addScreenCaptureFromPath(filePath,result.getMethod().getMethodName()); //**93 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		extent.flush();  //**94
	}



}
