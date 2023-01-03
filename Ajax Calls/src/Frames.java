import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		//Switch to frames
		
		int count = driver.findElements(By.tagName("iframe")).size();
		System.out.println("No of frames "+count);
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		//driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.cssSelector("div#draggable")).getText());
		
		//Drag and drop using actions class
		
		Actions m = new Actions(driver);
		m.dragAndDrop(driver.findElement(By.cssSelector("div#draggable")), driver.findElement(By.cssSelector("div#droppable"))).build().perform();
		
		
		driver.switchTo().defaultContent();
		
		//Handling slider using actions class
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		
		Point p = driver.findElement(By.cssSelector("div#slider")).getLocation();
		int x = p.getX();
		int y = p.getY();
		
		System.out.println(x);
		System.out.println(y);
		
		m.clickAndHold(driver.findElement(By.cssSelector("span.ui-slider-handle")))
		.moveByOffset(15, 15)
		.build().perform();
			
		
		
		
	}

}
