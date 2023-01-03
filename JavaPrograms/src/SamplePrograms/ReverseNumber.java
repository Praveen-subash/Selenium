package SamplePrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int origNo = 769;
		
		int n=0,t=0;
		
		while(origNo!=0) {
			
			n = origNo%10; //9
			t=n+t*10;
			origNo=origNo/10;
			
			
		}
		
		System.out.println(t);

	}

}
