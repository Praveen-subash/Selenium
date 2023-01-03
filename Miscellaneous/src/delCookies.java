import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class delCookies {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Setup\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("sessionkey");
		
		driver.get("https://www.redbus.in/");
		
		//This step takes screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//The screenshot is to be copied to local machine
		FileUtils.copyFile(src,new File("D:\\screenshot.png"));
		
		//Add import org.apache.commons.io.fileutils. If the error is not resolved, download this jar and attach it.
		//Link : https://commons.apache.org/proper/commons-io/download_io.cgi. From Binaries
		//Also add throws declaration

	}

}
