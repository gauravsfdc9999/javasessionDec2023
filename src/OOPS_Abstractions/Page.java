package OOPS_Abstractions;

public abstract class Page {
	//we cannot create an object of abstract class
	//we can have abs.. methods and non-abs.. methods
	//it can have static method and final methods
	// abstract class can have non-abstract methods
	//0% to 100% abstraction can be achieved
	//abstract class can have constructor
	
	
	//constructor //parent default constructor is mandatory
	public Page() {
		this(20);
		System.out.println("Page -- constructor");
	}
	
	public Page(int i) {
		System.out.println("Page -- constructor"+i);
	}
	
	public abstract void title();
	public abstract void url();
	
	public void pageLoadTime() {
		System.out.println("page -- loading time is 20 sec");
	}
	
	public static void displayLogo() {
		System.out.println("page -- displayLogo");
	}
	
	public final void footer() {
		System.out.println("page -- footer");
	}
	
	
	

}
