package OOP_Encapsulation;

public class loginPage {
	private String userName;
	private String password;
	
	public loginPage(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void doLogin(String userName, String password) {
		if(validateUser(userName, password)) {
			System.out.println("username--->"+userName);
			System.out.println("password ---->"+password);
			System.out.println("user able to login..");
		}
	}
	
	private boolean validateUser(String userName,String password) {
		System.out.println("Checking user is valid or not....");
		if(userName.length()>0 && password.length()>0) {
			System.out.println("user is valid");
			return true;
		}
		else {
			System.out.println("user is not valid..");
			return false;
		}
		
	}
	
	
	

}
