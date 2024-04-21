package InterfaceConcepts;

//child -- parent class (1) -- parent interfaces (n)
public class FortisHospital extends Hospitals implements USMedical,UKMedical,IndianMedical  {
	private static int fortis_min_fee=20;
	private static int total_fee;
	
	public FortisHospital() {
		System.out.println("FortisHospital --------------- Constructor");
	}
	
	//US
	@Override
	public void physioServices() {
		System.out.println("FH ---- US Physio Service");
	}


	@Override
	public void oncologyServices() {
		System.out.println("FH ---- US oncologyServices");

	}


	@Override
	public void pediaServices() {
		System.out.println("FH ---- US pediaServices");

	}

	//India
	@Override
	public void gynecService() {
		System.out.println("FH ---- India gynecService");

	}


	@Override
	public void radiologyServices() {
		System.out.println("FH ---- India radiologyServices");

	}

	//UK
	@Override
	public void dentalServices() {
		System.out.println("FH ---- UK dentalServices");

	}


	@Override
	public void cardioServices() {
		System.out.println("FH ---- UK cardioServices");

	}

	//FH individual
	public void OPTServices() {
		System.out.println("FH---OPTServices");
	}
	public void PathServices() {
		System.out.println("FH---PathServices");
	}

	//common method
	@Override
	public void emergencyService() {
		System.out.println("FH -- common emergencyService");
	}
	
	@Override
	public void medicalInsurance() {
		// TODO Auto-generated method stub
		//IndianMedical.super.medicalInsurance();
		System.out.println("FH--- Medical insurance");
		USMedical.super.medicalInsurance();
		total_fee = USMedical.min_fee + FortisHospital.min_fee + FortisHospital.fortis_min_fee;
		System.out.println("Total Fees ---> "+total_fee);
	}


	//method hiding
	public static void billing() {
		System.out.println("FH----- billing");
	}

	//WHO
	@Override
	public void covidVaccination() {
		System.out.println("FH----- WHO covidVaccination");
		
	}
	
	@Override
	public void medicalRD() {
		super.medicalRD();
		System.out.println("FH---R&D");
	}

}
