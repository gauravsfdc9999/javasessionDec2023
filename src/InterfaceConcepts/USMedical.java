package InterfaceConcepts;

public interface USMedical extends WHO {
	
	//interface variables are static and final by default -- as object cannot be created for same.
	int min_fee = 10;
	
	//no method body is allowed -- abstract methods
	//only method declaration
	//only method prototype
	//Cannot create object of Interface
	//interface cannot have business logic
	//100% abstraction except JDK 1.8 onwards
	
	public abstract void physioServices();
	public void oncologyServices();
	public void pediaServices();
	public void emergencyService();
	
	//after JDk 1.8 2 major changes interfaces can have static methods and default methods with body - non-abstract methods
	
	public static void billing() {
		System.out.println("USMedica l----- billing");
	}
	
	default void medicalInsurance() {
		System.out.println("USMedical --- medicalInsurance"+min_fee);
	}
	
	

}
