package CollectionConcepts;

import java.util.HashMap;

import ExceptionHandling.MyException;

public class UserRole {

	public void doLogin(String un, String pwd) {
		System.out.println("User log in with : "+un+" and "+pwd);
	}
	
	public void doLogin(String role) {
		String creds = getUserCreds(role);
		String un = creds.split(":")[0].trim();
		String pwd = creds.split(":")[1].trim();
		doLogin(un,pwd);
	}
	
	private HashMap<String, String> getUserMap(){
		HashMap<String, String> userMap = new HashMap<>();
		userMap.put("admin", "admin:admin123");
		userMap.put("seller", "seller:seller@123");
		userMap.put("vendor", "vendor:vendor@234");
		userMap.put("partner", "partner:partner@12903");
		userMap.put("user", "gaurav:gaurav@345");
		return userMap;
	}
	
	private String getUserCreds(String role) {
		if(getUserMap().containsKey(role)) {
			return getUserMap().get(role);
		}
		else {
			throw new MyException("Role is not available");
		}
	}
	
	public static void main(String[] args) {
		//Amazon -- RBAC - role based access control
		String role = "admin";
		UserRole app = new UserRole();
//		String creds = app.getUserCreds(role);
//		System.out.println(creds);
//		String cred[] = creds.split(":");
//		String un = cred[0].trim();
//		String pwd = cred[1].trim();
//		
//		app.doLogin(un, pwd);
		app.doLogin(role);
		
		app.doLogin("someoneexternal", "some@1234");
		
	}

}
