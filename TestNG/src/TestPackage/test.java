package TestPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test {
	
	
	@Test(dataProvider = "getData")
	public void m1(Object a,Object b,Object c) {
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		
	}
	
	@DataProvider
	
	public Object[][] getData() {
		
		Object[][] objArray = {{1,2,3},{4,5,6},{7,8,9}};
		
		return objArray;
		
	}
	
	
}
