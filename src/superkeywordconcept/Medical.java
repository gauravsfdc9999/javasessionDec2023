package superkeywordconcept;

public interface Medical {
	
	int min_fee=10;
	
	default void methodMedical() {
		System.out.println("Medical---- methodMedical "+min_fee);
	}
	
	public static void testing() {
		System.out.println("Medical --- testing");
	}

}
