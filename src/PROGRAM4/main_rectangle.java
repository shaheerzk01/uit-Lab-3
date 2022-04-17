package PROGRAM4;

import java.util.Scanner;

public class main_rectangle {
	
	public static void main(String[] args) {
		
		try {
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter width of rectangle");
			double width = input.nextDouble();
			
			System.out.println("Enter length of rectangle");
			double length = input.nextDouble();
			
			rectangle obj = new rectangle(width,length);
			System.out.println(obj.area());
			System.out.println(obj.circumference());
			obj.sides();
				
		}catch(Exception e) {
			System.out.println("Error");
		}

	}

}
