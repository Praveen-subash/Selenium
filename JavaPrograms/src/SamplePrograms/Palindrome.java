package SamplePrograms;

import java.util.Scanner;

public class Palindrome {
	
	public static void main (String[] args) {
        String original="Testla", reverse = "";
        
        char[] arr = original.toCharArray();
        
        for(int t=arr.length-1;t>=0;t--) {
        	
        	reverse = reverse + arr[t];
        	
        	
        }
       
        System.out.println(reverse); 
        
        //Method 2 - IMPORTANT
        StringBuilder sb = new StringBuilder(original);
        System.out.println(sb.reverse());
        
        if(sb.reverse().equals(reverse)) 
            System.out.println("The String is palindrome");
        else
            System.out.println("The String is not a palindrome");
         
    }

}
