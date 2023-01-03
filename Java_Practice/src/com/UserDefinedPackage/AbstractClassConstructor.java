package com.UserDefinedPackage;

abstract class ParentClass {
	
	String name;
	String age;
	float d = 19.99f;
	
	ParentClass(String name,String age){
		
		this.name = name;
		this.age = age;
		
	}
	
	
	
	
}

class ChildClass extends ParentClass{
	
	String rollno;
	
	//This gets invoked first. Child class inherits properties of parent class also
	ChildClass(String name,String age,String rollno){
		
		//This calls the parent class constructor
		//As we have studied earlier, if it is a parametrized constructor, we have to call Parent constructor
		//using super keyword
		super(name,age); //Here, the compiler jumps to ParentClass constructor. Name, age gets initialized
		this.rollno = rollno;
		
		
		
	}
	
	
}


public class AbstractClassConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This goes and invokes the child class constructor
		ChildClass obj = new ChildClass("Pappu", "55", "100");
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.rollno);
		
		ChildClass obj1 = new ChildClass("Chintu", "77", "200");
		System.out.println(obj1.name);
		System.out.println(obj1.age);
		System.out.println(obj1.rollno);
		

	}

}
