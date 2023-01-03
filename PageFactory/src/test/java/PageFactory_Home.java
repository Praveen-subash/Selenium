import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactory_Home {

	
		WebDriver driver;
		
		//This is a constructor. Will not come inside main method.
		//WE are creating constructor bcos we dont know where it should execute in chorme or mozila. We are passing that
		//info from the other class
		public PageFactory_Home(WebDriver driver) {
			
			//this. always has local driver
			//RHS has argument driver
			PageFactory.initElements(driver, this);
			
		}
		
		
		
		@FindBy(id="srchword")
		WebElement searchBox;
		
		@FindBy(xpath="//input[@class='newsrchbtn']")
		WebElement searchBtn;
		
		//If yu dont specify return statement yu cannot give .sendkeys operation in RediffLogin class
		public WebElement search() {
			
			return searchBox;
			
		}
		
		public WebElement searchLink() {
			
			return searchBtn;
		}
		
		  

}
  