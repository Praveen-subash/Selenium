package SamplePrograms;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "*";
		int rowCount = 5;
		
		for(int i=0;i<rowCount;i++) {
			
			for(int t=0;t<=i;t++) {
				
				System.out.print(s);
				
			}
			//Remeber this
			System.out.println();
			
		}

	}

}
