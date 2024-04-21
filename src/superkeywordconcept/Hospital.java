package superkeywordconcept;

public class Hospital implements Medical{
	
	int min_fee=50;
	
	public void treatment() {
		System.out.println("\"Medical min fee : \""+min_fee);
		System.out.println("Medical min fee : "+Medical.min_fee);
		Medical.super.methodMedical();
	}

}
