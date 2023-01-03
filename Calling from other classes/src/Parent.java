

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Home Page is displayed");
		
		//================FROM ANOTHER CLASS=======================
		
		//We are allocating memory for the class Methods
		Methods m = new Methods(); 
		
		// We are calling the method from the class Methods.java
		m.validateheader();
		
		//If the return type is mentioned, the value is printed
		System.out.println(m.validateheader());  
		
		
		// If the method is mentioned as STATIC, instead of creating a object, Classname.Methodname can be dobne
		Methods.add();
		
		
		//==================FROM SAME CLASS=================
		
		
		//If static is not given, create a object of parent class to access the methods
		Parent p = new Parent();
		p.inside_Param();
		 
		//If static is provided, it can be accessed directly
		method1();		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://google.com");
		
		
		
		//For maximizing a window
		driver.manage().window().maximize();
		
		//For deleting all cookies
		//driver.manage().deleteAllCookies();
		
		System.out.println(driver.manage().window().getSize());
		Dimension d = new Dimension(500,600);
		driver.manage().window().setSize(d);
		
		

	}
	
	public static void method1()
	{
		System.out.println("Method1 is called");   
	
	}
	
	public void inside_Param() //Return type should be int since a integer val is returned
	{
		System.out.println("Data is flowing from Parent.java file");
		
	}
	

	

}