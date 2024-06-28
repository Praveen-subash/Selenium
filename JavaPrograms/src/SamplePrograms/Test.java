package SamplePrograms;

import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "How are you";
		
		String str="";
		
		String[] a = s.split(" ");
		
		for(int i=0;i<a.length;i++) {
			
			char[] ch = a[i].toCharArray();
			
			for(int j=ch.length-1;j>=0;j--) {
				
				
				str = str+ch[j];
				
			}
			
			str = str+" ";
			
			
			
		}
		
		System.out.println(str);
		
		
	}

}
