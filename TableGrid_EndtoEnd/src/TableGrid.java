import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Setup\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/23907/ben-vs-odsa-2nd-quarter-final-ranji-trophy-2019-20");
		
		//Limiting the webdriver scope to innings 1
		WebElement table = driver.findElement(By.cssSelector("div#innings_1 div.cb-col.cb-col-100.cb-ltst-wgt-hdr:nth-child(1)"));
		System.out.println(driver.findElements(By.cssSelector("div#innings_1 div.cb-col.cb-col-100.cb-ltst-wgt-hdr:nth-child(1)")).size());
		
		//In the row, selected the 3rd column and get the text using iterations
		int rowCount = table.findElements(By.cssSelector("div.cb-col.cb-col-100.cb-scrd-itms div:nth-child(3)")).size();
		int sum = 0;
		for(int i=0;i<rowCount-2;i++) {
			
			String s = table.findElements(By.cssSelector("div.cb-col.cb-col-100.cb-scrd-itms div:nth-child(3)")).get(i).getText();
			
			//Convert into integer
			int val = Integer.parseInt(s);
			sum = sum + val;
			
		}
		
		System.out.println("The sum of the runs "+sum);
		
		//Get the extras and add it with the runs
		//String extras = table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		String extras = table.findElement(By.cssSelector("//div[text()='Extras']/following-sibling::div")).getText();
		int cnvExtras = Integer.parseInt(extras);
		System.out.println("The extras score is "+cnvExtras);
		
		sum = sum + cnvExtras;
		System.out.println("The sum of runs and extras is "+sum);
		
		//Get the total
		String total = table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int cnvTotal = Integer.parseInt(total);
		System.out.println("The Total score is "+cnvTotal);
		
		//Validate whether total is same
		if(sum==cnvTotal) {
			System.out.println("The sum of runs and extras are same as that of totals");
		}
		else {
			System.out.println("The sum of runs and extras are NOT same as that of totals");
			
		}
		


	}

}
