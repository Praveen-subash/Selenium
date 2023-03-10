'CREATE DRIVER OBJECT FOR CHROME BROWSER
System.setProperty("webdriver.chrome.driver", "D:\\Development_Avecto\\chromedriver.exe");
System.setProperty("webdriver.gecko.driver", "D:\\Development_Avecto\\geckodriver.exe");
System.setProperty("webdriver.edge.driver", "D:\\Development_Avecto\\msedgedriver.exe");

'CREATE A CLASS FOR CHROME DRIVER
WebDriver driver = new ChromeDriver(); 
WebDriver driver= new FirefoxDriver();
WebDriver driver= new EdgeDriver();

'USING WEBDRIVER MANAGER
ChromeOptions ch = new ChromeOptions();
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver(ch);

'WITH 4.6.0
There is no need of System.setProperty from 4.6.0. The below code is enough

WebDriver driver = new ChromeDriver();
WebDriver driver = new FirefoxDriver();
WebDriver driver = new EdgeDriver();
driver.get("http://google.com");
System.out.println(driver.getTitle());

'TO REACH THE URL
driver.get("http:'yahoo.com"); 
driver.navigate().to("http:'yahoo.com");   //driver.get waits for the url to load while driver.navigate does not.

'TO GET THE PAGE TITLE
System.out.println(driver.getTitle()); 

'TO GET THE CURRENT URL
System.out.println(driver.getCurrentUrl()); 

'TO GET THE PAGE SOURCE
System.out.println(driver.getPageSource()); 

'TO NAVIGATE TO THE PREVIOUS PAGE
driver.navigate().back(); 

'TO NAVIGATE TO THE NEXT PAGE
driver.navigate().forward(); 

'TO REFRESH A PAGE
driver.navigate().refresh();

'CLOSES THE CURRENT BROWSER
driver.close(); 

'CLOSES ALL THE OPENED BROWSERS - NOT WORKING
driver.quit(); 

'LOCATOR USING NAME
driver.findElement(By.name("pass")).sendKeys("abc");

'LOCATOR USING LINKTEXT
driver.findElement(By.linkText("Forgotten account?")).click();

'LOCATOR USING XPATH
driver.findElement(By.xpath("'*[@id=\'email\']")).sendKeys("Hello_XPath");

'LOCATOR USING CSS
driver.findElement(By.cssSelector("#email")).sendKeys("Hello_CSSSelector");

'LOCATORS WITH ID
driver.findElement(By.id("username")).sendKeys("Hello_ID");

'TO RETRIEVE THE TEXT, GETTEXT IS USED
System.out.println(driver.findElement(By.xpath("'*[@id=\'error\']")).getText());

'CREATE A OBJECT OF CLASS SELECT FOR STATIC DROPDOWNS WHICH HAS CONSTANT VALUES
Select s = new Select(driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_Adult']")));

'TO SELECT THE STATIC DROPDOWN USING VALUE. This gets displayed in the DOM
s.selectByValue("3");

'TO SELECT THE STATIC DROPDOWN USING INDEX
s.selectByIndex(5);

'TO SELECT THE STATIC DROPDOWN USING VISIBLE TEXT ON SCREEN
s.selectByVisibleText("7");

'DESEELECT VALUES
s.deselectByValue("3");
s.deselectByIndex(5);
s.deselectByVisibleText("7");

'LOOPS. YOU ARE SELECTING EVERYTHING AND GETTING THE TEXT
 while(a<5)
{	
	
	a++;			
	s.selectByIndex(b);		
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	b++;

}

 for(int j=0;j<5;j++)
{
	s.selectByIndex(c);	
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	c++;
}

'TO HANDLE DYNAMIC DROPDOWNS, USE INDEX. WITHOUT INDEX, SELENIUM GOES FROM LEFT TO RIGHT
driver.findElement(By.xpath("(//a[text()=' Bengaluru (BLR)'])[2]")).click();

'TO CLEAR THE CHARACTERS IN THE EDIT BOX
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).clear();

'WITHOUT USING INDEX, PARENT CHILD RELATIONSHIP IS DERIVED IN DYNAMIC DROPDOWNS (SEE NOTE BOOK) - INCLUDE A SPACE IN B/W
driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[text()=' Bhopal (BHO)']")).click();

