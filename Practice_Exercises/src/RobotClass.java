import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf");
		driver.findElement(By.id("download")).click();
		
		Robot robot = new Robot();
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_UP);
		Thread.sleep(3000);
			
		robot.keyRelease(KeyEvent.VK_UP);
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_TAB);	
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		
		

	}

}
