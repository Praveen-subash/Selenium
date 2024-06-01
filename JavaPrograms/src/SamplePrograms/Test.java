package SamplePrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class test {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		HashMap<Integer,ArrayList<String>> map = new    HashMap<Integer,ArrayList<String>>();
//
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("abc");
//		list.add("xyz");
//		map.put(100,list);
//		
//		System.out.println(map);
//		
//		list.set(1, "tt");
//		
//		System.out.println(map);
		
		// TODO Auto-generated method stub
		
		String str = "I Am the King";
		String[] words = str.split(" ");
		String strRev = "";
		int i;
		for (i = 0; i < words.length; i++) {
			char[] ch = words[i].toCharArray();
			if (i % 2 != 0) {
				
				
				for(int j=ch.length-1;j>=0;j--) {
					
					strRev = strRev+ch[j];
					
				}
				
			}else {
				
				strRev = strRev + words[i];
			}
			
			//for spaces
			strRev = strRev+" ";
		}
		 
		
	System.out.println(strRev);

		
	}

	

}
