package com.TestPackage;

public class InstanceVariables {
	
	int x = 10;
	int y;
	
	public static void main(String[] args) throws InterruptedException {
		
		//NOTE
		//ALWAYS REMEMBER THAT OBJECT CREATION FOR INSTANCE VARIABLES IS ONLY FOR ACCESS.
		//DONT ASSUME THAT WE ARE CREATING AN OBJECT TO CHANGE THE VALUE 
		//IF YOU PRINT x normally, it'll print 10
		//d1.x = 200
		//But x is always 10
		//System.out.println(x); --> this will not work bcos static methods cannot access instance variables directly
		//Instance variable from static method cannot be accessed. It can be accessed only by creating a object
		System.out.println("Inside main method");
		InstanceVariables d1 = new InstanceVariables();
		
		d1.x=200;
		System.out.println(d1.x); //--> This will work bcos we are indirectly calling instance variable from static method
		
		System.out.println(d1.y); //Default value is 0
		d1.y = 100;
		System.out.println(d1.y);
		
		//If you are going to access the instance method m1, create a object and then access it
		InstanceVariables obj = new InstanceVariables();
		obj.m1();
		
		//System.out.println(x); --> // This is a static method. So we cannot access x directly
		
		
	}
	
	public void m1() {
		//Instance variable from instance method can be accessed directly
		System.out.println("Inside sub method");
		System.out.println(x);  // --> This is a instance method. So we can access x directly
		
		InstanceVariables d2 = new InstanceVariables();
		d2.x=356;
		//NOTE THIS CLEARLY. WHEN WE CREATE A OBJECT, ONLY FOR THAT OBJECT, VALUE GETS CHANGED AND NOT ORIGINAL VALUE - multiple copies
		//BUT FOR STATIC, VALUE GETS CHANGED PERMANENTLY - only 1 copy
		System.out.println(d2.x);
		System.out.println(x);
	}
	
}


