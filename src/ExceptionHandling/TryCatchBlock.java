package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

public class TryCatchBlock {
	
	String name;

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		//Compile time exception
		try {
			Thread.sleep(100);
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		
		try {
			FileInputStream file = new FileInputStream("/user/test.xml");
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		
		//Runtime exception
		try {
			TryCatchBlock obj = new TryCatchBlock();
			obj=null;
			obj.name="Gaurav";
			int i=9/0;
			System.out.println("Hello");
		}
		catch(ArithmeticException ex) {
			System.out.println("AE is coming..");
			ex.printStackTrace();
		}
		catch(NullPointerException ex) {
			//ex.printStackTrace();
			StringWriter sw = new StringWriter();
			ex.printStackTrace(new PrintWriter(sw));
			System.out.println(sw.toString());
		}
		
		
		System.out.println("BYe!!!");

		
	}

}
