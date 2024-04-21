package javasessions;

public class ConditinalStatements {

	public static void main(String[] args) {

		float x=20.1f;
		int y=20;
		//==,>=,<=,!= are conditional operators
		System.out.println(x>y);
		
		if(x>y) {
			System.out.println("X is greater than Y and Pass");
			}
		else {
			System.out.println("fail");
		}
		
		if(true) {
			System.out.println("Hi");
		}
		else {//Dead code
			System.out.println("bye");
		}
		
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("launch chrome browser");
		}
		else if(browser.equalsIgnoreCase("firefox")){
			System.out.println("launch firefox");
		}
		else if(browser.equalsIgnoreCase("edge")){
			System.out.println("launch firefox");
		}
		else if(browser.equalsIgnoreCase("safari")){
			System.out.println("launch firefox");
		}
		else{
			System.out.println("Please pass right browser...");
		}
		
		//above code will have slight performance issue so we can use switch case
		
	}

}
