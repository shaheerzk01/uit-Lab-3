package PROGRAM4;

import java.lang.Math;

public class Square {
	
    private double area;
	
	public Square(double area) {
		this.area = area;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	public double area() {
		double result = Math.pow(getArea(), 4);
		return result;
	}
	
	public double circumference() {
		double result = 4*getArea();
		return result;
	}


}
