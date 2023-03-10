'SAMPLE PROGRAM FOR TEST NG

package TestPackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class basicsTestNG {
	
	
	@Test  '[Add TestNG Library and Import Test]
	
	'Whatever method follows after the annotation @Test, will be treated as a single test case by testNG 
	'Now run as java compiler will not be there
	'Run as TestNG Test
	
	public void Demo1() {
		
		System.out.println("Test NG CLASS 1 - method 1 is executed");
	}
	
	@Test
	public void Demo2() {
		
		System.out.println("Test NG class 1 - method 2 is executed");
	}
	
	@Test
	public void Demo3() {
		
		System.out.println("Test NG class 1 - method 3 is executed");
		System.out.println("======================================");
	}

}


'TEST CASE CLASSSIFICATION BASED ON TESTS

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">

  	<test  name="BasicTestCases">
	    <classes>
	      <class name="TestPackage.basicsTestNG"/>
	      <class name="TestPackage.basicTestNG2"/>      
	    </classes>
 	 </test> <!-- Test -->
  
  
  	<test name="AdvancedTestCases">
	  	<classes>
	  	<class name="TestPackage.advancedTestNG3"/>
	  	<class name="TestPackage.advancedTestNG4"/>  	
	  	</classes>
	  
  	</test>
</suite> <!-- Suite -->

'INCLUDE EXCLUDE FOR LIMITING THE TEST SUITES

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">

  	<test name="BasicTestCases">
	    <classes>
	      <class name="TestPackage.basicsTestNG">
		      <methods>
		      	 <include name= "Demo2"/>
		      </methods>
		     </class>
	      <class name="TestPackage.basicTestNG2"/>      
	    </classes>
 	 </test> <!-- Test -->
  
  
  	<test name="AdvancedTestCases">
	  	  <classes>
		   <class name="TestPackage.advancedTestNG3">
			  	<methods>
			  		<exclude name = "Demo2"/>			  		
			  	</methods>
			</class>
		  	<class name="TestPackage.advancedTestNG4"/>  	
	  	</classes>
	  
  	</test>
</suite> <!-- Suite -->

'USING REGULAR EXPRESSIONS (Excludes the tests that start with Launch)

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
	
	<test name = "RegularExpressions">
		<classes>
			<class name = "TestPackage.regExp">
				<methods>		
					<exclude name ="Launch.*"/>
				</methods>		
			</class>		
		</classes>	
	</test>
	
  	
</suite> <!-- Suite -->

'RUN PACKAGES ALONE

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test name="Package">
    <packages>
    	<package name = "TestPackage"/>
    </packages>
  </test> <!-- Test -->
</suite> <!-- Suite -->

'TESTNG ANNOTATIONS (READ THIS CAREFULLY especially the scope of these annotations)

'ANNOTATION		DESCRIPTION
@BeforeSuite	The @BeforeSuite will run before the execution of the suite. This can be declared anywhere in the classes within the package.
@AfterSuite		The @AfterSuite will run after the execution of the suite. This can be declared anywhere in the classes within the package.

@BeforeTest		The @BeforeTest will be executed before the execution of all the tests. The scope belongs to the classes in that particular test.
@AfterTest		The @AfterTest will be executed after the execution of all the tests. The scope belongs to the classes in that particular test.

@BeforeClass	The @BeforeClass will be executed before the class. The scope is limited to that particular class alone.
@AfterClass		The @AfterClass will be invoked after the class. The scope is limited to that particular class alone.

@BeforeMethod	The @BeforeMethod will be executed before each @test in that class. The scope is limited to that @Test in the class alone. Each @Test is one method.
@AfterMethod	The @AfterMethod will run after each @test in that class. The scope is limited to that @Test in the class alone. Each @Test is one method.

@BeforeGroups	The @BeforeGroups runs only once for a group before the execution of all test cases belonging to that group.
@AfterGroups	The @AfterGroups runs only once for a group after the execution of all test cases belonging to that group.

'HELPER ATTRIBUTES

-Priority
-Groups
-dependsOnMethods
-enabled
-timeOuts
-description(See bottom)

'TEST CASES BASED ON PRIORITY
@Test (priority = 0)	
	'Since tests get executed in alpha order, priority makes them prioritized.
	'Lower the priority, 1st it gets executed
	public void methodRandom() {
		
		System.out.println("Test NG CLASS 3 - method 1 is executed");
}

'TEST CASES BASED ON GROUPS
@Test(groups= {"Smoke Testing"})
	
	public void Demo2() {
		
		System.out.println("Test NG class 4 - method 2 is executed");
}


