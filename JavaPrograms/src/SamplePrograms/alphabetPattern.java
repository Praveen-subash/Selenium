package SamplePrograms;

public class alphabetPattern {
	
	public static void main(String[] args) { 
		
		char a;
		String p="";
		String m="";
		
		for(char t=90;t>=65;t--) {
			
			
			p=p+t;
			System.out.println(p);
		}
		
		for(char t=65;t<=90;t++) {
			
			
			m=m+t;
			System.out.println(m);
		}
		
		
	}

}
