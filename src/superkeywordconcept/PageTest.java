package superkeywordconcept;

public class PageTest {

	public static void main(String[] args) {
		HomePage hp = new HomePage(20);
		System.out.println(hp.getClass()+"-------");
		
		hp.calculateTimeOut();
		hp.PagePanel();
		
		//top casting
		WebPage wp = new HomePage();
		wp.PagePanel();
		
		Hospital h1= new Hospital();
		h1.treatment();
		
		
	}

}
