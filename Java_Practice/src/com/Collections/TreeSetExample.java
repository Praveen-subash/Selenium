package com.Collections;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 TreeSet<String> tset = new TreeSet<String>();

         // Displays in alphabetical order
         tset.add("ABC");
         tset.add("String");
         tset.add("Test");
         tset.add("Pen");
         tset.add("Ink");
         tset.add("Jack");

         //Displaying TreeSet
         System.out.println(tset);

         // Displays in ascending order
         TreeSet<Integer> tset2 = new TreeSet<Integer>();

         // Adding elements to TreeSet<Integer>
         tset2.add(88);
         tset2.add(7);
         tset2.add(101);
         tset2.add(0);
         tset2.add(3);
         tset2.add(222);
         System.out.println(tset2);
         
        

	}

}
