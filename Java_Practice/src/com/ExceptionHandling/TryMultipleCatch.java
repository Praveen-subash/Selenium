package com.ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TryMultipleCatch {
   public static void main(String args[]) {
      int num1, num2;
     
      try {
         /* We suspect that this block of statement can throw 
          * exception so we handled it by placing these statements
          * inside try and handled the exception in catch block
          */
         num1 = 0;
         num2 = 62 / num1;
         System.out.println(num2);
         System.out.println("Hey I'm at the end of try block");
      }
      catch (ArithmeticException e) { 
         /* This block will only execute if any Arithmetic exception 
          * occurs in try block
          */
    	  e.printStackTrace();
         System.out.println("You should not divide a number by zero");
      }
      catch (Exception e) {
         /* This is a generic Exception handler which means it can handle
          * all the exceptions. This will execute if the exception is not
          * handled by previous catch blocks.
          */
    	  e.printStackTrace();
         System.out.println("Exception occurred");
      }
      System.out.println("==I'm out of try-catch block in Java==");
      
   }
   
   
}