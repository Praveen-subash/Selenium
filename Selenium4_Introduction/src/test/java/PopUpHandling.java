import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PopUpHandling {
	
	public static void main (String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		
		//https://www.youtube.com/watch?time_continue=1292&v=deKXbbIHD4w&feature=emb_logo
		
		//1. ACCEPT INSECURE SSL CERIIFCATES
		options.setAcceptInsecureCerts(true);  
		
		//2. ADD CHROME EXTENSIONS
		
			//This is for starting the browser with extensions. In general there will not be any extensions when you open a chrome browser through selenium
			//https://techpp.com/2022/08/22/how-to-download-and-save-chrome-extension-as-crx/
			// You have to give the path of .crx file which is a extension. Follow the steps in the above link to create
			//the extension as .crx file and send the path here
		
		options.addExtensions(new File("C:\\\\Users\\\\sprav\\\\AppData\\\\Local\\\\Google\\\\Chrome\\\\User Data\\\\Default\\\\Extensions\\\\ndgimibanhlabgdgjcpbbndiehljcpfh\\\\4.6.0_0.crx"));
		
		//3. ADD PROXY TO A SITE
		
		Proxy p = new Proxy();
		p.setHttpProxy("<IP address : Port no>");
		options.setCapability("proxy", p);
		 
		
		//4. OPEN CHROME IN MAXIMIZED MODE
		
		options.addArguments("start-maximized");
		
		//5. OPEN WEBSITE WITHOUT WINDOW POP UPS (NOT PERMISSION POP UPS) AND REMOVE CHROME IS CONTROLLED BY A POP UP BOX
		//https://www.youtube.com/watch?v=rjScSPsgtro
		
		options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking","enable-automation"));
		
		//6. OPEN WEBSITE IN INCOGNITO MODE
		options.addArguments("incognito");
		
		//7. OPEN WEBSITE WITHOUT WANTS TO SHOW NOTIFICATIONS POP UP - spicejet
		options.addArguments("disable-notifications");
		
		//8. OPEN WEBSITE WITHOUT WANTS TO KNOW YOUR LOCATION POP UP
		options.addArguments("disable-geolocation");
		
		//9. OPEN WEBSITE WITHOUT WANTS TO USE YOUR MICROPHONE OR CAMERA
		options.addArguments("disable-media-stream");
	
		//10. OPEN A WEBSITE BY ALLOWING NOTIFCATIONS
		// 0 - Default, 1 - Allow, 2 - Block
		Map < String, Object > contentSettings = new HashMap < String, Object > ();
		Map < String, Object > profile = new HashMap < String, Object > ();
		Map < String, Object > prefs = new HashMap < String, Object > ();
		
		contentSettings.put("notifications", 1);
	    profile.put("managed_default_content_settings", contentSettings);
	    prefs.put("profile", profile);
	    
	    //11. OPEN A WEBSITE BY ALLOWING GEO LOCATION
	    // 0 - Default, 1 - Allow, 2 - Block
	    
	   /* Map < String, Object > contentSettings = new HashMap < String, Object > ();
		Map < String, Object > profile = new HashMap < String, Object > ();
		Map < String, Object > prefs = new HashMap < String, Object > ();*/

	    contentSettings.put("geolocation", 1);
	    profile.put("managed_default_content_settings", contentSettings);
	    prefs.put("profile", profile);
	    
	    //12. OPEN A WEBSITE BY ALLOWING CAMERA
	    // 0 - Default, 1 - Allow, 2 - Block
	    
	    /*Map < String, Object > contentSettings = new HashMap < String, Object > ();
		Map < String, Object > profile = new HashMap < String, Object > ();
		Map < String, Object > prefs = new HashMap < String, Object > ();*/
	    
	    contentSettings.put("media_stream", 1);
	    profile.put("managed_default_content_settings", contentSettings);
	    prefs.put("profile", profile);

		
		WebDriver driver = new ChromeDriver(options);
		
		//This site has insecure connection which selenium will bypass
		//driver.get("https://expired.badssl.com/");
		driver.get("https://www.airasia.co.in/home");
		
	}

}
