package com.UserDefinedPackage;

public class ProtectedModifier {  //This should be public bcos this class needs to be accessed before the Protected method B
	
	protected void m1() {
		
		System.out.println("Protected method");
		
	}

}
	class B extends ProtectedModifier{
		
		
		public static void main(String[] args){
			
			//valid since object is created for the parent class and method is called
			ProtectedModifier obj = new ProtectedModifier();
			obj.m1();
			
			//Parent class methods are available to child class.
			B obj2 = new B();
			obj2.m1();
			
			//Parent class reference can be used to hold child object
			ProtectedModifier obj3 = new B();
			obj3.m1();
		
			//USE Alt Shift X J to run
		
		}
	}
	

