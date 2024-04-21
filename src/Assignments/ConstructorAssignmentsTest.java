package Assignments;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ConstructorAssignmentsTest {

	public static void main(String[] args) {
		//person object
		Person p1=new Person("Gaurav", 41, 'M', 5.8);
		System.out.println(p1.name+" "+p1.age+" "+p1.gender+" "+p1.height);
		Person p2=new Person("Kuchbhi", 40, 'F', 5.3);
		System.out.println(p2.name+" "+p2.age+" "+p2.gender+" "+p2.height);
		
		//Assignment 2:
		Rectangle rect1=new Rectangle();
		System.out.println("Area of rectangle 1 = "+rect1.areaOfRectangle());
		Rectangle rect2=new Rectangle(10.0,10.0);
		System.out.println("Area of rectangle 2 = "+rect2.areaOfRectangle());
		
		//assignment 3:
		Employee e1=new Employee(90001, "Gaurav Gupta", 10000.00);
		System.out.println("Employee Info-->"+e1.getId()+" "+e1.getName()+" "+e1.getSalary());
		//increment salary by 10%
		//e1.setSalary(e1.getSalary());
//		double increment = 10/100f;
		//System.out.println(increment);
		double newSalary=e1.getSalary()+((10/100f)*e1.getSalary());
		//String s = String.format("%.2f", newSalary);
		//System.out.println(s);
		e1.setSalary(newSalary);
		System.out.println("Employee Info-->"+e1.getId()+" "+e1.getName()+" "+ String.format("%.2f", e1.getSalary()));
		
		//Assignment 4:
		Car c1 = new Car();
		System.out.println("C1-->car-->"+c1.getMake()+" "+c1.getModel()+" "+c1.getYear());
		Car c2 = new Car("BMW","Z1 Series",3030);
		System.out.println("C2-->car-->"+c2.getMake()+" "+c2.getModel()+" "+c2.getYear());
		
		//Assignment 5:
		BankAccount bk1 = new BankAccount("1000009", 10000.00);
		bk1.deposit(1000.00);
		System.out.println("Balance after deposit 1000 is-->"+bk1.getBalance());
		bk1.withdraw(1000.00);
		System.out.println("Balance after withdraw 1000 is-->"+bk1.getBalance());
	}

}
