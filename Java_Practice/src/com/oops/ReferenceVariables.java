package com.oops;

class  X{

	public void method1() {
		
		System.out.println("method1 of parent class X");
		
		}
	
	}

 

class Y extends X {
	
	public void method1() {
			
		System.out.println("method1 of child class Y");
		
		}
	
	public void method2() {
		
		System.out.println("method2 of child class Y");
	}
		
}
//==========================================

class  G{

	public void overloadMethod(float y) {
		
		System.out.println("overloadMethod of parent calss");
		
		}
	
	}

 

class Q extends G {
	
	public void overloadMethod(int x) {
			
		System.out.println("overloadMethod of child class");
		
		}
	

		
}

public class ReferenceVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		X obj1 = new Y();
		//SINCE THE METHOD IS OVERRIDDEN, METHOD RESOLUTION TAKES PLACE BASED ON RUNTIME OBJECT.
		//SO METHOD2 OF THE CHILD CLASS GETS CALLED
		obj1.method1();
		
		//PARENT REFERENCE FOR CHILD OBJECT CAN ONLY CALL PARENT CLASS METHODS WHICH ARE INHERITED TO CHILD CLASS OR THE 
		//PARENT CLASS METHOD BASED ON WHETHER IT IS OVERRIDING OR OVERLOADING. IT CANNOT CALL THE METHODS SPECIFIC TO CHILD CLASS
		//So obj1.method2() is not possible
		
		
		//HERE, THE overloadMethod OF CHILD CLASS IS NOT EXECUTED BCOS THE METHOD IS NOT OVERRIDDEN
		// SO, COMPILER BASED METHOD EXECUTION TAKES PLACE
		G obj2 = new Q();
		obj2.overloadMethod(5);

	}
	
	

}
