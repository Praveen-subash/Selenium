package com.TestPackage;

public class StaticVariables {
	
	public static int x = 10;
	static int y=200;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//NOTE
		//ALWAYS REMEMBER THAT OBJECT CREATION FOR INSTANCE VARIABLES IS ONLY FOR ACCESS.
		//DONT ASSUME THAT WE ARE CREATING AN OBJECT TO CHANGE THE VALUE
		//BUT HERE, VALUE OF THE VARIABLE PERMANENTLY CHANGES UNLIKE INSTANCE VARIABLES - IMPORTANT NOTE
		
		System.out.println("Inside main method");
		
		//STATIC variables can be accessed using classname.variable_name;
		System.out.println(StaticVariables.x);
		System.out.println(x); //-> this is a static method so we can access static variable directly
		
		//Changes made in an instance variable using one object will not be reflected in other objects 
		//In case of static, changes will be reflected in other objects as static variables are common to all object of a class.
		StaticVariables.y=400;
		System.out.println("Val is"+y);
		StaticVariables obj = new StaticVariables();
		obj.m1();
		
		
	

	}
	
	public void m1() {
		
		System.out.println("Inside sub method");
		x=679;
		System.out.println(StaticVariables.x);
		//Static variables can be accessed directly as well from Instance method
		System.out.println(x); //-> this is a instance method but we can access static variable directly
		//When declared, the value was 200. Since only one copy is created, when the value is changed it gets reflected all over
		System.out.println(StaticVariables.y);
		
		//Note that here, we are accessing from other class. So we have to use classname.variable name.
		//If it is within the class, we use only variable name
		System.out.println(CentralTrafficInterface.num1_Inter);
		
		
	}

}
