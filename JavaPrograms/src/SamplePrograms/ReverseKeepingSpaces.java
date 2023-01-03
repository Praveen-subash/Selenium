package SamplePrograms;

public class ReverseKeepingSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I AM KING";
		
		String rev ="";
		
		String[] spl = str.split(" ");
		
		for(String s : spl) {
			
			char[] ch = s.toCharArray();
			
			
			
			for(int i=ch.length-1;i>=0;i--) {
				
				
				rev = rev + ch[i];
				
				if(i==0) {
					
					rev = rev + " ";  
				}
				
			}
			
		}
		
		System.out.println(rev);

	}

}
