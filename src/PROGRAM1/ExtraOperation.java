package PROGRAM1;

public class ExtraOperation  extends Constant{
	
	public ExtraOperation(double PI, int i) {
		super(PI,i);
	}


	public double Area_of_circle(double radius) {
		return PI*(radius*radius);
	}
	
	public double area_of_square(double radius) {
		return 4*PI*(radius*radius);
	}
	
	public double Energy_equation(int mass) {
		return mass*(i*i);
	}

}
