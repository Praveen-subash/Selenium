package com.TestPackage;

import com.UserDefinedPackage.*;

 class ProtectedTest extends ProtectedModifier{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invalid since protected members can be accessed from outside package only in child classes with child reference Only
		//ProtectedModifier obj = new ProtectedModifier();
		//obj.m1();
		
		
		//VALID - child reference
		ProtectedTest m = new ProtectedTest();
		m.m1();
		
		//Here also parent reference is there
		//ProtectedModifier obj3 = new ProtectedTest();
		//obj3.m1();
		
		

	}

}
