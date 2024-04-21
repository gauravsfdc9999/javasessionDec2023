package javasessions;

public class CallByRefConcept {
	
	String name;
	int age;
	
	public static void getInfo(CallByRefConcept t1) {
		System.out.println(t1.name);
		System.out.println(t1.age);
		t1.name = "Tom";
		t1.age=40;
		System.out.println(t1.name);
		System.out.println(t1.age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByRefConcept obj = new CallByRefConcept();
		obj.name="Gaurav";
		obj.age=41;
		
		CallByRefConcept.getInfo(obj); //call by reference
		//obj.getInfo(obj);
		
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		CallByRefConcept app = new CallByRefConcept();
		CallByRefConcept.getInfo(app);
		

	}

}
