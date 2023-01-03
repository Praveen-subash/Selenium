import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactory_Login {

	
		WebDriver driver;
		
		//This is a constructor. Will not come inside main method.
		//WE are creating constructor bcos we dont know where it should execute in chorme or mozila. We are passing that
		//info from the other class
		public PageFactory_Login(WebDriver driver) {
			
			//this. always has local driver
			//RHS has argument driver
			PageFactory.initElements(driver, this);
			
		}
		

		
		@FindBy(name="id")
		WebElement login;
		
		@FindBy(name="num")
		WebElement pword;
		
		@FindBy(xpath="//input[@value='Login']")
		WebElement go;
		
		@FindBy(linkText="rediff.com")
		WebElement homeBtn;
		
		
		//If yu dont specify return statement yu cannot give .sendkeys operation in RediffLogin class
		public WebElement emailId() {
			
			return login;
			
		}
		
		public WebElement password() {
			
			return pword;
		}
		
		public WebElement login() {
			
			return go;
		}
		
		public WebElement Home() {
			
			return homeBtn;
		}

}
