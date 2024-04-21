package WebDriver_Arch;

import ExceptionHandling.MyException;

public class AmazonTest {
	private static WebDriver driver;

	public static void main(String[] args) {
		
		//ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		//SafariDriver driver = new SafariDriver();
	//using top casting
		String browser = "firefox"; //user input/xml/excel from any source
		
		//cross browser logic -- with top casting --switch case or if else
		// init the driver only once
		//parallel run
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("Please pass the right browser....");
			MyException exception = new MyException("no browser found");
			throw exception; //throw custom exceptions
			//throw new MyException("no browser found"); //throw custom exceptions
			//break;
		}
		
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println("page title: "+title);
		
		if(title.equalsIgnoreCase("amazon")) {
			System.out.println("title is PASSED");
		}
		else {
			System.out.println("title is FAILED");
		}
		String url = driver.getUrl();
		System.out.println("url is : "+url);
		
		driver.findElement("logoogo");
		driver.sendkeys("username", "gg@gmail.com");
		driver.sendkeys("password", "abcd1234@");
		driver.click("loginbutton");
		driver.close();
		
	}



}
