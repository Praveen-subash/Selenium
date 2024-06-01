package com.Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorNext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
        for (int i = 0; i < 10; i++)
            al.add(i);
  
        System.out.println(al);
  
        
        ListIterator ltr = al.listIterator();
  
        // METHOD 1 of List Iterator
        while (ltr.hasNext())
        {
            
            int i = (Integer)ltr.next(); // METHOD 2 of List Iterator
   
            
            System.out.print(i + " ");
  
           
//            if (i%2==0)
//            {
//            	i++; 
//                ltr.set(i);  // METHOD 3 of List Iterator. Replacing even no by next odd no
//                ltr.add(i);  // METHOD 4 of List Iterator. Adding one more to the list
//                
//                
//            }
//            else {
//            	ltr.remove();
//            	
//            }
            
            if(i%2==0) {
            	
            	ltr.set(i+1);
            }
            
            
        }
        System.out.println();
        System.out.println(al);

	}

}
