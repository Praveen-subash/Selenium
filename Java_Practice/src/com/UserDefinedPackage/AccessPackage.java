package com.UserDefinedPackage;

import com.TestPackage.StaticVariables; //The static variable class is imported. If it is not Public, it'll not be imported
 

public class AccessPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVariables v = new StaticVariables();
		
		v.m1(); //This is accessible because the method m1 is public
		
		System.out.println(StaticVariables.x); //This is accessible because the variable x is public
		// System.out.println(StaticVariables.y); //This cannot be accessed bcos the variable is default

	}

}