'DEFINING A OBJECT FOR WEB ELEMENT
WebElement from = driver.findElement(By.id("fromCity"));

'KEYBOARD OPERATIONS
from.sendKeys(Keys.ARROW_DOWN);
from.sendKeys(Keys.ENTER);

'TO CLICK ON THE SPECIFIC RADIO BUTTON
driver.findElement(By.xpath("//input[@value='Milk']")).click();

'TO GET THE COUNT OF RADIO BUTTONS OF SAME TYPE - FIND ELEMENTS
int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
System.out.println(count);

'TO PRINT ALL THE VALUES IN RADIO BUTTONS
for(int a=0;a<count;a++)
{
	String t = driver.findElements(By.xpath("//input[@name='group1']")).get(a).getAttribute("value");
	driver.findElements(By.xpath("//input[@name='group1']")).get(a).click();
	System.out.println("The value printed is "+t);
}

'TO PRINT A SPECIFIC VALUE FROM RADIO BUTTON
for(int p=0;p<count;p++)
{
	String text = driver.findElements(By.xpath("//input[@name='group2']")).get(p).getAttribute("value");
	System.out.println("The value retreived is "+text);
	
	'Here text=="Beer" will not work.
	if(text.equals("Beer"))
	{
		driver.findElements(By.xpath("//input[@name='group2']")).get(p).click();   'IMPT THING IS THAT WE DONT HAVE TO GIVE INDEX IF WE GO THRO FOR LOOP SINCE GET ACTS AS A INDEX
		System.out.println("The value selected is "+text);
	}
}	

'TO HANDLE JAVA POP UPS - ACCEPT IS USED FOR YES OK AGREE DONE ETC
driver.switchTo().alert().accept();

'TO GET TEXT OF JAVA POP UPS
driver.switchTo().alert().getText();

'TO ENTER VALUES IN JAVA POPUPS
driver.switchTo().alert().sendKeys("ABC");

'TO CANCEL THE JAVA POP UPS
driver.switchTo().alert().dismiss();

'TO SELECT A PARTICULAR CHECKBOX
driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_friendsandfamily']")).click();
		
'TO RETURN THE STATUS OF THE CHECKBOX SELECTED
boolean s = driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_friendsandfamily']")).isSelected();
if (s==true)
{
	System.out.println("The value is selected. Return type is "+s);
}

'TO RETURN NO OF CHECKBOXES IN THE PAGE
int a = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
System.out.print("The no of checkboxes is "+a);
		
'TO RETREIVE THE CHECKBOX NAMES IN THE PAGE
for(int i=0;i<a;i++)
{
	 String text = driver.findElements(By.xpath("//label[contains(@for,'ctl00_mainContent_chk')]")).get(i).getText();
	 System.out.println("The checkbox name is "+text);
}

'ASSERT.ASSERTFALSE IS USED TO VALIDATE A PARTICULAR CONDITION. IF FALSE IS RETURNED, EXECUTION PROCEEDS
boolean s = driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_friendsandfamily']")).isSelected();
Assert.assertFalse(s);

'ASSERTEQUALS IS USED TO VALIDATE WHETHER THE EXPECTED VALUE AND ACTUAL VALUE ARE SAME. IF NOT, EXECUTION STOPS
String str = driver.findElement(By.xpath("//input[@name='ctl00_mainContent_ddl_originStation1_CTXT']")).getAttribute("value");
Assert.assertEquals("Departure City",str);

'THERE IS A UNIQUE CLASS NAME FOR CURRENT DATE. WE CAN CONCLUDE THAT THROUGH COLORED HIGHLIGHT ON CURRENT DATE
'. IS USED IN CSS IF CLASS NAME HAS SPACES
driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

'SIMILAR TO INSTR IN UFT. WE ARE CHECKING WHETHER A PARTICULAR STRING IS AVAILABLE INSIDE A VALUE
if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
{
	Assert.assertTrue(true);
	System.out.println("The values is enabled");
}
else
{
	System.out.println("The values is not enabled");
	Assert.assertTrue(true);
}

