import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateBrokenLink {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		  WebDriver driver = new ChromeDriver();
	      driver.get("https://rahulshettyacademy.com/brokenlink");
	  
	      // establish and open connection with URL
	      HttpURLConnection conn = (HttpURLConnection)new URL("https://rahulshettyacademy.com/brokenlink").openConnection();

	      // set the HEAD request with setRequestMethod
	      conn.setRequestMethod("HEAD");
	      // connection started and get response code
	      conn.connect();
	      int r = conn.getResponseCode();
	      
	      System.out.println("Http response code: " + r);
	

	}

}
