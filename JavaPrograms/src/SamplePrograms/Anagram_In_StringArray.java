package SamplePrograms;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Anagram_In_StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s  = {"eat","tea","tan","ate","nat","bat"};
		String str="";
		
		String[] newStr = new String[s.length];
		
		for(int i=0;i<s.length;i++) {
			
			char[] ch = s[i].toCharArray();
			Arrays.sort(ch);
			for(char m:ch) {
				
				str = str+m;
			}
			
			newStr[i] = str;
			str="";
			
			
			
		}
		
		System.out.println(Arrays.toString(newStr));
		HashMap<String,Integer> hmap = new HashMap<String,Integer>();
		
		for(int i=0;i<newStr.length;i++) {
			
			
			
			if(hmap.containsKey(newStr[i])) {
				
				hmap.put(newStr[i], hmap.get(newStr[i])+1);
			}
			else {
				
				hmap.put(newStr[i], 1);
			}
				
			
		}
		
		System.out.println(hmap);
		
		
		
	}
}