@BeforeGroups("Smoke Testing")
	public void beforeGroup() {
		
		System.out.println("BEFORE GROUP SMOKE TEST IS EXECUTED");
		System.out.println("======================================");
	}
	
@AfterGroups("Smoke Testing")
	public void afterGroup() {
		
		System.out.println("======================================");
		System.out.println("AFTER GROUP SMOKE TEST IS EXECUTED");
		
	}
'XML FILE FOR GROUPS
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test  name="Test">
  	<groups>
  		<run>
  			<include name="Smoke.*"/> 
  		</run>
  	</groups>
  
    <classes>
      <class name="TestPackage.basicTestNG2"/>
      <class name="TestPackage.basicsTestNG"/>
      <class name="TestPackage.advancedTestNG3"/>
      <class name="TestPackage.advancedTestNG4"/>
      <class name="TestPackage.regExp"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->

'TEST CASES BASED ON DEPENDS ON METHODS, ENABLED, TIMEOUTS , DESCRIPTION

package TestPackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class helperAttributes {
	
	@Test(enabled=false)
	
	public void clickValues() {
		
		System.out.println(" Step 1 is executed");
		
	}
	
	@Test(dependsOnMethods={"qRandom"}) 'Gets executed only after qrandom
	public void attRandom() {
		
		System.out.println(" Step 2 is executed");
		
	}
	
	@Test(enabled=false) 'gets skipped
	public void tcRandom() {
		System.out.println(" Step 3 is executed");
		
	}
	
	@Test(timeOut=4000) 'waits for 4 second
	public void qRandom() {
		System.out.println(" Step 4 is executed");
		
	}
	
	@Test(description="This is a test case") 
	public void qRandom() {
		System.out.println(" Step 5 is executed");
		
	}

}

'PARAMETRIZATION

'Note that every parameters has its scope only for the succeeding test
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

'XML for parameters

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">

  <parameter name="Suite" value = "suitelevel.com"/>
  
  <test name="Test_1">
  	 <parameter name="Test1" value = "Test1Level.com"/>
    <classes>      
      <class name="TestPackage.parametrizationClass"/>
    </classes>
  </test> <!-- Test -->
  
  <test name="Test_2">
  		<parameter name="Test2" value = "Test2Level.com"/>
      <classes>      
      <class name="TestPackage.regExp"/>
    </classes>  
  </test>
</suite> <!-- Suite -->



'DATA PROVIDERS( used for sending multiple sets of data)
package TestPackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	
	@Test(dataProvider="getData")
	public void useDataProvider(String username, String password) {
		
		System.out.println(username);
		System.out.println(password);
		
	}
	
	@DataProvider
	public Object[][] getData() {
		
		'Object class for multi dimensional arrays
		Object[][] data = new Object[3][2];
		//Rows - Number of times your test has to be repeated.
		//Columns - Number of parameters in test data.
		
		// 1st row
		data[0][0] ="sampleuser1";
		data[0][1] = "abcdef";

		// 2nd row
		data[1][0] ="testuser2";
		data[1][1] = "zxcvb";
		
		// 3rd row
		data[2][0] ="guestuser3";
		data[2][1] = "pass123";
		
		return data;
		
		
	}
	

}

'LISTENERS (What to do after step results)
package TestPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Listeners implements ITestListener{
	
	'IF ADD UNIMPLEMENTED METHODS IS NOT AVAILABLE WHEN HOVERED OVER LISTENERS
	'Right click(on the Listeners class) -> go to source-> 
	'click on overide/implement methods -> select the check boxes for the ITest listener 

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		System.out.println("THE TEST IS PASSED - LISTENER - "+result.getName()); 'NOTE THIS to get where this has been passed
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
	


}

'XML FOR Listeners
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">

	  <listeners> 
	  	<listener class-name="TestPackage.Listeners"/>
	  </listeners>
	  
<test  name="Test">
    <classes>

      <class name="TestPackage.dataProvider"/>
      
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->

'NOTE


'The scope of the annotations shld be noted. If it is declared within test, it can only be used by the classes in the test. 
'If it its declareed in the suite, it can be used overall 
'Example : groups, parameters, listeners etc

'PARALLEL EXECUTION IN BROWSERS

'thread count is no of browsers

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite" parallel = "tests" thread-count="2">
  <test  name="BasicTestCases" parallel = "classes" thread-count="2">
    <classes>
      <class name="TestPackage.basicTestNG2"/>
      <class name="TestPackage.basicsTestNG"/>
      <class name="TestPackage.advancedTestNG3"/>
      <class name="TestPackage.advancedTestNG4"/>
      <class name="TestPackage.helperAttributes"/>
      <class name="TestPackage.dataProvider"/>
      <class name="TestPackage.regExp"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->







