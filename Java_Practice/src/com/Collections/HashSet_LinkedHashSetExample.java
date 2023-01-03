package com.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSet_LinkedHashSetExample {
	
	public static void main(String[] args)
    {
        
		//EXAMPLE 1 FOR HASH SET
		HashSet<String> h = new HashSet<String>();
  
        
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("Zimbabawe");
        h.add("India"); // adding duplicate elements
  
        // Displaying the HashSet. Gets displayed WITHOUT an ORDER
        System.out.println(h);
        System.out.println("List contains India or not:"
                           + h.contains("India"));
  
        // Removing items from HashSet using remove()
        h.remove("Australia");
        System.out.println("List after removing Australia:"
                           + h);
  
        // Iterating over hash set items
        System.out.println("==ORDER IN HASH SET==");
        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());
        
        //==============================================================
        
        System.out.println("=========================");
        
      //EXAMPLE 2 FOR LINKED HASH SET
      	 LinkedHashSet<String> l = new LinkedHashSet<String>();
        
          
          l.add("India");
          l.add("Australia");
          l.add("South Africa");
          l.add("Zimbabawe");
          l.add("India"); 
    
          // Displaying the LinkedHashSet. Gets displayed IN AN ORDER SINCE INSERTION ORDER IS MAINTAINED
          System.out.println(l);
          System.out.println("List contains India or not:"
                             + l.contains("India"));
    
          // Removing items from HashSet using remove()
          l.remove("Australia");
          System.out.println("List after removing Australia:"
                             + l);
    
          // Iterating over hash set items
          System.out.println("==ORDER IN LINKED SET==");
          Iterator<String> p = l.iterator();
          while (p.hasNext())
              System.out.println(p.next());
        
    }

}
