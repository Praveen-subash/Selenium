package com.TestPackage;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("String[1] args is printed");
		
		
	}


}

//The only way to have two main methods is by having two different classes each with one main method. 
//The name of the class you use to invoke the JVM (e.g. java Class1, java Class2) determines which main method is called.

class func {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("String[2] args is printed");
		
		
	}
	
	
	
}
