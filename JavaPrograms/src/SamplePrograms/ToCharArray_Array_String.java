package SamplePrograms;

import java.util.Arrays;

public class ToCharArray_Array_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Manipulations for a characters in a word
		
		String str = "Geeks for Geeks";
		String t = "";
		
		//toCharArray
		
		char[] ch = str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			
			System.out.println(ch[i]);
			
			
		}
		
		//Manipulations for a word in a array 
		
		String[] s  = {"eat","tea","tan","ate","nat","bat"};
		
		
		String[] newStr = new String[s.length];
		
		for(int i=0;i<s.length;i++) {
			
			char[] c = s[i].toCharArray();
			
			for(int j=0;j<c.length;j++) {
				
				System.out.println(c[j]);
				
			}
			
			System.out.println("---");
			
		}
		
		System.out.println(Arrays.toString(s));
		
		//Manipulations for a word in a string 
		
		String abc = "I am the king";
		
		String[] splitStr = abc.split(" ");
		
		for(int i=0;i<splitStr.length;i++) {
			
			char[] charVal = splitStr[i].toCharArray();
			
			System.out.println(charVal);
			
		}
		
		
		
		

	}

}
