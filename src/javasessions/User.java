package javasessions;

public class User {

	String name;
	Byte age;
	String city;
	static final String planet ="World!";
	public static void main(String[] args) {
		//System.out.println(args[0]); //array out of bound exception

		User u1 = new User();
		u1.name="user1";
		u1.age=10;
		u1.city="Pune";
		
		User u2 = new User();
		u2.name="user2";
		u2.age=11;
		u2.city="Hyd";
		
		User u3 = new User();
		u3.name="user3";
		u3.age=12;
		u3.city="Mum";
		
		User u4 = new User();
		u4.name="user4";
		u4.age=14;
		u4.city="Pune4";
		
		User u5 = new User();
		u5.name="user5";
		u5.age=15;
		u5.city="Pune5";
		
		System.out.println("User1: "+u1.name +" "+u1.age+" "+u1.city+" "+User.planet);
		System.out.println("User2: "+u2.name +" "+u2.age+" "+u2.city+" "+User.planet);
		System.out.println("User3: "+u3.name +" "+u3.age+" "+u3.city+" "+User.planet);
		System.out.println("User4: "+u4.name +" "+u4.age+" "+u4.city+" "+User.planet);
		System.out.println("User5: "+u5.name +" "+u5.age+" "+u5.city+" "+User.planet);
		
		u1=u2;
		System.out.println("After assinging values u1=u2");
		System.out.println("User1: "+u1.name +" "+u1.age+" "+u1.city+" "+User.planet);
		System.out.println("User2: "+u2.name +" "+u2.age+" "+u2.city+" "+User.planet);
		System.out.println("User3: "+u3.name +" "+u3.age+" "+u3.city+" "+User.planet);
		System.out.println("User4: "+u4.name +" "+u4.age+" "+u4.city+" "+User.planet);
		System.out.println("User5: "+u5.name +" "+u5.age+" "+u5.city+" "+User.planet);
		
		u2=u3;
		System.out.println("After assinging values u2=u3");
		System.out.println("User1: "+u1.name +" "+u1.age+" "+u1.city+" "+User.planet);
		System.out.println("User2: "+u2.name +" "+u2.age+" "+u2.city+" "+User.planet);
		System.out.println("User3: "+u3.name +" "+u3.age+" "+u3.city+" "+User.planet);
		System.out.println("User4: "+u4.name +" "+u4.age+" "+u4.city+" "+User.planet);
		System.out.println("User5: "+u5.name +" "+u5.age+" "+u5.city+" "+User.planet);
		
		u3=u4;
		System.out.println("After assinging values u3=u4");
		System.out.println("User1: "+u1.name +" "+u1.age+" "+u1.city+" "+User.planet);
		System.out.println("User2: "+u2.name +" "+u2.age+" "+u2.city+" "+User.planet);
		System.out.println("User3: "+u3.name +" "+u3.age+" "+u3.city+" "+User.planet);
		System.out.println("User4: "+u4.name +" "+u4.age+" "+u4.city+" "+User.planet);
		System.out.println("User5: "+u5.name +" "+u5.age+" "+u5.city+" "+User.planet);
		
		u4=u5;
		System.out.println("After assinging values u4=u5");
		System.out.println("User1: "+u1.name +" "+u1.age+" "+u1.city+" "+User.planet);
		System.out.println("User2: "+u2.name +" "+u2.age+" "+u2.city+" "+User.planet);
		System.out.println("User3: "+u3.name +" "+u3.age+" "+u3.city+" "+User.planet);
		System.out.println("User4: "+u4.name +" "+u4.age+" "+u4.city+" "+User.planet);
		System.out.println("User5: "+u5.name +" "+u5.age+" "+u5.city+" "+User.planet);
		
		u5=u1;
		System.out.println("After assinging values u5=u1");
		System.out.println("User1: "+u1.name +" "+u1.age+" "+u1.city+" "+User.planet);
		System.out.println("User2: "+u2.name +" "+u2.age+" "+u2.city+" "+User.planet);
		System.out.println("User3: "+u3.name +" "+u3.age+" "+u3.city+" "+User.planet);
		System.out.println("User4: "+u4.name +" "+u4.age+" "+u4.city+" "+User.planet);
		System.out.println("User5: "+u5.name +" "+u5.age+" "+u5.city+" "+User.planet);
		

		
		
	}

}
