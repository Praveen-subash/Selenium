import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffLoginPageFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mypage.rediff.com/login/dologin");
		
		
		
		PageFactory_Login obj = new PageFactory_Login(driver);
		obj.emailId().sendKeys("ABC");
		obj.password().sendKeys("TEST");
		obj.login().click();
		obj.Home().click();
		
		PageFactory_Home obj1 = new PageFactory_Home(driver);
		obj1.search().sendKeys("India 2021");
		obj1.searchLink().click();
		
	}

}
