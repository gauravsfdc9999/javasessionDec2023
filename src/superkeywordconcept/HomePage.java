package superkeywordconcept;

public class HomePage extends WebPage {

	public int speed = 50;
	
	public HomePage() {
		super(); //parent class const.. is called
		System.out.println("homePage --- default constructor");
	}
	
	public HomePage(int i) {
		super(i+10); //parent class const.. is called
		System.out.println("homePage --- constructor : "+i);
	}
	
	@Override
	public void calculateTimeOut() {
		super.calculateTimeOut();//calling parent class method
		System.out.println("HomePage -- calculateTimeOut");
		super.logo();
		System.out.println("parent class speed : "+super.speed); //direct parent, if not available then grand parent
		System.out.println("child class speed : "+this.speed);
		super.PagePanel();
	}
	
	//super:
	//is used to called parent class constructor but is has to be first statement, 
	// is used to access methods and variables
	//super and this cannot be used together
}
