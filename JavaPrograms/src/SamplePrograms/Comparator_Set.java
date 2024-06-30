package SamplePrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Comparator_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator<String> comp = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if(o1.compareTo(o2)<0) {
					
					return +1;
				}
				else {
					
					return -1;
				}
			}
			
			
			
			
		};
		
		 TreeSet<String> tset = new TreeSet<String>(comp);

         // Displays in alphabetical order
         tset.add("ABC");
         tset.add("String");
         tset.add("Test");
         tset.add("Pen");
         tset.add("Ink");
         tset.add("Jack");
         
         System.out.println(tset);
         
       
	}

}
