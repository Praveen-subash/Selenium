package com.oops;

class variableA {
	
	int x= 888;
	static int y =222;
	
}

class variableB extends variableA{
	
	int x= 999;
	static int y =333;
	
}

public class VariableResolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		variableA obj1 = new variableA();
		System.out.println(obj1.x);
		System.out.println(obj1.y);
		
		variableB obj2 = new variableB();
		System.out.println(obj2.x);
		System.out.println(obj2.y);
		
		//THERE IS NO CONCEPT OF OVERRIDING N VARIABLES. IT IS APPLICABLE ONLY TO METHODS
		//Thus,Variable resolution is always taken care by compiler based on reference type irrespective of whether 
		//the variable is static or non static.
		variableA obj3 = new variableB();
		System.out.println(obj3.x);
		System.out.println(obj3.y);
		

	}

}
