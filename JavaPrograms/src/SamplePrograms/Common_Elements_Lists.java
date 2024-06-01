package SamplePrograms;

import java.util.ArrayList;
import java.util.List;

public class Common_Elements_Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		

		list1.add(3);
		list1.add(5);
		list1.add(7);
		
		list2.add(3);
		list2.add(7);
		
		List<Integer> list3 = new ArrayList<Integer>(list1);
		
		
		
		
		list3.retainAll(list2);
		
		
		System.out.println(list3);
	
		
		 

	}

}
