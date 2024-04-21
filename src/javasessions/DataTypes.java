package javasessions;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//java" strict data type concept
		// data types : primitive and non-primitive
		//boolean type: true/false
		//numeric types: 
				//Integral values - 
					//interger: byte, short, int, long
					//flowting point: float, double
					//character type:char,
		//byte type - size 1 byte = 8 bits and range -128 to 127 -- 2^7 to 2^7-1
		byte b = 127;
		byte age = 98;
		
		// short: size = 2byte and range -32768 to 32767 or -2^15 to 2^15-1
		short s1=1000;
		//int - size - 4byte and range: -2147483648 to 2147483647  or -2^31 to 2^31-1
		int i = 2147483647;
		
		//long size: 8byte = 8*8 = 64bits range: -2^63 to 2^63-1
		long l= 1324234333;
		
		// string is right data type for storing phone,ssn,debit cards
		
		//float : size- 4byte = 32 bits range after., can take upto 7 digits
		float f1=10.33f;
		System.out.println(f1);
		
		float f2=(float)45.66;
		System.out.println("value f2: "+f2);
		float buildNumber=1.22f;
		float f3=100;
		System.out.println("value f3: "+f3);
		
		
		//double 8 bytes = 64 bits range: ., can take upto 15 digits
		double d1=12.3333;
		System.out.println(""+d1);
		
		//character type single digit value in single quotes, size - a to z or A to Z and range- 0 to 9 size is 2 bytes = 16 bits
		//a-z: 97 to 122
		//A-Z : 65 to 90
		//0-9 : 48 to 57
		char c='a';
		char c1='1';
		char c2='$';
		System.out.println(c+c1+c2);
		System.out.println(c+""+""+c1+""+c2);
		System.out.println("ACSII value--->"+(byte)c);
		System.out.println("ACSII value--->"+(byte)'$');
		
		//boolean : true/false, size: ~1bit and range - no range
		boolean flag=true;
		boolean pop=false;
		boolean isUserActive=true; //varibale in camel casing with first small letter
		
		String pc = "12%"; //numeric special characters
		
		System.out.println("----------------");
		int value=11;
		value = value++ + ++value; //11+13
		System.out.println("First"+value);
		System.out.println("Second"+ ++value);
		System.out.println( "Last-->"+(value++ + ++value));


		
		
		

	}

}
