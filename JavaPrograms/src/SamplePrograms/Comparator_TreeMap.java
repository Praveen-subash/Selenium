package SamplePrograms;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class Comparator_TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comparator<Integer> comp = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if(o1>o2) {
					
					return +1;
					
				}else {
					
					return -1;
				}
			}
			
			
			
		};
		
		TreeMap<Integer, String> hmap = new TreeMap<Integer, String>(comp);

	      /*Adding elements to HashMap*/
	      hmap.put(12, "Chaitanya");
	      hmap.put(2, "Rahul");
	      hmap.put(7, "Singh");
	      hmap.put(49, "Ajeet");
	      hmap.put(3, "Anuj");
	      System.out.println(hmap);
	      
	      

	}

}
