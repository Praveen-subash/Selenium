package com.TestPackage;

public class VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sum(5,10);
		sumArgs(15,20,25);
		sumArgs();
		sumArgs(10,15,20,26,36,99,664);
		method2("String Passed",25,35,45);
		method3(new int[] {10,20,30});

	}
	
	//Using normal methods
	
	public static void sum(int a,int b)
	{
		int sum = a+b;
		System.out.println("The sum is "+sum);
	}
	
	//Using var args methods. Even with 0 args, loop will get executed. Remember ... similar to [] in array
	public static void sumArgs(int... strArray) {
		
		System.out.println("The loop is executed");
		for(int j:strArray) {
			
			
			System.out.println("the args value is "+j);
		}
		
	}
	
	//Here, we can also pass a combination of data types but ALWAYS REMEMBER THAT LAST PARAMETER SHOULD BE VAR ARG PARAMETER
	public static void method2(String s,int... str_Values) {
		
		System.out.println("The string is "+s);
		for(int k:str_Values) {
			
			
			System.out.println("the args value is "+k);
		}
		
	}
	
	//Using Arrays (See the differentiation b/w var args and arrays)
	public static void method3(int[] strVal1) {
		
		for(int p:strVal1) {
			
			
			System.out.println("the array value is "+p);
		}
		
	}

}
