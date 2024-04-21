package ExceptionHandling;

public class Employee {
	//add to cart method
	public void m1()throws ArithmeticException {
		System.out.println("m1-- method");
		m2();
	}
	
	//amazon payment
	public void m2() throws ArithmeticException { //calling method has to handle the exception
		System.out.println("m2-- method");
		try {
			m3();
		}
		catch(ArithmeticException ex) {
			//ex.printStackTrace();
			System.out.println("AE is coming.. please try later "+ex.toString());
		}

	}
	
	//bank server --- method
	public void m3() throws ArithmeticException {
		System.out.println("m3-- method");
		int i=9/0;
	}

	public static void main(String[] args)  {
		Employee obj = new Employee();
		//try { // exceptions should not be handled in main/calling method
			obj.m1();
		//}
//		catch(ArithmeticException ex) {
//			ex.printStackTrace();
//		}
		
		
		System.out.println("Bye!!!");
	}

}
