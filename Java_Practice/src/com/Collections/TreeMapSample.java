package com.Collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
         

		 // Inserting the Elements
	     tm.put(3, "Geeks");
	     tm.put(2, "For");
	     tm.put(1, "Geeks");
	
	     for (Map.Entry mapElement : tm.entrySet()) {
	         int key
	             = (int)mapElement.getKey();
	
	         // Finding the value
	         String value
	             = (String)mapElement.getValue();
	
	         System.out.println(key + " : "
	                            + value);
	     }
	     
	     
	     Comparator<Integer> comp = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1>o2) {
					
					return 1;
				}
				else {
					
					return -1;
				}
				// TODO Auto-generated method stub
				
			}
	    	 
	    	 
	    	 
	     };
	     
	     
	     

	}

}
