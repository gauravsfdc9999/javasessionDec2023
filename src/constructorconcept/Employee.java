package constructorconcept;

public class Employee {
	//class vars or global vars
	String name;
	int age;
	double salary;
	boolean isActive;
	char gender;
	
	//constructor
	//default or 0 param
//	public Employee() {
//		System.out.println("emp default const.......");
//		
//	}
//	public Employee(int i) {//1 param
//		System.out.println(i);
//	}
//	public Employee(int i, String s) {//2 param
//		System.out.println(i+ " "+s);
//	}
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public Employee(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Employee(String name, int age, double salary, boolean isActive, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.isActive = isActive;
		this.gender = gender;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Gaurav",41);
		System.out.println(emp.name);
		System.out.println(emp.age);
		
		Employee e2 = new Employee("Preet", 36, 'F');
		System.out.println(e2.name+" "+e2.age+" "+e2.gender+" "+e2.salary+" "+e2.isActive);
		
		Employee e3 = new Employee("Shiv", 30, 12.66, true, 'm');
		System.out.println(e3.name+" "+e3.age+" "+e3.gender+" "+e3.salary+" "+e3.isActive);
	}



}
