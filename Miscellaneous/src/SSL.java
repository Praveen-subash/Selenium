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
		
		
		
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		options.setAcceptInsecureCerts(true);  
		WebDriver driver = new ChromeDriver(options);

		
		
	}

}
