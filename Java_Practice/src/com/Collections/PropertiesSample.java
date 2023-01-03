package com.Collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop=new Properties();
		
		//ALWAYS REMEMBER BOTH KEY AND VALUE SHOULD BE OF STRING TYPE
		
		//We are loading the .properties file here
		FileInputStream ip= new FileInputStream("D:\\Selenium\\Java_Practice\\src\\com\\Collections\\DurgaJava.properties");
		prop.load(ip);
		
		//Printing the values
		System.out.println(prop);
		
		//getting the value of the key
		String s = prop.getProperty("venki");
		System.out.println(s);
		
		//Setting a new key value
		prop.setProperty("Praveen", "100");
		System.out.println(prop);
		
		//Make changes in the .properties file with comments
		FileOutputStream op = new FileOutputStream("D:\\Selenium\\Java_Practice\\src\\com\\Collections\\DurgaJava.properties");
		prop.store(op, "Update through code");
		
	}

}
