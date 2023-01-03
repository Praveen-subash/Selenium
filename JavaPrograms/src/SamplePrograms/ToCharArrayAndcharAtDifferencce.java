package SamplePrograms;

public class ToCharArrayAndcharAtDifferencce {
	
	public static void main(String[] args) { 
		
		
		String str = "Geeks for Geeks";
		
		//toCharArray
		
		char[] ch = str.toCharArray();
		
		for(char c : ch) {
			
			System.out.println(c);
			
		}
		System.out.println("------");
		
		for(int i=0;i<str.length();i++) {
			
			char c = str.charAt(i);
			
			System.out.println(c);
			
			
		}
		
		
	}

}
