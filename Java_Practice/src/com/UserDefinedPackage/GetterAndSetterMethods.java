package com.UserDefinedPackage;

public class GetterAndSetterMethods {
	
	String name;
	
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	public String getName() {
		
		return this.name;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GetterAndSetterMethods obj = new GetterAndSetterMethods();
		obj.setName("Pappu");
		System.out.println("The name retrieved from getter method is "+obj.getName());

	}

}
