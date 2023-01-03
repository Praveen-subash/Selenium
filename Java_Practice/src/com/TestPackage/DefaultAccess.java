package com.TestPackage;

public class DefaultAccess {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Accessing the static method geek() and  
        // field by class name itself.  
      
		ArrayOfArrays m = new ArrayOfArrays();
		m.main(null); //Here, array of arrays is accessible bcos, the class is of default type. 
		//It cannot be accessed from other packages.
		m.m1(); 


		
		
	}

}
