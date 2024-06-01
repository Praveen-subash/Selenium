package SamplePrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Sort_HashMap_By_Keys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> hashmap = new HashMap<>();
		 ArrayList<String> list = new ArrayList<>();  // SEE THE DIFFERENCE> ARRAYLIST IS CREATED FOR STRING
		
		hashmap.put("Avocado", 80);
		hashmap.put("Honeydew", 90);
		hashmap.put("Blueberries", 45);
		hashmap.put("Cranberries", 60);
		hashmap.put("Mango", 75);
		
		  Set set = hashmap.entrySet();
	      Iterator iterator = set.iterator(); //Set is a collection so we have used iterator
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next(); //Entry is a innerclass object of class. See the diagram in notes
	         
	        // System.out.println("key is: "+ mentry.getKey() + " & Value is: "+mentry.getValue());
	         list.add((String) mentry.getKey());
	         
	      }
	      
	      System.out.println(list);
	      Collections.sort(list);
	      Collections.reverse(list);
	      
	      for(String i:list) {
	    	  
	    	  Iterator iterator1 = set.iterator(); //Set is a collection so we have used iterator
		      while(iterator1.hasNext()) {
		         Map.Entry mentry = (Map.Entry)iterator1.next(); //Entry is a innerclass object of class. See the diagram in notes
		         
		        // System.out.println("key is: "+ mentry.getKey() + " & Value is: "+mentry.getValue());
		         if(i.equals(mentry.getKey())) {
		        	 
		        	 System.out.println("SORT WITH KEYS - Key is "+mentry.getKey()+" and value is "+mentry.getValue());
		        	 
		         }
		         
		      }
	    	  
	    	  
	      }
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      

	}

}
