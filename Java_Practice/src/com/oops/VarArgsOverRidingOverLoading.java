package com.oops;


class parentVarArgs {
	
	public void m1(int... x) {
		
		System.out.println("The parent class var args is executed");
		
	}
	
}


class childVarArgs extends parentVarArgs{
	
	public void m1(int... x) {
		
		System.out.println("The child class var args is executed");
	
	}
	
}

class TestVarArgs extends parentVarArgs{
	
public void m1(int x) {
		
		System.out.println("The child class normal method");
		
		}
		
	}

	

public class VarArgsOverRidingOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		parentVarArgs obj1 = new parentVarArgs();
		obj1.m1(5);
		
		childVarArgs obj2 = new childVarArgs();
		obj2.m1(5);
		
		//These two methods are overriding. So child class method gets executed
		parentVarArgs obj3 = new childVarArgs();
		obj3.m1(7);
		
		// int... x and int x are not overriding. They are overloading. So parent class method is executed
		parentVarArgs obj4 = new TestVarArgs();
		obj4.m1(7);
		

	}

}
