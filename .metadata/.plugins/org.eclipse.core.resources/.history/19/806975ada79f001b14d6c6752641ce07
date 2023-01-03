package com.UserDefinedPackage;
	
	//EXAMPLE : 1 -- 
	//Define a abstract class with one abstract method and one concrete method
	abstract class Shape{  
		
		//Abstract method
		abstract void draw();  
		
		//Concrete method
		public void m1() {
			
			System.out.println("Concrete method in class Shape is called");
		}
		
	} 
	
	//Provide implementation using child class
	class Rectangle extends Shape{  
		void draw(){
			System.out.println("drawing rectangle");
			}  
	}  
	
	//Provide implementation using child class
	class Circle1 extends Shape{  
	void draw(){
		System.out.println("drawing circle");
		}  
	}  
	
	//===========================
	
	//EXAMPLE : 2 -- 
	//Define a abstract class with two abstract methods
	abstract class Test{
		
		abstract void A();
		abstract void B();
		public void m2() {
					
					System.out.println("Concrete method in class Test is called");
				}
		
	}
	
	//Here, we are not providing implementation for both the abstract methods.
	//So, this class should be declared as abstract
	abstract class NewTest extends Test{
		
		void A(){
			System.out.println("Abstract class A");
			
		}
		
	}
	
	//Now, next level child class will be responsible for implementation of class B and 
	//other classes will also be inherited from class NewTest
	class DummyTest extends NewTest {
		
		void B() {
			
			System.out.println("Abstract class B");
		}
		
	}
	
	//Calling the abstract classes	
	
	public class TestAbstraction1{  
		public static void main(String args[]){  
			
			//The abstract method only changes. The concrete method remains same
			Shape s = new Circle1();
			s.draw();
			s.m1();
			
			//The abstract method only changes. The concrete method remains same
			Shape r = new Rectangle();
			r.draw();
			r.m1();
			 
			//Here, we are creating reference object for the child class 2 and calling all the methods
			Test obj =  new DummyTest();
			obj.A();
			obj.B();
			obj.m2();
		
		}  
	
	}