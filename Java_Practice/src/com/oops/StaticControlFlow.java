package com.oops;

public class StaticControlFlow {

	
	static int i=10;  //1 Now i =0 //7 - Now i=10
	static            //2          
	{
		m1();                     //8
		
		System.out.println("First Static Block");     //10
	}
	 public static void main(String args[]) //3
	{
		m1();   //13
		
		System.out.println("main method");  //15
	}
	public static void m1() //4         //Forget this. This is not a static block. This is a static method. Only static members gets recognized in step 1
	{
		System.out.println(j);    //9 -  prints 0  //14
	}
	static  //5
	{
		System.out.println("second static block");  //11
	}
	static int j=20;  //6 Now j =0         //12 Now j=20
	
	//1. The static members are identified. Here, all are static. (1-6) Here, the value of i and j are assigned 0 (default value) 
	//THIS IS VERY IMPORTANT. During identification, default values are assigned. Only when it is executed (Step 2), the values are assigned.
	//2. static variables and blocks are executed from top to bottom.
	//3. main method gets executed.
}