'AUTO ALIGNMENT OF CODE
Press Ctrl+Shift+F

'FOR MAXIMIZING A WINDOW
driver.manage().window().maximize();

'FOR DELETING ALL COOKIES
driver.manage().deleteAllCookies();

'DELETE A PARTICULAR COOKIES OR SESSION ID*****
driver.manage().deleteCookieNamed("sessionkey");


'THERE IS NO SEPERATE COMMAND FOR MINIMIZING. HENCE CREATE A CLASS DIMENSION AND SET THE WIDTH AND HEIGHT
Dimension d = new Dimension(500,600);
driver.manage().window().setSize(d);

'STEP BY STEP DEBUG
F6  'Similar to F11 in UFT

'CONTINIOUS RUN TILL BREAEKPOINT
F8   'Similar to F5 in UFT

'TO STEP INTO ANOTHER METHODS
F5

'IF IT IS A SINGLE WEBELEMENT, THEN USE THE SYNTAX 
WebElement prod = driver.findElement(By.cssSelector(".product-name"));  '-If there are multiple product names, using this will take only first product
'IF THERE ARE MANY ELEMENTS, USE THE SYNTAX 
List<WebElement> prod = driver.findElements(By.cssSelector(".product-name"));
'FOR GETTING COUNT
int count = driver.findElements(By.tagName("a")).size();

'SYNTAX FOR DECLARING ARRAY
String[] items = {"Text","Text","Text"};

'CONVERTING ARRAY TO A ARRAY LIST
List listname = Arrays.asList(arrayname);
'Example : List array_List = Arrays.asList(items);

'FOR ARRAY LIST, SEARCH THE FETCHED VALUE INSIDE ARRAY LIST. FOR NON ARRAYS, SEARCH THE REQUIRED STRING FROM THE FETCHED VALUE
ArrayList : if(array_List.contains(fetched_value))      'ex if(prod.contains(str_Val))  -> prod is the array list. str_Val is the fetched value
Standard : if(fetched_value.contains(String)) 'ex if(str_Val.contains("Potato"))

'TO FIND THE LENGTH OF THE ARRAY
array.length

'TO FIND SIZE OF ARRAY LIST
arraylist.size

'NOTE
array list has only contains and not equals

'SPLIT AND TRIM FUNCTIONS
.Split(delimiter);
.Trim();

'ALWAYS, SPLIT FUNCTION FORMS AS ARRAYS. THEREFORE,
String[] name = driver.getAttribute.Split("-");
String value = name[0].trim();

'WHEN YOU USE BOTH SPLIT AND TRIM IN THE SAME STATEMENT
split("-")[0].toString().trim()

'IMPLICIT WAIT
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);	 //This is deprecated from Selenium 4
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //So this is used as a alternate

'EXPLICIT WAIT
WebDriverWait w = new WebDriverWait(driver,10);   //driver,10 is deprecated
w.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("span.promoInfo"), "Code applied ..!"));

WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10)); //So this line is used as alternate
w.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("span.promoInfo"), "Code applied ..!"));

'FLUENT WAIT - WAITS FOR A CONDITION AND FREQUENCY WITH WHICH WE WANT TO CHECK THE CONDITION

Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)  'Fluent wait declaration
			.withTimeout(Duration.ofSeconds(30)) 'total duration of wait
			.pollingEvery(Duration.ofSeconds(5)) 'checks for the element at the give time interval
			.ignoring(NoSuchElementException.class); 'ignores NoSuchElementException in the given time
			
	WebElement w = wait.until(new Function<WebDriver,WebElement>(){  'customised wait condition
	
		public WebElement apply(WebDriver driver) {
			if(driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed())
			{
				return driver.findElement(By.cssSelector("[id='finish'] h4"));					
			}
			else
				return null;
		}
    });

'HOVER ACTION USING MOUSE
Actions mouse_Move = new Actions(driver);
mouse_Move.moveToElement(driver.findElement(By.cssSelector("a#nav-link-accountList"))).build().perform();

