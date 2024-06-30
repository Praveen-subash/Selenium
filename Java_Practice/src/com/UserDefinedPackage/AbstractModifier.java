package com.UserDefinedPackage;

abstract class Boom{
   //abstract method
   public abstract void sound();
}

//Dog class extends Animal class
 class Dog extends Boom{

   public void sound(){
	System.out.println("Woof");
	
   }
 } 
 
 class Cat extends Boom{
	 
	 public void sound() {
		 
		 System.out.println("Meow");
	 }
 }
   
 public class AbstractModifier {
	   public static void main(String args[]){
		   
		   //An object cannot be created for abstract class. 
		   //The methods of abstract class can be accessed using child class only
		   Boom obj = new Dog();
		   obj.sound();
			
		   Boom obj2 = new Cat();
		   obj2.sound();
		   
		   //If we create object for class Boom, we will get compile error bcos the method is not implemented
			
		   } 
	   
   }
   
   
