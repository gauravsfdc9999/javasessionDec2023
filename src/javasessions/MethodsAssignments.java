package javasessions;

public class MethodsAssignments {

	// Write a program to print the addition/subtraction/division/multiplication of
	// two numbers entered by user by defining your own method
	public class calculationNumber {
		public int addition(int num1, int num2) {
			return num1 + num2;
		}

		public int subtraction(int num1, int num2) {
			int subtraction = 0;
			if (num1 > num2) {
				subtraction = num1 - num2;
			} else {
				subtraction = num2 - num1;
			}
			return subtraction;
		}

		public int division(int num1, int num2) {
//			if (num1!=0 & num2 != 0)
			if(num2 != 0)
			{
				return num1/num2;
			}
//			else if(num1!=0 & num2==0) {
//				System.out.println("Divison by 0 not possible");
//				return -1;
//			}
			else {
				System.out.println("Number are not divisible");
				return -1;
			}

		}

		public int multiplication(int num1, int num2) {
			return num1*num2;
		}
		//Define a method that returns the product of two double numbers entered by user.
		public double multiplication(double num1, double num2) {
			return num1*num2;
		}
	}
	
	//3.Write a program to print the circumference and area of a circle of radius entered by user by defining
	public static final double VALUE_OF_PIE = 3.14;
	public double circumference(int radius) {
		
		double circumference = 2*VALUE_OF_PIE*radius;
		return circumference;
		
	}
	
	public double areaOfCircle(int radius) {
		double area = VALUE_OF_PIE*radius*radius;
		return area;
	}
	
	//4. Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
	public int maximumNumber(int i,int j, int k) {
		if(i>j && i>k) {
			return i;

		}
		else if (j>i && j>k) {
			return j;
		}
		else {
			return k;
		}
	}
	
	public int minimumNumber(int i,int j, int k) {
		if(i<j && i<k) {
			return i;

		}
		else if (j<i && j<k) {
			return j;
		}
		else {
			return k;
		}
	}
	
	//Def﻿ine a program to find out whether a given number is even or odd - return true/false
	
	public boolean numberOddEven(int num) {
		if(num%2==0) {
			System.out.println("number is even-->"+num);
			return true;
		}
		else {
			System.out.println("Number is odd-->"+num);
			return false;
		}
	}
	
	//Define a method to find out if he/she is eligible to﻿ vote. - return true/false
	public boolean isEligibleToVote(int age) {
		if(age>=18) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String grades(int marks) {
		String grades;
		if(marks>=91 && marks<=100) {
			grades="AA";
			return grades;
		}
		else if(marks>=81 && marks<=90){
			grades="AB";
			return grades;
			
		}
		else if(marks>=71 && marks<=80) {
			grades="BB";
			
		}
		else if(marks>=61 && marks<=70) {
			grades="BC";
			
		}
		else if(marks>=51 && marks<=60) {
			grades="CD";
			
		}
		else if(marks>=41 && marks<=50) {
			grades="DD";
			
		}
		else {
			grades="Fail";
			
		}
		return grades;
	}
	
	public int factorial(int number) {
		int num=1;
		if(number==1 || number==0) {
			return num;
		}
		else {
			return (number*factorial(number-1));
		}
	}

	public static void main(String[] args) {
		MethodsAssignments obj = new MethodsAssignments(); // outer class object
		MethodsAssignments.calculationNumber obj1 = obj.new calculationNumber(); // inner class object
		int addition = obj1.addition(10, 10);
		System.out.println(addition);
		int substraction = obj1.subtraction(10,5);
		System.out.println(substraction);
		System.out.println("Divison of numbers: "+obj1.division(1,0));
		System.out.println("Multiplication of numbers: "+obj1.multiplication(2, 3));
		System.out.println("Multiplication of double numbers: "+obj1.multiplication(2.0, 3.6));
		System.out.println("Circumference of circle :-->"+obj.circumference(10));
		System.out.println("Area of circle :-->"+obj.areaOfCircle(10));
		System.out.println("Maximum number :-->"+obj.maximumNumber(10,18,19));
		System.out.println("Maximum number :-->"+obj.minimumNumber(10,18,19));
		System.out.println("Number is even or odd-->"+obj.numberOddEven(9));
		System.out.println("Eligible to vote-->"+obj.isEligibleToVote(17));
		System.out.println("Grades are-->"+obj.grades(91));
		System.out.println("Factorial of number-->"+obj.factorial(8));

	}

}
