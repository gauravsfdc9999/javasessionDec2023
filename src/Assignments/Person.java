package Assignments;

public class Person {
	public String name;
	public int age;
	public char gender;
	public double height;
	
	//constructor
	public Person(String name, int age, char gender, double height) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}
	

	public Person() {
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void printInfo() {
		System.out.println("Person details are : "+name +" "+age+" "+gender);
	}
	
	
	

}
