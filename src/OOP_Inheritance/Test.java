package OOP_Inheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW b= new BMW();
		b.start(); //overridden
		b.refuel();//inherited
		b.autoParking();//individual method
		b.stop(); //inherited
		b.billing();//inherited
		System.out.println("BMW Speed "+b.maxSpeed);
		
		//car object
		System.out.println("-------");
		Car c1=new Car();
		c1.billing();//inherited
		System.out.println("BMW Speed "+c1.maxSpeed);
		
		System.out.println("-------");
		Vehicle v1 = new Audi(); //top or up casting method is not accessible. its IS-A relationship
		v1.engine();
		v1.billing();
		//v1.autoParkings(); 
		Audi ad1 = new Audi();
		Vehicle v2 = new Vehicle();
		v2=ad1;
		System.out.println("-------");
		v2.billing();
		v2.engine();
		
		//run time exception 
		
		

	}

}
