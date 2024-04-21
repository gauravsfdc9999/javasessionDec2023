package ExceptionHandling;

public class AppTest {

	public static void main(String[] args) {
		String browser = "ie";
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("open chrome");
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.out.println("open firefox");
		}
		else if(browser.equalsIgnoreCase("safari")) {
			System.out.println("open chrome");
		}
		else {
			System.out.println("please pass right browser...");
			throw new MyException("Wrong browser is passed");
		}
		
		System.out.println("Launch url");
	}

}
