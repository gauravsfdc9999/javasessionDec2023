package InterfaceConcepts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class TestHospital {

	public static void main(String[] args) {
		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.physioServices();
		fh.dentalServices();
		fh.PathServices();
		fh.OPTServices();
		//calling interface variables
		System.out.println("fortis minimum fees---"+FortisHospital.min_fee);
		System.out.println("US minimum fees---"+USMedical.min_fee);
		FortisHospital.billing(); //fortis hospital billing method
		USMedical.billing();
		fh.medicalInsurance(); //calling default method of other interface
		fh.covidVaccination();
		fh.medicalRD();
		
		
		System.out.println("------------");
		
		//object of interface is not allowed
		//USMedical us = new USMedical();
		
		//top casting:
		//child class object can be referred by parents interface ref variable
		USMedical us = new FortisHospital();
		us.physioServices();
		us.oncologyServices();
		us.pediaServices();
		us.emergencyService();
		System.out.println("US minimum fees---"+us.min_fee);
		USMedical.billing();
		us.medicalInsurance();
		us.covidVaccination();

		// individual methods of FH hospital and other interface methods cannot be called due to reference type check failed
		System.out.println("------------");
		
		UKMedical uk = new FortisHospital();
		uk.physioServices(); //common method of interface US and UK
		uk.cardioServices();
		uk.dentalServices();
		uk.emergencyService();
		
		//down casting -- compile time error as object cannot be created
		//FortisHospital fh1 = new USMedical(); // not possible
		
		System.out.println("------------");
		//interface to interface casting -- explicit casting
		UKMedical uk1 = (UKMedical)us;
		uk1.physioServices();
		uk1.dentalServices();
		uk1.cardioServices();
		uk1.emergencyService();
		
		
  }
}
