package javasessions;

import java.lang.reflect.Method;

public class MethodOverloading {

	public static void main(String[] args) {
		System.out.println("hiiii");
		MethodOverloading.main(10);
		MethodOverloading.main(10, "Gauravgg");
		MethodOverloading.main("Gauravg", "Anshug");
	}
	
	public static void main(int i) {
		System.out.println("Hello "+i);

	}
	
	public static void main(int i, String s) {
		System.out.println("Hello "+i +s);

	}
	
	public static void main(String i, String s) {
		System.out.println("gaurav "+i +s);

	}

}
