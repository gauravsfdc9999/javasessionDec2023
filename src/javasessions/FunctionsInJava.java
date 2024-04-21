package javasessions;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsInJava {
	//cannot create a func/method inside a function
	//functions are parallel to each other
	//but can call a fun from another func
	//NS functions -- data member of class can be called by obj
	//1st: function no input and no reurn
	//input: no input
	//return : void -- can not return anything
	public void test() {
		System.out.println("test method");
	}
	//2nd: function some input and no return
	//return type: void
	public void getBill(int days) { //1 parameter
		System.out.println("getting billing info");
		int finalAmount = days*100;
		System.out.println(finalAmount);
		return; //allowed
	}
	
	//3rd type: function with some input and return
	public int sum(int a, int b) {//2 param function
		System.out.println("adding two number");
		int s =a+b;
		return s;
	}
	
	//4th function: no input and some return:
	public String getinfo() {
		System.out.println("getting information");
		String s = "Hello App";
		return s;
	}
	
	public void printName() {
		System.out.println("Gaurav Gupta");
		return; //blank return --- void
	}
	
	public String [] getDevices() { //non-primitive data type
		System.out.println("getting devices");
		String [] devices = {"Mackbook pro","iPad","iPhone4"};
		return devices;
	}
	
	public ArrayList<String> getuserList() {
		System.out.println("getting all users");
		ArrayList<String> userList = new ArrayList<String>();
		userList.add("gaurav1");
		userList.add("gaurav2");
		userList.add("gaurav3");
		return userList;
	}
	
	public Object[] calculateNumbers(int marks, float extramarks, short discMarks) {
		float finalMarks = marks+extramarks - discMarks;
		String school = "IBM";
		boolean flag = true;
		Object [] finalInfo = {school, finalMarks, flag};
		return finalInfo;
	}
	
	//home work 8thJan switch case and return
	public int getMarks(String studentName) {
		int marks = -1;
		switch (studentName.trim().toLowerCase()) {
		case "devika":
			marks = 90;
			break;
		case "ravi":
			marks = 96;
			break;
		case "gaurav":
			marks = 99;
			break;

		default:
			//marks=-1;
			System.out.println("Student name not found.. plz pass the correct name "+studentName);
			break;
		}
		return marks;
	}
	
	
	public static void main(String[] args) {
		//call a function: create a object for non-static
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		
		//static int i=10; //local variable cannot be static 
		
		obj.getBill(10); //calling fucntion by passing value: call by value -10: value/argument
		obj.getBill(20);
		//System.out.println("sum: "+obj.sum(2, 3));
		int s = obj.sum(10, 20);
		System.out.println(s);
		
		String str = obj.getinfo();
		System.out.println(str);
		
		String myDevices = Arrays.toString(obj.getDevices());
		//System.out.println(Arrays.toString(myDevices));
		System.out.println(myDevices);
		
		ArrayList<String> myList = obj.getuserList();
		System.out.println(myList);
		System.out.println(myList.size());
		myList.add("Anshu");
		System.out.println(myList);
		
		Object[] myInfo = obj.calculateNumbers(70, 10.87f, (short) 5);
		System.out.println(Arrays.toString(myInfo));
		System.out.println(myInfo[1] +"%");
		
		String studentName = "Devika ";
		int studentMarks = obj.getMarks(studentName);
		if (studentMarks==-1) {
			System.out.println("Please donot print the marksheet: "+studentName);
		}
		else {
			System.out.println("Marks for : " +studentName +" is: "+studentMarks);
			System.out.println("Print the markseet for : " +studentName);
		}
		
		
	}

}
