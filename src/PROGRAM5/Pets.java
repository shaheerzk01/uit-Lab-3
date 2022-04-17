package PROGRAM5;

import java.util.Scanner;

public class Pets {
	
	public static void main(String[] args) {
		try {
			
			Scanner input = new Scanner(System.in);
			System.out.println("Press 1 to show details of cat\nPress 2 to show details of dog\nPress 3 to show details of parrot");
			
			int number = input.nextInt();
			if(number==1) {
				Cat cat = new Cat();
				cat.eats();
				cat.play();
				cat.fly();
				cat.talk();
				cat.bark();
			}if(number==2) {
				Dog dog = new Dog();
				dog.eats();
				dog.play();
				dog.fly();
				dog.talk();
				dog.bark();
			}if(number==3) {
				Parrot parrot = new Parrot();
				parrot.eats();
				parrot.play();
				parrot.fly();
				parrot.talk();
				parrot.bark();
			
			}	
		}catch(Exception e) {
			System.out.println("Error");
		}
		
	}

}
