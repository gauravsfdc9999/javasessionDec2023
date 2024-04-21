package builderpattern;

public class EcommApplication {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	private String name;
	private String userName;
	
	public String getName() {
		return name;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	public void forgotPassword(String userName, String name) {
		if(this.userName.equalsIgnoreCase(userName)) {
			setName(name);
		}
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public EcommApplication login(String un, String pwd) {
		System.out.println("logged in with "+un +pwd);
//		return new EcommApplication();
		return this;
	}
	
	public EcommApplication login(String un, String pwd, String role) {
		System.out.println("logged in with "+un +pwd +role);
		return this;
	}
	
	public EcommApplication search(String productName) {
		System.out.println("search: "+productName);
		return this;
	}
	
	public EcommApplication search(String productName, String color) {
		System.out.println("search: "+productName+ " " +color);
		return this;
	}
	public EcommApplication search(String productName, String color, int price) {
		System.out.println("lsearch: "+productName+ " " +color+ " " +price);
		return this;
	}
	
	public EcommApplication addToCart(String productName) {
		System.out.println("add to cart:  "+productName);
		return this;
	}
	public EcommApplication makePayment(String upi) {
		System.out.println("making payment via upi: "+upi);
		return this;
	}
	public EcommApplication makePayment(String cc, String cvv) {
		System.out.println("making payment via cc: "+cc+" "+cvv);
		return this;
	}
	public EcommApplication getOrderID() {
		System.out.println("order is done... order ID is : "+12345);
		return this;
	}
	public void logout() {
		System.out.println("logged out");
	}
	

}
