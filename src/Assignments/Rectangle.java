package Assignments;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle() {
		this.length=0.0;
		this.width=0.0;
	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double areaOfRectangle() {
		double area=0.0;
		if(this.length==0.0 || this.width==0.0) {
			area=0.0;
		}
		else {
			area=this.length*this.width;
		}
		return area;
	}
	
	
	
	

}
