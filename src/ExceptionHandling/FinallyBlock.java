package ExceptionHandling;

import java.util.GregorianCalendar;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("hello");
		
		//if finally block (mandatory) is available then catch block can be removed so finally block will always be executed everytime
		try {
			int i =9/0;
		}
		catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("some exception is coming class FinallyBlock");
		}
		finally {
			System.out.println("i am in finally block"); // only not executed if system.exit(1) before as it shut down the JVM
		}
		
		//use case for finally block?
		//make the connection with DB:username/pwd
		//hit the sql : select * from Employee;
		//get the results from DB table (some exceptions)
		//use the results in script
		//use finally block to close the connection
		
		long start=new GregorianCalendar().getTimeInMillis();
		long startMemory=Runtime.getRuntime().freeMemory();
		System.gc();

		StringBuffer sb = new StringBuffer();
		//StringBuilder sb = new StringBuilder();
		for(int i = 0; i<10000000; i++){
			sb.append(":").append(i);
		}
		long end=new GregorianCalendar().getTimeInMillis();
		long endMemory=Runtime.getRuntime().freeMemory();
		long cpuUsed = Runtime.getRuntime().availableProcessors();
		System.out.println("Time Taken:"+(end-start));
		System.out.println("Memory used:"+(startMemory-endMemory));
		System.out.println("CPU core : "+cpuUsed);
	}

}
