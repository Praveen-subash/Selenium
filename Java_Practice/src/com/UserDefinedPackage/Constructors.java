package com.UserDefinedPackage;

public class Constructors {
	
	//This is no arg constructor. Gets invoked when we initialize an object
	Constructors() {
		
		System.out.println("I am the no arg constructor");
		
	}
	
	Constructors(int i){
		
		System.out.println("The value for int parametrized constructor is "+i);
	}
	
	Constructors(String s){
		
		System.out.println("The value for String parametrized constructor is "+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Compiler calls default constructor when the constructor is not defined. Default constructor will not have any code inside.
		//Even if you comment the no arg constructor, it will not show any error
		//But here, it'll show bcos you have defined two more constructors.
		Constructors obj1 = new Constructors();
		
		//If you comment the parametrized constructor, this will show error.
		Constructors obj2  = new Constructors(8);
		Constructors obj3 = new Constructors("STRING_VALUES");
		obj1.getMethod();
		obj2.getMethod(); //-> Note this
		
		

	}
	
	//This is a normal method
	public void getMethod() {
		
		System.out.println("I am the method");
	}

}
