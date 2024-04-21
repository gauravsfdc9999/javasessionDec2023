package OOPS_Abstractions;

public class LoginPage extends Page {
	
	//constructor
	public LoginPage() {
		System.out.println("LoginPage --- Constructor");
	}
	
	public LoginPage(int i) {
		System.out.println("LoginPage --- Constructor"+i);
	}

	@Override
	public void title() {
		System.out.println("loginpage --- title");		
	}

	@Override
	public void url() {
		System.out.println("loginpage --- url");
	}
	
	@Override
	public void pageLoadTime() {
		System.out.println("LoginPage -- loading time is 5 sec");
	}
	
	public void doLogin(String un, String pwd) {
		System.out.println("login with: "+un +" "+pwd);
	}
	


}
