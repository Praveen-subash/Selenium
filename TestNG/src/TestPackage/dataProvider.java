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
		
		//Object class for multi dimensional arrays
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
