package Assignments;

public class Car {
	
	private String make;
	private String model;
	private int year;
	private String unkownValues="unknown";
	
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public Car() {
		this.make = unkownValues;
		this.model = unkownValues;
		//this.year = Integer.valueOf(unkownValues);
		this.year=0;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}
	
	
	
	

}
