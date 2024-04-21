package javasessions;

public class StringConcentnation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String is class in java
		
		int a=100;
		int b=200;
		
		String x=" Hello ";
		String y=" Selenium ";
		
		System.out.println(a+b+x+y);
		System.out.println(a+b+x+y+a+b);
		System.out.println(a+b+x+y+(a+b));
		
		char c = 'a';
		String t="hello ";
		System.out.println(t+c+'b');
		System.out.println(c+'b'+t); //ASCII values of a and b
		System.out.println(c+'b'+100+t); 
		
		System.out.println("---------------");
		System.out.println(9/0.0);
		System.out.println(9.0/0);
		System.out.println(9.0/0.0);
		System.out.println(0.0/0); // NaN - not a number
		int a1=0;
		System.out.println(9/(float)a1);
		
		byte b4=(byte)300;
		System.out.println(b4);

	}

}
