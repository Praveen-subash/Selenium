package TestAnnotations;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	@Test
	public void mainFlow() {
		System.out.println("Mainflow is getting executed");		
		
	}
	
	@Test
	public void subFlow() {
		System.out.println("Sub Flow is getting executed");		
		
	}
	
	@BeforeTest
	//This requests the tests to execute before everything. Example DB refresh, data refresh etc
	public void preRequisite() {
		
		System.out.println("BEFORE TEST IS EXECUTED");
		
	}
	
	@AfterTest
	//This requests the tests to execute after everything. Example DB refresh, data refresh etc
	//THIS WILL EXECUTE AT THE END OF THIS FOLDER
	public void finalRequisite() {
		
		System.out.println("AFTER TEST IS EXECUTED");
		
	}
	

}
