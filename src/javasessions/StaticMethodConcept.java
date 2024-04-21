package javasessions;

public class StaticMethodConcept {
	
	public static String name;
	public int age;
	
	public static void getInfo() {
		System.out.println("get info");
	}
	
	public void sendEmail() {
		System.out.println("Send Email");
	}

	public static void main(String[] args) {
		StaticMethodConcept obj = new StaticMethodConcept();
		//calling static method and vars
		//1. by classname 
		//2. by obj reference with warning message -- not recommended
		obj.name="Tom";
		System.out.println(StaticMethodConcept.name);
		
		StaticMethodConcept.name = "Divya";
		System.out.println(StaticMethodConcept.name);
		StaticMethodConcept.getInfo();
		
		//to call non static method we have to create object
		obj.age=10;
		obj.sendEmail();
		System.out.println(obj.age);
		
		//3. Directly if within the class
		System.out.println(name);
		getInfo();

	}

}
