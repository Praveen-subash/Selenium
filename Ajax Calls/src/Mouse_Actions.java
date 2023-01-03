import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mouse_Actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebDriverWait w = new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a#nav-link-accountList")));
		System.out.println("Amazon page is loaded");
		
		driver.manage().window().maximize();
		
		//Hover action
		Actions mouse_Move = new Actions(driver);
		mouse_Move.moveToElement(driver.findElement(By.cssSelector("a#nav-link-accountList"))).build().perform();
	
		System.out.println("Hover action is completed");
		
		
		mouse_Move.moveToElement(driver.findElement(By.cssSelector("input#twotabsearchtextbox")))
	
							                     .click()  //Click
							                     .keyDown(Keys.SHIFT) //Hold Shift Key
							                     .sendKeys("Hello") //SendKeys							                     
							                     .doubleClick() //Double click
							                     .contextClick() //Right click 
							                     .build().perform();
		
		//Getting X, Y co ordinates
		
		Point p = driver.findElement(By.cssSelector("input#twotabsearchtextbox")).getLocation();
		
		System.out.println("X co-ordinate is "+p.getX()+" Y co-ordinate is "+p.getY());
		
		//Using X,Y co ordinates for mouse actions
		
		mouse_Move.moveByOffset(266,11).click().sendKeys("NewTest").build().perform();
		
		
	}

}
