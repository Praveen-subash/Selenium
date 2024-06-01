package SamplePrograms;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class String_Compression {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String str ="AAABBBBCC";
		
		char[] splitStr = str.toCharArray();
		
		HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
		
		
		for(int i=0;i<splitStr.length;i++) {
			
			
			if(hmap.containsKey(splitStr[i])) {
				
				hmap.put(splitStr[i], hmap.get(splitStr[i])+1);
				
			}
			
			else {
				
				hmap.put(splitStr[i], 1);
			}
			
			
			
		}
		
		System.out.println(hmap);
		
		Set s = hmap.entrySet();
		
		Iterator iter = s.iterator();
		while(iter.hasNext()) {
			
			Map.Entry m = (Map.Entry) iter.next();
			System.out.print(m.getValue()+""+m.getKey());
			
			
		}
		
		
	}

}
