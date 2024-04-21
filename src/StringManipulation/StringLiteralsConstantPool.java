package StringManipulation;
//String are most commonly used variable in application
public class StringLiteralsConstantPool {

	public static void main(String[] args) {
		String tr="Hello";
		tr.concat("Selenium");
		System.out.println(tr); //Hello since string are immutable (value cannot be changed)
		System.out.println(tr.concat(" Selenium"));
		
		int i =10;
		i=i+20; //primitive data types are mutable
		System.out.println(i);
		
		//String literals
		String s1="Hello"; // 1 object inside SCP
		String s2="Hello";
		
		String s3 = new String("World");
		String s4="World";
		String s5="Hello";
		String s6 = new String("selenium"); //1-heap and 1-scp
		
		String s7 = "selenium";
		String s8 = new String("selenium");//heap
		
		System.out.println(s1==s2); // scp==scp -- true
		System.out.println(s4==s3); //scp == heap -- false
		System.out.println(s6==s8); //heap ref == heap ref -- false
		
		
		System.out.println(s6.equals(s8)); //true -- values are compared
		System.out.println(s4.equalsIgnoreCase(s3)); //true -- values are compared
		
		String obj = new String("testing"); // 1-heap , 1-scp
		String ob = new String("testing");
		System.out.println(obj==ob);//false
		System.out.println(obj.equals(ob));//true
		
		String o = "Testing";
		System.out.println(obj==o);//false
		System.out.println(obj.equalsIgnoreCase(o));
		
	}

}
