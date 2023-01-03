package SamplePrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 29;
		int flag=0;
		for(int i=2;i<num/2;i++) {
			
			if(num%i==0) {
				
				flag=1;
				System.out.println("Divisible by "+i);
				break;
			}
			
			else {
				
				flag=0;
			}
			
			
		}
		
		if(flag==1) {
			
			System.out.println("Not a prime no");
		}
		
		else {
			
			System.out.println(num+" Is a prime no");
		}

	}

}
