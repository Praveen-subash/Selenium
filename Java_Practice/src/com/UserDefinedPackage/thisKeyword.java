package com.UserDefinedPackage;

public class thisKeyword {
	
	String name;
	//Constructor
	thisKeyword(String name){
		
		//In Java, it is not allowed to declare two or more variables having the same name inside a scope 
		//(class scope or method scope). However, instance variables and parameters may have the same name. 
		//Here, name and name are same
		this.name = name;
		System.out.println("The name is "+name);
		
		//See this carefully which means obj.name
		System.out.println(this.name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		thisKeyword obj = new thisKeyword("Pappu");

	}

}
