package SamplePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class RemoveRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "check";
		
		String[] str= new String[s.length()];
		String sv = "";
		
		char[] ch = s.toCharArray();
		
		int i=0,j=0;
		
		for(i=0;i<ch.length;i++)
		{
			
			//Traversing from the back to original position. Only if loop completes j==i
			for(j=0;j<i;j++) {
				
				if(ch[i]==ch[j]) {
					
					break;
				}
				
				
			}
			
			if(j==i) {
				
				sv = sv+ch[i];
				
				
			}	
			
		}
	
		
		System.out.println(sv);
	}

}
