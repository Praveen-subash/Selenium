import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObjectRepository_Home {

	
		WebDriver driver;
		
		//This is a constructor. Will not come inside main method.
		//WE are creating constructor bcos we dont know where it should execute in chorme or mozila. We are passing that
		//info from the other class
		public ObjectRepository_Home(WebDriver driver) {
			
			//this. always has local driver
			//RHS has argument driver
			this.driver = driver;
			
		}
		
		By searchBox = By.id("srchword");
		By searchBtn =    By.xpath("//input[@class='newsrchbtn']");
		
		
		
		//If yu dont specify return statement yu cannot give .sendkeys operation in RediffLogin class
		public WebElement search() {
			
			return driver.findElement(searchBox);
			
		}
		
		public WebElement searchLink() {
			
			return driver.findElement(searchBtn);
		}
		
		  

}
  