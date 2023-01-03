package SamplePrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AppendZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] val = {12,0,76,0,94,0};
		
		
		int[] val2 = new int[val.length];
		
		List<Integer> aList = Arrays.asList(val);
		
		Collections.sort(aList);
		Collections.reverse(aList);
		System.out.println(aList);
		
		for(int i=0;i<aList.size();i++) {
			
			val2[i]=aList.get(i);
			
		}
		
		for(int I:val2) {
			
			
			System.out.println(I);
		}

	}

}
