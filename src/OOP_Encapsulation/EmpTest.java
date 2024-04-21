package OOP_Encapsulation;

public class EmpTest {

	public static void main(String[] args) {
//		Employee e1 = new Employee();
		//e1.name="Gaurav"; //only public access modifier can be accessed
//		e1.setName("Gaurav");
//		e1.setAge(41);
//		e1.setSalary(1000);
//		e1.setActive(true);
		
		
		Employee e1=new Employee("Guarav",40,10000,true);
		//using getter setter updating the values
		e1.setAge(41);
		e1.setSalary(30000);
		e1.dob="01-01-1983";
		
		
		System.out.println("------");
		System.out.println("Employee -> "+e1.getName()+" "+e1.getAge()+" "+e1.getSalary()+" "+e1.isActive()+" "+e1.dob);
		
		Employee e2=new Employee("Shiva",30);
		System.out.println("Employee -> "+e2.getName()+" "+e2.getAge()+" "+e2.getSalary()+" "+e2.isActive()+" "+e2.dob);
		e2.setSalary(10000);
		e2.dob="02-02-1983";
		e2.setActive(true);
		System.out.println("Employee -> "+e2.getName()+" "+e2.getAge()+" "+e2.getSalary()+" "+e2.isActive()+" "+e2.dob);
		
		//launch browser
		Browser br = new Browser();
		br.launchBrowser();
		
	}

}
