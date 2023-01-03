package com.oops;

class Customer {
	
	private double balance; //data hiding
	
	//These methods are abstraction
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}

//Note this public class with main method
public class Encapsulation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//We can only access them.
		Customer s = new Customer();
		s.setBalance(25.20);
		System.out.println("The balance is "+s.getBalance());
		
		

	}
	
	
}
