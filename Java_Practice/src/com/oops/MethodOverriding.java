package com.oops;

class ParentClass{
	   //Overridden method
	   
	public void disp(){
	   
		System.out.println("disp() method of parent class");
	  
	}	 
	
	public void newMethod(){
		
		System.out.println("new method of parent class");
	  
	}
	
	public void m1() {
		
		System.out.println("m1 method of parent calss");
		
		}
	
	}

public class MethodOverriding extends ParentClass{
	   //Overriding method
	   
	   public void disp(){
		 
		   System.out.println("disp() method of Child class");
	   }
	   
	   //USING SUPER KEYWORD IN METHOD OVERRIDING
	   public void m1() {
			
		   super.m1();
			System.out.println("m1 method of child calss");
			
		}
	   
	   public void m6() {
		   
		   System.out.println("m6 method of child class");
	   }
	     
	  
	  public static void main( String args[]) {
		
		 // When Parent class reference refers to the parent class object then in this case overridden method 
		 //(the method of parent class) is called.
	
		ParentClass obj = new ParentClass();
		obj.disp();

		// When parent class reference refers to the child class object then the overriding method (method of child class) is called.
		
		ParentClass obj2 = new MethodOverriding();
		obj2.disp(); //In overriding, the execution is done by the Run Time object
		//Run time object on the right is child class. Hence, disp of child class gets executed
		
		
		//Here, the run time object checks if overridden method newMethod is available in child class.
		//SINCE IT IS NOT THERE, THE PARENT CLASS METHOD - newMethod GETS PRINTED
		//LIKEWISE EVEN FOR disp(), IF THE OVERRIDDEN METHOD IS NOT THERE, "disp() method of Parent class" WOULD HAVE GOT EXECUTED
		obj2.newMethod();
		
		
		//In case of overriding, if we want to call the overridden method,then we use super keyword
		ParentClass obj3 = new MethodOverriding();
		obj3.m1();
		
		//VERYYYYYYYYYYYYYYYYYYYYYY IMPORTANT
		//obj3.m6() IS NOT POSSIBLE. 
		//PARENT REFERENCE FOR CHILD OBJECT CAN ONLY CALL PARENT CLASS METHODS WHICH ARE INHERITED TO CHILD CLASS OR THE 
		//PARENT CLASS METHOD BASED ON WHETHER IT IS OVERRIDING OR OVERLOADING. IT CANNOT CALL THE METHODS SPECIFIC TO CHILD CLASS
		
		
		
	   	   }
	  


}









	



