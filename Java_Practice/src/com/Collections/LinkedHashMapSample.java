package com.Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

	      //GETS DISPLAYED AS PER HASH CODE OF KEYS
	      hmap.put(12, "Chaitanya");
	      hmap.put(2, "Rahul");
	      hmap.put(7, "Singh");
	      hmap.put(49, "Ajeet");
	      hmap.put(3, "Anuj");
	      System.out.println(hmap);
	      
	      System.out.println("==========");
	      
	      LinkedHashMap<Integer, String> lmap = new LinkedHashMap<Integer, String>();
	      
	    //GETS DISPLAYED IN INSERTION ORDER
	      
	      lmap.put(12, "Chaitanya");
	      lmap.put(2, "Rahul");
	      lmap.put(7, "Singh");
	      lmap.put(49, "Ajeet");
	      lmap.put(3, "Anuj");
	      System.out.println(lmap);

	}

}
