package SamplePrograms;

import java.util.Arrays;

public class CopayArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,3,5,7};
		
		int[] b = {2,4,6,8};
		
		int[] c = new int[a.length+b.length];
		
		int i=0;
		
		for(int p:a) {
			
			c[i]=p;
			i++;
		}
		
		for(int p:b) {
			
			c[i]=p;
			i++;
		}
		Arrays.sort(c);
		for(int p:c) {
			
			System.out.println(p);
			
		}
		

	}

}
