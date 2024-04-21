package builderpattern;

//called class
public class AppTest {
	
	//caller method/user
	public static void main(String[] args) {
		EcommApplication app = new EcommApplication();
		app.login("gaurav", "Gaurav123")
				.logout();
		
		app.login("Vijay", "vijay123")
			.search("Tshirt", "Blue")
				.addToCart("Tshirt")
					.makePayment("vijay@hdfc.com")
						.getOrderID()
							.logout();
		
		EcommApplication app1 = new EcommApplication();
		app1.setUserName("Gaurav");
		app1.forgotPassword("Gaurav", "gaurav@123");
		System.out.println(app1.getName());
	}

}
