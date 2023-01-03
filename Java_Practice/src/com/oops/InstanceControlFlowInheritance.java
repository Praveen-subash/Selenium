package com.oops;

class BasicInstance {
	
	int i=10;  //4 (i=0)  //15 i=10
	{          //5 
		m1();   //16
		System.out.println("Parent Instance Block");   //18
	}
	
	BasicInstance(){    //6  //20
		System.out.println("Parent Constructor");  
	}

	public static void main(String[] args) {     //1 identification of static members from parent to child
		
		// TODO Auto-generated method stub
		
		BasicInstance t = new BasicInstance();  
		
		System.out.println("Parent Main method");  
		

	}
	
	public void m1() {  //7
		
		System.out.println(j);  //17
	}
	{                   
		System.out.println("second Instance block");  
	} 
	int j=20;          //8(j=0)  //19 j=20

}

class InstanceControlFlowInheritance extends BasicInstance {
	
	int x=100;  //9 (x = 0)  //21 x=100
	{          //10
		m2();  //22
		System.out.println("Child First Instance Block");   //24
	}
	
	InstanceControlFlowInheritance(){   //11
		System.out.println("Child Constructor");  //27
	}

	public static void main(String[] args) {    //2 identification of static members from parent to child
		
		// TODO Auto-generated method stub
		
		InstanceControlFlowInheritance t = new InstanceControlFlowInheritance();   //3
		
		System.out.println("Child Main method");  //28
		

	}
	
	public void m2() {  //12
		
		System.out.println(y); //23
	}
	{                //13  
		System.out.println("Child second Instance block");  //25
	} 
	int y=200;     //14 y=0    //26 (y=200)
	
	
	
	
	
	
}

/* •	Identification of instance members from Parent to child. (4-14)
•	Execution of instance variable assignments and instance blocks only in Parent class. (15-19)
•	Execution of Parent Constructor. (20)
•	Execution of instance variable assignments and instance blocks only in Child class.(21-26)
•	Execution of Child  Constructor.(27)

*/
