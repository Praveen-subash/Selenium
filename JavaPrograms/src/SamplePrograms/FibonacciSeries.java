package SamplePrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int firstNum=0, secondNum=1;
		
		int thirdNum;
		
		int count = 5;
		
		System.out.println(firstNum);
		System.out.println(secondNum);
		
		for(int i=0;i<5;i++) {
			
			thirdNum = firstNum+ secondNum;
			
			System.out.println(thirdNum);
			
			firstNum = secondNum;
			secondNum = thirdNum;
			
		}
		

	}

}
