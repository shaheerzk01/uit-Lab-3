package PROGRAM4;

public class rectangle extends shapes{
	
	double width;
	double length;
	
	public rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public void sides() {
		System.out.println("Rectangle has 4 sides");
	}
	
	public double area() {
		double result = width*length;
		return result;
	}
	
	public double circumference() {
		double result = 2 * (width + length);
		return result;
	}

}
