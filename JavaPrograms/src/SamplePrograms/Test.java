package SamplePrograms;

import java.util.HashMap;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 987,num=0,rev=0 ;
		
		while(a>0) {
			
			num = a%10;
			rev = rev*10+num;
			a=a/10;
			
			
			
		}
		
		System.out.println(rev);
		
	}

}
