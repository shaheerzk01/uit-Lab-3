package PROGRAM1;

import java.util.Scanner;

public class Calculator {
	
        public static void main(String[] args) {
		
		try {
		
		BasicOperation obj = new BasicOperation();
		Scanner input = new Scanner(System.in);
		System.out.println("enter number 1");
		int number1;
		number1 = input.nextInt();
		System.out.println("enter number2");
		int number2;
		number2 = input.nextInt();
		System.out.println("addition of two number " + obj.add(number1, number2));
		System.out.println("subtraction of two number " + obj.sub(number1, number2));
		System.out.println("multiplication of two number " + obj.multiply(number1, number2));
		System.out.println("division of two number " + obj.div(number1, number2));
		
		Constant obj1 = new Constant(3.14, 299792458);
		double PI = obj1.PI;
		int speed_of_light = obj1.i;
		
		ExtraOperation obj2 = new ExtraOperation(PI, speed_of_light);
		
		System.out.println("enter the value of radius");
		double radius;
		radius = input.nextDouble();
		
		System.out.println("Enter value of mass");
		int mass;
		mass = input.nextInt();
		
		System.out.println("Area of circle " + obj2.Area_of_circle(radius));
		System.out.println("Area of square " + obj2.area_of_square(radius));
		System.out.println("Energy mass equation " + obj2.Energy_equation(mass));
		}catch(ArithmeticException e) {
			System.out.println("Cannot divisible by 0");
		}

	}


}
