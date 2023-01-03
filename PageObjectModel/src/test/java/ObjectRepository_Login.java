import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectRepository_Login {

	
		WebDriver driver;
		
		//This is a constructor. Will not come inside main method.
		//WE are creating constructor bcos we dont know where it should execute in chorme or mozila. We are passing that
		//info from the other class
		public ObjectRepository_Login(WebDriver driver) {
			
			//this. always has local driver
			//RHS has argument driver
			this.driver = driver;
			
		}
		
		By login = By.name("id");
		By pword = By.name("num");
		By go =    By.xpath("//input[@value='Login']");
		By homeBtn = By.linkText("rediff.com");
		
		
		//If yu dont specify return statement yu cannot give .sendkeys operation in RediffLogin class
		public WebElement emailId() {
			
			return driver.findElement(login);
			
		}
		
		public WebElement password() {
			
			return driver.findElement(pword);
		}
		
		public WebElement login() {
			
			return driver.findElement(go);
		}
		
		public WebElement Home() {
			
			return driver.findElement(homeBtn);
		}

}
