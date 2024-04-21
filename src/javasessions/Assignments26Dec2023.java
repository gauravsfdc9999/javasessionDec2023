package javasessions;

public class Assignments26Dec2023 {

	public static void main(String[] args) {
		// Write a Java program to add two strings:
		String a = "Hello";
		String b = "Naveen K";
		String c;
		c = a.concat(" ").concat(b);
		System.out.println(c);
		System.out.println("Final output: " + a + " " + b);

		byte num1 = 74;
		byte num2 = 36;
		int sum1 = num1 + num2;
		System.out.println("Sum of num1 and num2:->" + sum1);

		int k1 = 50;
		int k2 = 3;
		int k3 = k1 / k2;
		System.out.println(k3);

		double num3 = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		System.out.println("Answer 4:-> " + num3);

		String a1 = "Hello Selenium";
		char b1 = 't';

		System.out.println("Answer 5:-> " + a1 + b1);

		int a2 = 100;
		int b2 = 200;
		int c2 = 3400;
		System.out.println("Answer 6 Your Total  amount is : \"" + (a2 + b2 + c2));

		// Print the ASCII value of the character 'h'.
		char h = 'h';
		System.out.println("ASCII Value of h answer 7:-> " + (byte) h);

		// Write a program to add 3 to the ASCII value of the character 'd' and print
		// the equivalent character.
		char char1 = 'd';
		int equivalentChar = char1 + 3;
		System.out.println("Answer 8 equivalent character--> " + (char) equivalentChar);

		// Write a program to find the square of the number 3.9.
		float sqNum = 3.9f;
		System.out.println("Answer 9 square of num--> " + (sqNum * sqNum));
		System.out.println("Answer 9 square of num using math.power function--> " + (Math.pow(sqNum, 2)));

		// Incremental/Decremental Operators:

		int i = 11;
		i = i++ + ++i; // 11+13
		System.out.println(i);

		int a3 = 11, b3 = 22, c3;
		c3 = a3 + b3 + a3++ + b3++ + ++a3 + ++b3; // 11+22+11+22+13+24
		System.out.println("a3=" + a3);
		System.out.println("b3=" + b3);
		System.out.println("c3=" + c3);

		int i1 = 1, j = 2, k = 3;
		int m = i1-- - j-- - k--; //1-2-3
		System.out.println("i1=" + i1);//0
		System.out.println("j=" + j);//1
		System.out.println("k=" + k);//2
		System.out.println("m=" + m);//-4
		
		 int a4=1, b4=2;
         System.out.println(--b4 - ++a4 + ++b4 - --a4);//1-2+2-1
         
//          int i2 = 11;
//          int j2 = --(i2++); // not allowed
         
			int m1 = 0, n = 0;
			int p = --m1 * --n * n-- * m1--; //-1*-1*-1*-1
			System.out.println(p);
			
			int a5 = 1;
			a5 = a5++ + ++a5 * --a5 - a5--;//1+3*2-2 BODMAS 
			System.out.println(a5);
			
			int ch1='A';
			System.out.println(ch1++);
			System.out.println(++ch1);
			
			//If-else and Switch-Case: 
			int num4=25, num5=78, num6=87,num7=97;
			if(num4>num5) {
				if(num4>num6) {
					if(num4>num7) {
						System.out.println("The greatest number is "+num4);
					}
				}

			}
			else if(num5>num6) {
				if(num5>num7) {
					System.out.println("The greatest number is " +num5);
				}
				
			}
			else if(num6>num7) {
				System.out.println("The greatest number is " +num6);
			}
			else {
				System.out.println("The greatest number is "+num7);
			}
			
			//Java program to test a number is positive or negative
			int num8=36;
			if(num8<0) {
				System.out.println("Number is negative :"+num8);
			}
			else if(num8==0) {
				System.out.println("Number is Zero :"+num8);
			}
			else {
				System.out.println("Number is positive :"+num8);
			}
			
			//check number is odd or even using If - Else
			if(num8%2==0) {
				System.out.println(num8 + " :-Number is even");
			}
			else {
				System.out.println(num8 + " :- is Odd");
			}
			
			//run your test cases in a specific environment like: QA, Stage, Dev, UAT, Prod using using Switch - Case
			String env1 = "QA";
			switch (env1.toLowerCase()) {
			case "qa":
				System.out.println("Testing in QA environment");
				break;
			case "stage":
				System.out.println("Testing in stage environment");
				break;
			case "dev":
				System.out.println("Testing in Dev environment");
				break;
			case "uat":
				System.out.println("Testing in UAT environment");
				break;
			case "prod":
				System.out.println("Testing in Prod environment");
				break;

			default:
				System.out.println("unknown Environment");
				break;
			}
			
			String carType="xyc";
			switch (carType.toLowerCase()) {
			case "mini":
				System.out.println("Booking car "+carType);
				break;
			case "sedan":
				System.out.println("Booking car "+carType);
				break;
			case "suv":
				System.out.println("Booking car "+carType);
				break;
			case "premium":
				System.out.println("Booking car "+carType);
				break;

			default:
				System.out.println("Please select correct car type. "+carType+" not available");
				break;
			}
			
	        String loanType = "Car Loan";
	        double salary = 30000;
	        double interestRate = 0.0;
	        
	        switch (loanType.toLowerCase()) {
			case "car loan":
				interestRate=6.5; 
				break;
			case "housing loan":
				if(salary<=35000) {
					System.out.println("NOT Applicable for housing loan");
					break;
				}
				interestRate=7.5;
				break;
			case "personal loan":
				interestRate=10.5; 
				break;
			case "education loan":
				interestRate=8.5; 
				break;

			default:
				System.out.println("Invalid loan type");
				break;
			}
	        
	        System.out.println("Interest rate for "+loanType+" is "+interestRate+"%");
	        
	        //Short cirucuit && and Logical Operator & Assignments:
	        System.out.println("Short cirucuit && and Logical Operator & Assignments");
	        int x =10,y=5;
	        if(x>0 && y>0 && x<y && x*2<y) {//T&&T&&T
	        	System.out.println("Hi &&");
	        }
	        if(x>0 & y>0 & x<y & x*2<y) {
	        	System.out.println("Hello &");
	        }
	        if(x>0 || y>0 || x<y || x*2<y) {//T
	        	System.out.println("Hi ||");
	        }
	        if(x>0 | y>0 | x<y | x*2<y) {
	        	System.out.println("Hello |");
	        }
	        
	        boolean flag1 = true;
	        boolean flag2 = false;
	        
	        boolean result = flag1 || flag2;
	        System.out.println("Boolean Results && "+result);
	        
	        boolean resultVal = flag1 & flag2;
	        System.out.println("Boolean Results & "+resultVal);
	        
	        //Loops Assignments:
	        byte countNum=0;
	        do {
	        	System.out.println("I am Batman");
	        	countNum++;
	        }while(countNum<5);
	        
	        for (countNum=1;countNum<10;countNum++) {
	        	System.out.println("I am Batman "+countNum);
	        }
	        for (countNum=10;countNum>0;countNum--) {
	        	System.out.println("I am Batman "+countNum);
	        }
	        countNum=10;
	        while(countNum>0) {
	        	System.out.println(countNum);
	        	countNum--;
	        }
	        countNum=10;
	        do {
	        	System.out.println(countNum);
	        	countNum--;
	        }while(countNum>0);
	        
	        System.out.println("Write a program in Java to print all the multiplication of 5 from 1 to 100 ");
	        for(countNum=1;countNum<=100;countNum++) {
	        	if(countNum%5 == 0) {
	        		System.out.println(countNum);
	        	}
	        }
	        
	        for(countNum=1;countNum<=100;countNum++) {
	        	if(countNum%2 == 0) {
	        		System.out.println(countNum + "Even");
	        	}
	        	else{
	        		System.out.println(countNum + "Odd");
	        	}
	        }
	        
	        char ch2 = 'A';
	        char ch3='a';
	        for(byte i5=0;i5<26;i5++) {
	        	System.out.println("Capital: "+ch2+" ASCII Value: "+ (byte)ch2);
	        	ch2++;
	        	System.out.println("Small: "+ch3+" ASCII Value: "+ (byte)ch3);
	        	ch3++;
	        }
	        countNum=0;
	        while(countNum<10) {
	        	System.out.println("ASCII Value of:" +countNum +" is : "+(char)countNum);
	        	countNum++;
	        }
	        countNum=1;
	        while(countNum<10) {
	        	System.out.println("9. Print the following series: " +(double)countNum);
	        	countNum++;
	        }
	        
	        ch3='A';
	        while(ch3<='z' || ch3<='Z') {
	        	if((ch3=='a'||ch3=='e'||ch3=='i'||ch3=='o'||ch3=='u')) {
	        		System.out.println("Vowels - "+ch3);
	        	}
	        	else if(ch3=='A'||ch3=='E'||ch3=='I'||ch3=='O'||ch3=='U') {
	        		System.out.println("Vowels - "+ch3);
	        	}
	        	ch3++;
	        }
	        
	        
			

	}

}
