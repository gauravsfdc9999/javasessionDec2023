package InterfaceConcepts;

public interface IndianMedical {
	public void gynecService();
	public void radiologyServices();
	public void emergencyService();
	
	default void medicalInsurance() {
		System.out.println("IndiaMedical --- medicalInsurance");
	}

}
