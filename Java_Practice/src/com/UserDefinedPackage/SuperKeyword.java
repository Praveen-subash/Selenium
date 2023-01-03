package com.UserDefinedPackage;

class Parent{
	
	//Parent class variable
	String name = "Parent class variable";
	int y;
	
	//Parent class method
	public void getMethod() {
		
		System.out.println("I am parent class method");
		
	}
	
	//parent class constructor
	Parent(){
		
		System.out.println("Parent class constructor");
		
	}
	//parent class constructor
	Parent(int y){
		
		this.y = y;
		System.out.println(y);
	}
	
	
	
	
}

public class SuperKeyword extends Parent {
	
	//Child class variable
	String name = "Child class variable";
	int x;
	
	//Child class method
	public void getVariable() {
			
		//Here, only the child class variable gets printed
			System.out.println(name);	
		//When you use super keyword, parent class variable gets printed
			System.out.println(super.name);	
			
				
	}
	//METHOD OVERRIDING
	public void getMethod() {
		
		//This calls the parent class method
		super.getMethod();
		System.out.println("I am child class method");
			
	}
	
	//Child class constructor
	//Here, it is optional to define super bcos When a object is instantiated, the new keyword invokes the constructor of child class, 
	//which implicitly invokes the constructor of parent class. 
	SuperKeyword(){
		
		super();
		
		System.out.println("Child class constructor");
		
	}
	
	//Child class parametrized constructor
	//Here, we have to define super keyword bcos it is mandatory for parametrized constructor
	//IF THIS IS NOT SPECIFIED, THIS WILL CALL DEFAULT CONSTRUCTOR OF THE PARENT AND NOT THE PARAMETRIZED CONSTRUCTOR
	SuperKeyword(int x){
		
		super(100);  //comment this and execute. super() will be called - VERYYYY IMPORTANT
		this.x = x;
		System.out.println("Int constructor val is "+x);
		
	}
	
	SuperKeyword(String s){
		
		this(5); //NOTE THIS -> This is used to call the constructor of the current class This().
		System.out.println(super.name);
		System.out.println("String constructor val is "+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//When a object is instantiated, the new keyword invokes the constructor of child class, 
		//which implicitly invokes the constructor of parent class. 
		//1st parent class constructor gets executed
		//2nd child class constructor gets executed
		SuperKeyword obj = new SuperKeyword();
		
		SuperKeyword obj1 = new SuperKeyword(5);
		SuperKeyword obj2 = new SuperKeyword("Pappu");
		
		obj.getVariable();
		obj.getMethod();
		
	
	}

}
