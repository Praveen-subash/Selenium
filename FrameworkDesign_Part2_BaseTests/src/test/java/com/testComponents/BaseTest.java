package com.testComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.pageobjects.LandingPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public WebDriver driver;
	public LandingPage landingPage; //**75 Both webdriver and landingPage should be public because this is extended in the tests
	
	public WebDriver initializeDriver() throws IOException {  //**66
		
		Properties prop = new Properties();
		//This will take the current working folder path = C:\Selenium\FrameworkDesign_Part2_BaseTest
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\resources\\GlobalData.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("Edge")) {
			
			EdgeOptions e = new EdgeOptions();
			e.addArguments("start-maximized");	
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver(e);
			
		}
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			
			ChromeOptions e = new ChromeOptions();
			e.addArguments("start-maximized");	
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(e);
			
		}
		
		if(browserName.equalsIgnoreCase("Firefox")) {
			
			FirefoxOptions e = new FirefoxOptions();
			e.addArguments("start-maximized");	
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(e);
			
		}
		
		return driver;  //**68 We need to return life of the driver to pass it to launchapplication
		
	}
	
	@BeforeMethod  //**73 declaring this as before method. SO test starts here
	public LandingPage launchApplication() throws IOException {  //**69
		
		driver = initializeDriver();
		landingPage = new LandingPage(driver); //**70
		landingPage.goTo();  //**71 
		//we are not doing like 64 64 like return new LandinPage bcos we need to login to the website
		return landingPage;
		
		
	}
	
	@AfterMethod
	
	public void tearDown() {  //**76
		
		driver.close();
	}
	
	

}
