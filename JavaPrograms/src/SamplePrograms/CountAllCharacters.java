package SamplePrograms;

import java.util.HashMap;

public class CountAllCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Geeks for geeks";
		
		HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
		
		char[] chr = str.toCharArray();
		
		for(char ch1 : chr) {
			
			System.out.println(ch1);
			
			
		}
		System.out.println("=====");
		
		int value = 0;
		for(int i=0;i<str.length();i++) {
			int count =1;
			char ch = str.charAt(i);
			System.out.println(ch);
			if(ch==' ') {
				
				
			}
			
			else if(hmap.containsKey(ch)){
				
				
				hmap.put(ch, hmap.get(ch)+1);
				
			}
			
			else {
				
				//int finalCnt = value+count;
				hmap.put(ch,1);
			}
			
			
			
			count = 0;
		}
		
		System.out.println(hmap);

	}

}
