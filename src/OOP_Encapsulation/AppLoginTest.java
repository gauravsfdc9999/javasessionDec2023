package OOP_Encapsulation;

public class AppLoginTest {

	public static void main(String[] args) {
		loginPage lp = new loginPage("Gaurav", "gaurav@123");
		lp.doLogin(lp.getUserName(), lp.getPassword());
		lp.setPassword("upated@456");
		lp.doLogin(lp.getUserName(), lp.getPassword());
		
		//private constructor 
		//System class has private constructor		
		
	}

}
