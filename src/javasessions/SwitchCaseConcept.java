package javasessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		//above code will have slight performance issue so we can use switch case
		String browser="Chrome";
		String version = "112.90";
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome browser");
			 if(version.equalsIgnoreCase("112.90")) {
				 System.out.println("launch chrome browser version 112.90");
			 }
			break;
		case "firefox": 
			System.out.println("launch firefox browser");
			break;
		case "edge": 
			System.out.println("launch edge browser");
			break;
		case "safari": 
			System.out.println("launch safari browser");
			break;
		default:
			System.out.println("Please pass the right browser...");
			break;
		}
	}

}
