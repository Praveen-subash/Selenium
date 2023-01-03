import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.apache.commons.io.FileUtils;


public class SSL {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Desired capabilities is class which helps to customize the chrome browser
		
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts(); //Also done with this
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		

		//Belongs to your local browser
		ChromeOptions c= new ChromeOptions();
		c.merge(ch);  //Set the capabilities to the local browser
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Setup\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(c); //Pass the object
		
		
	}

}
