package PROGRAM6;

import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		
		try {
			Scanner input = new Scanner(System.in);
			
			System.out.println("press 1 for car details 2 for bus 3 for truck 4 train and 5 for aeroplane details");
			int number = input.nextInt();
			
			if(number==1) {
				Car obj = new Car("Sedan", "ABE-123", "2007", "BMW", 980003.2);
				obj.fly();
				obj.passengers();
				obj.usage();
				obj.track();
				System.out.println(obj.toString());
			}else if(number==2) {
				Bus obj = new Bus("BJW-456", "2013", "Youtong", 500000.0);
				obj.fly();
				obj.passengers();
				obj.usage();
				obj.track();
				System.out.println(obj.toString());
			}else if(number==3) {
				Truck obj = new Truck("DFG-256", "2019", "Shehzor", 3210000.0);
				obj.fly();
				obj.passengers();
				obj.usage();
				obj.track();
				System.out.println(obj.toString());
			}else if(number ==4) {
				Train obj = new Train("7M10", "2000", "Siemens Mobility", 3000000000.0);
				obj.fly();
				obj.passengers();
				obj.usage();
				obj.track();
				System.out.println(obj.toString());
			}else if(number==5) {
				Aeroplane obj = new Aeroplane("A380", "2018", "Air bus", 400038922.0);
				obj.fly();
				obj.passengers();
				obj.usage();
				obj.track();
				System.out.println(obj.toString());
			}
			
			
		}catch(Exception e) {
			System.out.println("Error");
		}
		
	}

}
