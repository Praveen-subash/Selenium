import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffLoginPO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mypage.rediff.com/login/dologin");
		
		ObjectRepository_Login obj = new ObjectRepository_Login(driver);
		obj.emailId().sendKeys("ABC");
		obj.password().sendKeys("TEST");
		obj.login().click();
		obj.Home().click();
		
		ObjectRepository_Home obj1 = new ObjectRepository_Home(driver);
		obj1.search().sendKeys("India 2021");
		obj1.searchLink().click();
		
	}

}
