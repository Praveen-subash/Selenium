package com.Collections;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;

public class IdentityHashMapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();	
		
		//USES .equals method for comparing keys so 10 and 10 are same. Chaitanya gets replaced by Rahul
		 Integer I1 = new Integer(10);
	      Integer I2 = new Integer(10);
	      hmap.put(I1, "Chaitanya");
	      hmap.put(I2, "Rahul");
	      
	      System.out.println(hmap);
	      
	      System.out.println("==========");
	      
	    //USES == method for comparing keys so 10 and 10 are NOT Same
	      IdentityHashMap<Integer, String> lmap = new IdentityHashMap<Integer, String>();
	      
	      Integer I3 = new Integer(10);
	      Integer I4 = new Integer(10);
	      lmap.put(I3, "Chaitanya");
	      lmap.put(I4, "Rahul");
	      
	      System.out.println(lmap);
	      
	      

	}

}
