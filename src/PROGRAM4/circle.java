package PROGRAM4;

public class circle extends Constant_circle{
	
	public circle(double PI, double d) {
		super(PI, d);
		
	}
	
	public double area() {
		double result = getPI()*(getRadius()*getRadius());
		return result;
	}
	
	public double circumference() {
		double result = 2*getPI()*getRadius();
		return result;
	}

}
