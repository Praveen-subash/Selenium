package com.TestPackage;

public class DiffInstanceStatic { 	
	
	static int x = 100;
	int y=200;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(x); //-> static methods can access static variables directly
		//System.out.println(y); //-> static methods cannot access instance variables directly. Can be accessed only by creating an instance
		DiffInstanceStatic obj = new DiffInstanceStatic();
		System.out.println(obj.y);
		
		

	}
	
	
	public void accessVar() {
		
		System.out.println(x); //-> instance methods can access static variables directly
		System.out.println(y);//-> instance methods can access instance variables directly
		
		
		
	}

}
