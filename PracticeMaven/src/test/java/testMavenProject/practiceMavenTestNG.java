package testMavenProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class practiceMavenTestNG {
	 
	//@Test(priority=2)
	public void getData(String Value) throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\Selenium\\PracticeMaven\\src\\test\\java\\testMavenProject\\data.properties");
		prop.load(fis);			
		
		System.out.println(prop.getProperty(Value));
		
	}
	
	
	@Test
	public void testfn1() throws IOException {
	
		getData("url");	
		
	}
	
	
	
	

}