'OTHER MOUSE ACTIONS
mouse_Move.moveToElement(driver.findElement(By.cssSelector("input#twotabsearchtextbox")))
	
			 .click()  'Click
			 .keyDown(Keys.SHIFT) 'Hold Shift Key
			 .sendKeys("Hello") 'SendKeys
			 .keyUp(Keys.SHIFT) 'Release Shift Key
			 .doubleClick() 'Double click
			 .contextClick() 'Right click 
			 .build().perform();

'MOUSE OPERATIONS EXPLAINED

•	click() method
click() – Clicks on the current mouse position
click(WebElement web_element) – Clicks in the middle of the given WebElement which is passed to the method

•	doubleClick() method
doubleClick() – Double clicks on the current mouse position
doubleClick(WebElement web_element) – Double clicks in the middle of the given WebElement which is passed to the method

•	contextClick() method
contextClick() – Performs a context click operation on the current mouse position
contextClick(WebElement web_element) – Performs a context click operation at the middle of the WebElement which is passed to the method

•	clickAndHold() method
clickAndHold() – Clicks without releasing on the current mouse position
clickAndHold(WebElement web_element) – Clicks without releasing in the middle of the WebElement which is passed to the method

•	dragAndDrop() method
dragAndDrop(WebElement source_elem, WebElement target_elem) – Perform a click and hold operation in the middle of the source element (i.e. source_elem), moves to the location of the target element (i.e. target_elem), and release the mouse. 
On the successful execution of this method, the source element is dragged and dropped at the place where the target element is located

•	dragAndDropBy() method
dragAndDropBy(WebElement elem_source, int x_Offset, int y_Offset) – Perform a click and hold operation in the middle of the source element (i.e. source_elem) and move by a given offset available as x_Offset and y_Offset

•	moveToElement() method
moveToElement(WebElement elem_target) – Move the mouse to the middle of the element (i.e. elem_target) which is passed to the method
moveToElement(WebElement target, int x_Offset, int y_Offset) – Move to an offset (x_Offset and y_Offset) from the WebElement’s in center viewpoint

•	moveByOffset() method
moveByOffset(int x_Offset, int y_Offset) – Move the mouse from the current position by the offset which is passed to the method

•	release() method - This is for mouse button
release() – Release the depressed left mouse button which is pressed at the current mouse position
release(WebElement elem_target) – Release the depressed left mouse button which is pressed in the middle of the given WebElement (i.e. elem_target)
click(), doubleClick(), contextClick(), moveToElement(), and release() are overloaded methods in the Action Class and the actions performed depends on the parameters passed to the methods.

•	keyDown() method
keyDown(Keys.SHIFT) - This hold the SHIFT key

•	keyUp() method
keyUp(Keys.SHIFT) - This releases the SHIFT key
			 
'GETTING X, Y CO ORDINATES
		
Point p = driver.findElement(By.cssSelector("input#twotabsearchtextbox")).getLocation();

int x = p.getX();
int y = p.getY();

System.out.println("X co-ordinate is "+p.getX()+" Y co-ordinate is "+p.getY());
		
'USING X,Y CO ORDINATES FOR MOUSE ACTIONS
		
mouse_Move.moveByOffset(266,11).click().sendKeys("NewTest").build().perform();

'DRAG AND DROP USING MOUSE

Actions mouse_Move = new Actions(driver);
mouse_Move.dragAndDrop(Source locator,Destination locator).build().perform();
'Example : mouse_Move.dragAndDrop(driver.findElement(By.xpath("//*[@id='credit2']/a")), driver.findElement(By.xpath("//*[@id='bank']/li"))).build().perform();

'HANDLING CHILD WINDOWS

'Get all the window handles

Set<String> handles = driver.getWindowHandles();

'Iterate using Java concept		
Iterator<String>iter =  handles.iterator();
String parent_id = iter.next();  'The first .next brings to parent window
System.out.println("The parent window name is "+parent_id+" and the URL is "+driver.getTitle());

'The second .next brings to child window
String child_id = iter.next();		
System.out.println("SWITCHING TO CHILD WINDOW");
driver.switchTo().window(child_id);  'Only if switchTo is used, control gets transferred to Child Window
System.out.println("The child window name is "+child_id+" and the URL is "+driver.getTitle());

