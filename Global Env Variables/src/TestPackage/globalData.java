package TestPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;

public class globalData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Properties class in java scans and extracts the values of .properties file
		Properties prop = new Properties();
		
		//We need to Specify the path whether .properties is present to the properties class 
		//Create a file input stream and pass it to properties 
		FileInputStream fis = new FileInputStream("D:\\Selenium\\Global Env Variables\\src\\TestPackage\\file.properties");
		prop.load(fis);
		
		String s = prop.getProperty("name"); //Assume name as key. Praveen as value
		System.out.println("The value retreived is "+s);
		
		prop.setProperty("school", "kola");
		
		//Setting the value for a key through code. For school as key, kola is the value
		System.out.println("The value retreived is "+prop.getProperty("school"));
		
		//The value for the existing value can also be changed. This is only changed in code.
		prop.setProperty("name", "DummyName");
		System.out.println("The changed name retreived is "+prop.getProperty("name"));
		
		//After thiis, value for name gets updated in .properties file
		//To change the value in properties file for an existing key. 
		FileOutputStream fos = new FileOutputStream("D:\\Selenium\\Global Env Variables\\src\\TestPackage\\file.properties");
		//Values changed is comments
		prop.store(fos, "Values changed");
		
		
	}

}
