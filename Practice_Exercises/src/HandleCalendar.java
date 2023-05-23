import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleCalendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		
		driver.get("https://www.spicejet.com/");
		Thread.sleep(20000);
		driver.findElement(By.cssSelector("input#ctl00_mainContent_view_date1")).click();
		Thread.sleep(5000);
		int count = driver.findElements(By.cssSelector("div.ui-datepicker-title")).size();
		
		int flag=0;
		for(int i=0;i<count;i++) {		
			//To get the iteration number
			System.out.println(i);
			
			//This is mainly for first and last month. If the last month is to be selected, it will be there in the second iteration
			//So it will not go to the while loop.
			if(driver.findElements(By.cssSelector("span.ui-datepicker-month")).get(i).getText().contains("Oct")) {
				System.out.println("Target achieved at the starting or ending");
				flag =1;
			}	
			else
				
			{
				//Execute while loop until next button is disabled or Desired month is obtained
				while(!driver.findElements(By.cssSelector("span.ui-datepicker-month")).get(i).getText().contains("Oct")){
					
					if(driver.findElement(By.cssSelector("a.ui-datepicker-next.ui-corner-all")).getAttribute("class").contains("disabled")) {
						break; //After next is disabled
					}	
					else {
						driver.findElement(By.cssSelector("span.ui-icon.ui-icon-circle-triangle-e")).click();
					}	
					
				
					// Set the flag value to 1 to select the datess.
					if(driver.findElements(By.cssSelector("span.ui-datepicker-month")).get(i).getText().contains("Oct")) {
						System.out.println("Apr Month is displayed");
						flag =1;
						Thread.sleep(5000);
					}
							
				}	
		
					
			}
				
				
			// Here, we have to select the month based on index. If the month falls in first or second box, index is obtained through for loop
			int c = i+1;
			if(flag==1) {
				System.out.println("Target achieved");
				
				//Get all the dates from the desired box (first or second) based on the iteration
				int dtSize = driver.findElements(By.xpath("//div[contains(@class,'ui-datepicker-group')]["+c+"] //a[@class='ui-state-default']")).size();
				System.out.println(dtSize);
				
				for(int t=0;t<dtSize;t++) {
					String dtVal = driver.findElements(By.xpath("//div[contains(@class,'ui-datepicker-group')]["+c+"] //a[@class='ui-state-default']")).get(t).getText();
					System.out.println(dtVal);
					if(dtVal.equalsIgnoreCase("22")) {
						driver.findElements(By.xpath("//div[contains(@class,'ui-datepicker-group')]["+c+"] //a[@class='ui-state-default']")).get(t).click();
						break; //This break is to come out of the date
					}
				}
				break; //This break is to come out of whole iteration. If the value is available in first iteration itself, it comes out
						
		
			}
			
		}//For loop gets ended here
			
	
		
	}		
				
		}
			
		

		
		

	