'For switching back to parent window, use defaultcontent or window(parentid)
System.out.println("SWITCHING BACK TO PARENT WINDOW");
driver.switchTo().window(parent_id);
System.out.println("The parent window name is "+parent_id+" and the URL is "+driver.getTitle());

'OPEN A NEW TAB AND GET THE URL  // This transfer the control to newly opened tab
driver.switchTo().newWindow(WindowType.TAB).get("https://www.google.com/");

'OPEN A NEW WINDOW AND GET THE URL // This transfer the control to newly opened window
driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.google.com/");

'FOR LOOP TO GET ALL CHILD WINDOW ID's

'APPROACH 1
Set<String> handles = driver.getWindowHandles();
for(String h1 : handles)
{

	driver.switchTo().window(h1);
	System.out.println("The handle name is "+ite);
}

'APPROACH 2
Set<String> handles = driver.getWindowHandles();	
Iterator<String> iter =  handles.iterator();
while(iter.hasNext()) {
			
	String windowName = iter.next();
	driver.switchTo().window(windowName);
	System.out.println("The title name is "+driver.getTitle());
			
			
}

//The first .next() comes to parent window

'TO GET THE CURRENT HANDLE ID
String str_CurrentHandle = driver.getWindowHandle();
System.out.println(str_CurrentHandle);

'SWITCH TO FRAMES
driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame"))); 'Can give name or id or index or webelement. Frame index starts with 0
driver.switchTo().frame(index_val);
driver.switchTo().frame("name or id");


'SWITCH TO DEFAULT CONTENT
driver.switchTo().parentFrame();
driver.switchTo().defaultContent();

'TO GET THE COUNT OF FRAMES
int count = driver.findElements(By.tagName("iframe")).size();
System.out.println("No of frames "+count);

'COUNT THE NO OF LINKS IN THE PAGE
int count = driver.findElements(By.tagName("a")).size();
System.out.println("No of links is "+count);
		

'APPROACH 1 - RAHUL SHETTY
		
'PRINT THE NO OF LINKS IN FOOTER SECTION
WebElement footerDriver = driver.findElement(By.xpath("//div[@id='gf-BIG']"));	'Assign a driver element for footer section by limiting the webdriver scope	
int footerLinks = footerDriver.findElements(By.tagName("a")).size();  'Then, count the links
System.out.println("Footer Links "+footerLinks);

'PRINT THE NO OF LINKS IN A CERTAIN COLUMN IN THE FOOTER SECTION
		
WebElement footerColDriver = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]"));  'Assign a driver element for particular column in footer section
int footerColLinks = footerColDriver.findElements(By.tagName("a")).size();  'Then count the links
System.out.println("Footer Column Links - APPROACH 1 "+footerColLinks);

for(int t=1;t<footerColLinks;t++) {
	
	System.out.println(footerColDriver.findElements(By.tagName("a")).get(t).getText());		
									
	
}

'APPROACH 2 - OWN APPROACH
'PRINT THE NUMBER OF LINKS IN THE CERTAIN COLUMN IN FOOTER SECTION
int size = driver.findElements(By.xpath("//div[@id='gf-BIG'] //td[1] //a")).size();
System.out.println("Footer Column Links using APPROACH 2 is "+size);

for(int i=1;i<size;i++) {
	
	System.out.println(driver.findElements(By.xpath("//div[@id='gf-BIG'] //td[1] //a")).get(i).getText());
	
	Actions m = new Actions(driver);
	m.moveToElement(driver.findElements(By.xpath("//div[@id='gf-BIG'] //td[1] //a")).get(i))
						  .keyDown(Keys.CONTROL)
						  .click()
						  .build().perform();
	
	
}

'SYNTAX FOR SEQUENCE OF KEYBOARD OPERATIONS
'Here, hover is not needed
for(int t=1;t<footerColLinks;t++) {
			
	System.out.println(footerColDriver.findElements(By.tagName("a")).get(t).getText());		
	
	'For sequencce of keyboard operations, use Keys.chord
	
	String clickonKeys = Keys.chord(Keys.CONTROL,Keys.ENTER);
	footerColDriver.findElements(By.tagName("a")).get(t).sendKeys(clickonKeys);
                                            
			
}

