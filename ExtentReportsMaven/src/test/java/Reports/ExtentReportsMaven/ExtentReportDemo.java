package Reports.ExtentReportsMaven;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

 

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

 

public class ExtentReportDemo {

      

   ExtentReports rep;

   //1. Configure the report parameters - done
   //2. Attach the configurations to the extent report
   //3. Define tests
   //4. Add screenshots
   //5. Attach screenshots

       @BeforeTest
       public void extentRep() {

    	   //1. Configurations

          String path = System.getProperty("user.dir")+"\\reports\\index.html";
          ExtentSparkReporter report = new ExtentSparkReporter(path);
          report.config().setDocumentTitle("Automation Report for Demo");
          report.config().setReportName("Extent Report");
         
          //2, Attach the configurations and create the report

          rep = new ExtentReports();
          rep.attachReporter(report);
          rep.setSystemInfo("TesterName", "ABC");

       }

       @Test

       public void passTest() throws IOException {
              
    	  ExtentTest Test = rep.createTest("TC 1");
    	  ChromeOptions options = new ChromeOptions();
  		options.addArguments("--remote-allow-origins=*");
  		WebDriver driver = new ChromeDriver(options);
          driver.get("http://www.automationtesting.in");
          String s = driver.getTitle();
          Assert.assertEquals(s, "Home-Selenium Webdriver Appium Complete Tutorial");
          Test.log(Status.PASS, "This test is passed");
          
          TakesScreenshot ts = (TakesScreenshot) driver;
          File src = ts.getScreenshotAs(OutputType.FILE);

          FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\reports\\img.png"));

          Test.addScreenCaptureFromPath(System.getProperty("user.dir")+"\\reports\\img.png");

          rep.flush();

       }

 
}