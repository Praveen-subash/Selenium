package com.Collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//The navigable set extends the sorted set interface. Since a set doesn’t retain the insertion order, 
		//the navigable set interface provides the implementation to navigate through the 
		//Set. The class which implements the navigable set is a TreeSet which is an 
		//implementation of a self-balancing tree. Therefore, this interface provides us with a way to navigate through this tree.
		
		SortedSet set = new TreeSet();   
     
        set.add("Audi");  
        set.add("Zeque");  
        set.add("Mercedes");  
        set.add("Baleno");  
        System.out.println("The list of elements is given as:");  
        for (Object object : set) {  
            System.out.println(object);  
              }  
       
        
        //Returns the first element  
       System.out.println("The first element is given as: " + set.first());     
        //Returns the last element  
       System.out.println("The last element is given as: " + set.last());  
       //Returns a view of the portion of the given set whose elements are strictly less than the toElement.   
       System.out.println("The respective element is given as: " + set.headSet("Baleno"));  
       //Returns a view of the map whose keys are strictly less than the toKey.  
       System.out.println("The respective element is given as: " + set.tailSet("Audi")); 

	}

}
