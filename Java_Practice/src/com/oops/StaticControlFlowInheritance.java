package com.oops;

class BasicStatic
{
	 static int i=10; //1 (i=0)  //12 (i=10)
	 static  //2    
	{
		m1();   //13
		System.out.println("Base static block");  //15
	}
	public static void main(String args[]) //3
	{
		System.out.println("Base main method");
		
	}
	public static void m1() //4
	{
		System.out.println(j);   //14 Prints 0
	}
		static int j=20; //5     //16 (j=20)
}
public class StaticControlFlowInheritance extends BasicStatic
	{
	static int x=100; //6  //17 (x=100)
	static            //7
	{
		m2();   //17   //18 
		System.out.println("Derived First static block");  //20
		
	}
	public static void main(String args[])  //8
	{
	m2();  //23
	System.out.println("Derived main");  //25
	
	

	}
	public static void m2()  //9
	{
		System.out.println(y);   //19 Prints 0  /24 prints 200
	}
	static  //10
	{
		System.out.println("Derived second static block");  //21
	
	}
	 static int y=200;  //11  //22 y=200
	 
	 
}

//	Identification of static members from Parent to Child (1-11) (here, i=j=x=y=0 gets initialized)
//	Execution of static variable assignments and static blocks from parent to child (12-22)
//	Execution of child class main method (23-25)