'FOR GETTING TITLE OF VARIOUS OPENED TABS
Set<String> handles = driver.getWindowHandles();	
Iterator<String>iter =  handles.iterator();
while(iter.hasNext()) {
			
	String windowName = iter.next();
	driver.switchTo().window(windowName);
	System.out.println("The title name is "+driver.getTitle());
			
			
}

'FOR CALENDARS - Use while! to reverse the result so that next can be clicked until desired month is obtained.
'While loop gets executed until condition returns true
while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
{
	driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
}

'TABLE GRID
'Limiting the webdriver scope to innings 1
WebElement table = driver.findElement(By.cssSelector("div#innings_1 div.cb-col.cb-col-100.cb-ltst-wgt-hdr:nth-child(1)"));
System.out.println(driver.findElements(By.cssSelector("div#innings_1 div.cb-col.cb-col-100.cb-ltst-wgt-hdr:nth-child(1)")).size());

'In the row, selected the 3rd column and get the text using iterations
int rowCount = table.findElements(By.cssSelector("div.cb-col.cb-col-100.cb-scrd-itms div:nth-child(3)")).size();

for(int i=0;i<rowCount-2;i++) {
	
	String s = table.findElements(By.cssSelector("div.cb-col.cb-col-100.cb-scrd-itms div:nth-child(3)")).get(i).getText();
	
	'Convert into integer
	int val = Integer.parseInt(s);
	sum = sum + val;
	
}

'CONVERT STRING INTO INTEGER
int val = Integer.parseInt(s);

'JAVASCRIPT EXECUTOR FORHANDLING INVISIBLE ELEMENTS

'JS DOM can identify hidden DOM elements whereas selenium cannot identify hidden elements
'Using this method shifts to javascript API.
JavascriptExecutor js = (JavascriptExecutor)driver;
String str = "return document.getElementById(\"src\").value;";
String text = (String) js.executeScript(str);
System.out.println("Text retrieved after js  executor is "+text);

'OTHER JAVASCRIPT EXECUTOR ACTIONS

'add return if you are fetching something

•	To Click on a Button

js.executeScript("document.getElementById('enter element id').click();");
js.executeScript("arguments[0].click();", element);

•	To Type Text in a Text Box without using sendKeys() method

js.executeScript("document.getElementById('Email').value='SeleniumTesting.com';");

•	To Handle Checkbox by passing the value as true or false

js.executeScript("document.getElementById('enter element id').checked=false;");

•	To generate Alert Pop window in Selenium Webdriver

js.executeScript("alert('Welcome To Selenium Testing');");


•	To get the Height and Width of a web page

js.executeScript(“return window.innerHeight;”).toString();
js.executeScript(“return window.innerWidth;”).toString();

•	To click a hidden element in selenium using JavaScriptExecutor

js.executeScript("arguments[0].click();", element);

•	To fetch text from hidden element in selenium using JavaScriptExecutor

js.executeScript("return arguments[0].textContent;", element) - This is for innertext
js.executeScript("return document.getElementById('idVal').value;");

•	To scroll the page down for 500px

js.executeScript(“window.scrollBy(0,500)”);

•	To scroll the page up for 500px

js.executeScript(“window.scrollBy(0,-500)”);

•	To scroll the page vertically till the end

js.executeScript(“window.scrollBy(0,document.body.scrollHeight)”);

•	To add an element in DOM

js.executeScript("var btn=document.createElement('newButton');"
 
                     + "document.body.appendChild(btn);");

•	To scroll to a element until visible

js.executeScript("arguments[0].scrollIntoView();", Element);

•	To scroll a table down

js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000")


'DESIRED CAPABILITIES are deprectaed.

'//Desired capabilities is class which helps to customize the chrome browser
DesiredCapabilities ch=DesiredCapabilities.chrome();
//ch.acceptInsecureCerts(); 'Also done with this
ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

