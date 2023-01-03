package com.GenericConcepts;

import java.util.HashMap;



public class ReturnStatements {


	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		//Method 1
		String s = ReturnStatements.testMethod().get(2);
		System.out.println(s);
		
		//Method 2
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		map1 = ReturnStatements.testMethod();
		System.out.println(map1.get(2));
		
	}
	
	public static HashMap<Integer, String> testMethod() {
		
		
		HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
		   map.put(1,"Mango");  //Put elements in Map  
		   map.put(2,"Apple");    
		   map.put(3,"Banana");   
		   map.put(4,"Grapes");   
		   
		   
		  return map;
		
		
		
	}

}
