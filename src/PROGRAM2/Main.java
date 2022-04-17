package PROGRAM2;

import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
		
		try {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your roll no");
		int Rollno = input.nextInt();
		System.out.println("Enter your name");
		String name = input.next();
		System.out.println("Enter your department");
		String department = input.next();
		System.out.println("Enter yor semester");
		int semester =input.nextInt();
		
		Student obj = new Student(Rollno, name, department, semester);
		System.out.println(obj.toString());
		
		
		}catch(Exception e) {
			System.out.println("Error");
		}

	}

}