'POP UP HANDLING USING CHROME BROWSER
ChromeOptions options= new ChromeOptions();
options.setAcceptInsecureCerts(true);        'Accept insecure certifications
options.addExtensions(new File("C:\\Users\\sprav\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Extensions\\ndgimibanhlabgdgjcpbbndiehljcpfh\\4.6.0_0.crx"));  ' Start browser with extensions
options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking","enable-automation"));  'Block WINDOW pop ups and chrome is controlled by auto software option
options.addArguments("start-maximized");  'Open in maximized mode
options.addArguments("incognito");  'incognito
options.addArguments("disable-notifications");   'Redbus wants to show notifications
options.addArguments("disable-geolocation");  'redbus.com wants to know your location
options.addArguments("disable-media-stream");  'Temas wants to access your camera


WebDriver driver=new ChromeDriver(options); 'Pass the object

'OPEN A WEBSITE BY ALLOWING NOTIFCATIONS
// 0 - Default, 1 - Allow, 2 - Block
Map < String, Object > contentSettings = new HashMap < String, Object > ();
Map < String, Object > profile = new HashMap < String, Object > ();
Map < String, Object > prefs = new HashMap < String, Object > ();

contentSettings.put("notifications", 1);    contentSettings.put("geolocation", 1);    contentSettings.put("media_stream", 1);
profile.put("managed_default_content_settings", contentSettings);
prefs.put("profile", profile);

c.addArguments("disable-infobars");  ' Chrome is controlled by a auto controlled software


'Taking screenshot
File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src,new File("D:\\screenshot.png"));

'Get status code of a website
HttpURLConnection conn = (HttpURLConnection)new URL("https://rahulshettyacademy.com/brokenlink").openConnection();
 conn.setRequestMethod("HEAD");
conn.connect();
int r = conn.getResponseCode();

'SOFT ASSERT
SoftAssert sf = new SoftAssert();
sf.assertTrue(false);
sf.assertAll();   'GIVING THIS LINE AT THE END FAILS THE TEST WHEREAS IF NOT GIVEN IT WILL NOT THROW ANYE RROR

'//SYNTAX TO CREATE A NEW ARRAY LIST
ArrayList<String> a = new ArrayList<String>();

'TO ADD ITEMS TO ARRAY LIST
a.add("item1");

'TO COPY ITEMS TO A ARRAY LIST FROM EXISTING ARRAY LIST
ArrayList<String> copiedArrayList = new ArrayList<String>();

'Approach 1
for(int t=0;t<orgArrayList.size();t++) {
	
	copiedArrayList.add(orgArrayList.get(t));
	
}

'Approach 2
for(String rpt : orgArrayList) {
	
	copiedArrayList.add(rpt);
}

'SORTING THE ARRAY LIST
Collections.sort(copiedArrayList);

'SORTING THE ARRAY LIST IN DESCENDING ORDER (Descending can be done only after ascending)
Collections.reverse(copiedArrayList);

'PRINTING THE VALUES OF  ARRAY LIST
for(String cpt : copiedArrayList) {
	
	System.out.println("The array list is "+cpt);
}


'nth child in cssSelector
tr td:nth-child(2)

'Extent Reports
String path = System.getProperty("user.dir")+"\\reports\\index.html"; // gives tthe project apath
ExtentSparkReporter report = new ExtentSparkReporter(path);
report.config().setReportName("Extent Report");
report.config().setDocumentTitle("Automation Report");


ExtentReports rep = new ExtentReports();
rep.attachReporter(report);
rep.setSystemInfo("TesterName", "ABC");

ExtentTest test = new ExtentTest();
test = rep.createTest("Red bus login");
File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src,new File("D:\\screenshot.png"));

test.addScreenCaptureFromPath("D:\\screenshot.png");

'EXCEL Automation

Name	  Gender	Age
Ashutosh	F	    45
Shukla	    M	    36
Rajesh	    T	    48
Krishna	  Waste	    77
Pyara	 No gender	96


FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\data.xlsx");
		
//Step 1 : Create object for XSSFWOrkbook class and Load the sheet to the workbook
XSSFWorkbook workbook = new XSSFWorkbook(fis);

int sheets = workbook.getNumberOfSheets();

