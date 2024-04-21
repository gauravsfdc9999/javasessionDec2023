package OOP_Inheritance;

public class BMW extends Car{
	int maxSpeed=200;
	
	public void autoParking() {
		System.out.println("BMW--- auto parking");
	}
	
	//method overridding : polymorphism (run time - dynamic binding)
	//when you have a method in parent class and same methos is in child class
	//with same number of name
	//with same number of parameters, same type of parameters and same sequence of params
	//same return type
	//overridding of vars is not possible
	@Override
	public void start() {
		System.out.println("BMW--- auto start");
	}
	
	@Override
	public void billing() {
		System.out.println("BMW--- billing");
	}
}
