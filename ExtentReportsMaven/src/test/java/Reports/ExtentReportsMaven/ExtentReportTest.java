package Reports.ExtentReportsMaven;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.TakesScreenshot;

public class ExtentReportTest {
	ExtentReports rep;
	ExtentTest test;
	
	@BeforeTest
	public void report() {
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html"; // gives tthe project apath
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("Extent Report");
		report.config().setDocumentTitle("Automation Report");
		
		
		rep = new ExtentReports();
		rep.attachReporter(report);
		rep.setSystemInfo("TesterName", "ABC");
		
		
		
	}
	
	
	@Test
	public void initialSetup() throws IOException {
		
		test = rep.createTest("Red bus login");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		//This step takes screenshot
		
	
		driver.get("http://www.automationtesting.in");
        String title = driver.getTitle();
        Assert.assertEquals("Home-Selenium Webdriver Appium Complete Tutorial", title);
        takeScreenshot(driver,test);

	        
		rep.flush();
		
	}
	
	public static void takeScreenshot(WebDriver driver,ExtentTest test) throws IOException {
		
		//create object variable of TakeScreenshot class  
        TakesScreenshot ts = (TakesScreenshot) driver;
        
        //create File object variable which holds the screen shot reference 
        File source = ts.getScreenshotAs(OutputType.FILE);
        
        //store the screen shot path in path variable. Here we are storing the screenshots under screenshots folder 
        String path = "D:\\screenshot.png";
        
        //create another File object variable which points(refer) to the above stored path variable
        File destination = new File(path);
        
        //use FileUtils class method to save the screen shot at desired path
        FileUtils.copyFile(source, destination);
        
        //return the path where the screen shot is saved 
        
        test.addScreenCaptureFromPath("D:\\screenshot.png");
		
		
		
	}

}