for(int i=0;i<sheets;i++) {
	
	//Get the sheet name
	String sheetName = workbook.getSheetName(i).toString();	
	
	if(sheetName.equalsIgnoreCase("Sheet2")) {
		
		//Step 2 : Get access to the sheet
		XSSFSheet sheet = workbook.getSheetAt(i);
		
		//Step 3 : Access to all the rows(Starts from 1st Row) SHEET IS A COLLECTION OF ROWS
		Iterator<Row> allRows = sheet.iterator();
		
		//This starts at the first row. Dont get confused seeing next
		//Step 4 : Get access to specific row from all rows
		Row firstRow = allRows.next();  
		
		//Step 5 : Get access to all cells of the row (From left to right) ROW IS A COLLECTION OF CELLS
		Iterator<Cell> ce = firstRow.cellIterator();
		
		int k=0;
		int column=0;
		while(ce.hasNext()) {
			
			//Printing the cell names of the desired row
			Cell value = ce.next();
			System.out.println(value.getStringCellValue());
			
			if(value.getStringCellValue().equalsIgnoreCase("Name")) {
				
				 //Desired column value
				column = k; //Index of the cell is returned in k. If desired cell is not there it gets incremented
				System.out.println("The column index is "+column);
				break;
			}
			
			k++;
			
		}
		
		
		//We are now going to each and every row in the specified column
		//What we did previously was traversing through the first row to get desired cell
		//No we are traversing to that column and getting the list of valuez
		while(allRows.hasNext()) {
			
			Row r = allRows.next();
			System.out.println(r.getCell(column).getStringCellValue());
			if(r.getCell(column).getStringCellValue().equalsIgnoreCase(studentName)) {
				 
				System.out.println("----------");
				Iterator<Cell> cv = r.cellIterator();
				
				
				//NOTE THIS TO CHECK WHETHER ITS STRING OR NUMERIC
				while(cv.hasNext()) {
					
					//If there's numeric values in excel use this
					Cell c = cv.next();
					
					if(c.getCellType()== CellType.STRING) {
						
						strList.add(c.getStringCellValue());
					}
					else if(c.getCellType()== CellType.NUMERIC) {
						
						
						strList.add(NumberToTextConverter.toText(c.getNumericCellValue()));
						
					}
					
				}
			}
			
		}
		
	}

	
}

'Page object Model

public class ObjectRepository_Login {

	
	WebDriver driver;

	public ObjectRepository_Login(WebDriver driver) {
		
		//this. always has local driver
		//RHS has argument driver
		this.driver = driver;
		
	}
	
	By login = By.name("id");
	
	public WebElement emailId() {
		
		return driver.findElement(login);
		
	}
	

}

'Page factory model

public class PageFactory_Login {

	
		WebDriver driver;
		
		public PageFactory_Login(WebDriver driver) {
			
			
			PageFactory.initElements(driver, this);
			
		}
		
		
		@FindBy(name="id")
		WebElement login;
		
		public WebElement emailId() {
			
			return login;
			
		}
		

}		 

'Regular code

public class RediffLoginPageFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mypage.rediff.com/login/dologin");
		
		ObjectRepository_Login obj = new ObjectRepository_Login(driver);
		obj.emailId().sendKeys("ABC");
		
		PageFactory_Login obj = new PageFactory_Login(driver);
		obj.emailId().sendKeys("ABC");
		
		
	}

}

'DB connection

String host = "localhost";
		String port = "3306";
		String dbName = "qadatabase";
		
		//Step 1 : Establish a JDBC connection 
		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qadatabase","root","root" ); 
		
		//Step 2 : Create statement object to send the queries
		Statement s = con.createStatement();
		
		//Step 3 : Send the query to database using execute query and store the results in the ResultSet object.
		ResultSet rs = s.executeQuery("select * from Employeeinfo");
		
		//If yu dont give .next, it will point to base
		//Step 5 : Extract data from the result set
		while(rs.next()) {
			
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("id"));
			System.out.println(rs.getString("location"));
			System.out.println(rs.getString("age"));
		}
		
//		SQL TABLE Name =  Employeeinfo DB name = qadatabase
		
//		Name id location age
//		Sam	 1	India	21
//		Ram	 2	India	22
//		Bam	 3	India	23
//		Tam	 4	India	24

