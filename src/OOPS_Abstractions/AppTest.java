package OOPS_Abstractions;


public class AppTest {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage(10); //parent default constructor is mandatory
		lp.doLogin("admin", "admin");
		lp.url();
		lp.title();
		lp.pageLoadTime();
		lp.footer();
		Page.displayLogo();
		
		System.out.println("-----------");
		
		//top casting:
		//child class object can be referred by parent class reference vars..
		Page pg = new LoginPage();
		pg.url();
		pg.title();
		pg.pageLoadTime();
		pg.footer();
		Page.displayLogo();
		
		//down casting is NA
	}

}
