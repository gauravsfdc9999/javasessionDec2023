package superkeywordconcept;

public class WebPage extends Page{
	
	public int speed = 10;
	
	public WebPage() {
		super(); // contructor of object class
		System.out.println("WebPage --- constructor");
	}
	
	public WebPage(int i) {
		System.out.println("WebPage ---- contructor : "+i);
	}
	
	public void calculateTimeOut() {
		System.out.println("Webpage -- calculateTimeOut 20");
	}
	
	public final void logo() {
		System.out.println("webpage --- logo");
	}

}
