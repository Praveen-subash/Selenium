package com.oops;

public class InstanceControlFlow {
	
	int i=10;  //3 (i=0)  //9 (i=20)
	{          //4
		//m1();  //10
		System.out.println("First Instance Block");  //12
	}
	
	InstanceControlFlow(){   //5
		System.out.println("Constructor");  //15
	}

	public static void main(String[] args) {   //1  STatic control flow starts first
		//system first identifies static blocks. Executes static blocks and then main method. Inside that main method, 
		//we are creating an object so the operation for instance control block starts from step 3
		// TODO Auto-generated method stub
		
		InstanceControlFlow t = new InstanceControlFlow();  //2
		//COMMENT THE ABOVE OBJECT CREATION LINE AND SEE THE OUTPUT
		System.out.println("Main method");  //16
		//CREATE ANOTHER OBJECT AND SEE THE OUTPUT (Same 3 ssteps for instance ccontrol flow will get executed)

	}
	
	public void m1() {  //6  This is also recognized but not executed
		
		System.out.println(j); //11 j=0
	}
	{                   //7
		System.out.println("second Instance block");  //13
	} 
	int j=20;            //8(j=0)  //14 j=20

}


/*Whenever we are executing a JAVA class, first static control flow will get executed.
In that static control flow, if we are creating any object, for every object the following flow will get executed as part of Instance control flow.
1.	Identification of instance members from top to bottom. (3-8) (THIS ALSO INCLUDES METHODS)
2.	Execution of instance variable assignments and instance blocks from top to bottom. (9-14)
3.	Execution of constructor. 15
*/