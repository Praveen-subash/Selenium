package SamplePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Comparator_List {

	
		// TODO Auto-generated method stub
		
		
		
		public static void main(String[] args) {
			
			Comparator<Integer>  comp = new Comparator<Integer>() {

				

				@Override
				public int compare(Integer o1, Integer o2) {
					// TODO Auto-generated method stub
					if(o1<o2) {
						
						return 1; //1 means reverse
						
					}
					else {
						
						
						return -1; //-1 means dont
					}
						
						
						
				}
				
				
				
			};
			 
			ArrayList<Integer> aList = new ArrayList<Integer>();
			aList.add(25);
			aList.add(37);
			aList.add(19);
			aList.add(8);
			
			Collections.sort(aList,comp);
			
			System.out.println(aList);
			
			
		}

}