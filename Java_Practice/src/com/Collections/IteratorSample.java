package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList<Integer> al = new ArrayList<Integer>();
		  
	        for (int i = 0; i < 10; i++) 
	            al.add(i);
	  
	        System.out.println(al);
	        
	        Iterator itr = al.iterator();
	  
	        // Method 1 of iterator
	        while (itr.hasNext())
	        {
	            // Method 2 of iterator - we need to type case here because the return type is boolean
	            int i = (Integer)itr.next();
	            //System.out.println(itr.next());
	  
	            
	            System.out.print(i + " ");
	            
	            
	  
	           
	            if (i % 2 != 0)
	               itr.remove();  //Method 3 of iterator
	            	al.add(5);
	            
	        }
	        System.out.println(); 
	        System.out.println(al);

	}

}
