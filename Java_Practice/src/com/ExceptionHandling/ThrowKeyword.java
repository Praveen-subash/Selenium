package com.ExceptionHandling;

import java.io.IOException;

public class ThrowKeyword {

	 static void checkEligibilty(int stuage, int stuweight) throws IOException{ 
	      
		 if(stuage<12 && stuweight<40) {
	         throw new IOException("Student is not eligible for registration");  //If you throw checked exception which is IO
	         //You have to use throws
	      }
	      
	      else if(stuage>15 && stuweight>35) {
	    	  
	    	  throw new ArithmeticException("Student is not eligible for registration"); 
	      }
	      
	      else {
	         System.out.println("Student Entry is Valid!!"); 
	      }
	   } 

	   public static void main(String args[]) throws IOException{  //Here also we have to add throws bcos this is a caller method
	     System.out.println("Welcome to the Registration process!!");
	     checkEligibilty(1, 33); 
	     System.out.println("Have a nice day.."); 
	 } 
}
