package com.oops;


//Overloading example - ex 1 
class A {
	
	public void show(int x) 
	{ 
		System.out.println("Parent method" + x); 
	} 
	
	
} 

class B extends A{
	
	public void show(float y) 
	{ 
		System.out.println("child   " + y); 
	} 
	
  //overriding - ex 2 ===========COMMENT FROM HERE==========
	
//	public void show(int x) 
//	{ 
//		System.out.println("child  overriding " + x); 
//	} 
//	
	// ===========COMMENT TILL HERE==========
	
}


	
public	class OverRidingOverLoading { 
	
	public static void main(String[] args) 
	{ 
		//=====ex 1 - overloading
		//Here, the method show is overloaded in the class B
		//If it is overloaded, method execution is based on compiler.
		// So for object obj, only parent class methods are allowed
		A obj = new B();
		//So this is valid
		obj.show(5);
		
		//obj.show(5.5);  //- This is invalid since reference is created for base class.
		// For overloading, method execution takes placce based on compiler.
		//So it'll have methods of class A alone
		
		
		// ===========COMMENT FROM HERE==========
		//=====ex 2 - overriding
		
		A t = new B();
		t.show(5);
		
		// ===========COMMENT TILL HERE==========
		
		//AS ADVISED COMMENT AND RUN THE CODE
		//1 - YOU WILL SEE THAT AT FIRST PARENT METHOD WILL GET EXECUTED BCOS JVM CHECKS IF THE METHOD show IS OVERRIDDEN
		// SINCE IT IS NOT AND IT IS OVERLOADE D(b has , ONLY THE METHOD show OF PARENT CLASS IS AVAILABLE FOR obj
		
		//2 - AFTER UNCOMMENTING METHOD IS OVERRIDDEN. SO, THE CHILD CLASS METHOD GETS EXECUTED NOW
		
		
	} 
	
}


