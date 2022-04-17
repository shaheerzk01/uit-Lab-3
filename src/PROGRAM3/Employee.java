package PROGRAM3;

import java.util.Scanner;

public class Employee {
	
	int emp_num;
	 float emp_comp;
	 
	 public void getInput() {
	 
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter the Employee number :: ");
	  emp_num = input.nextInt();
	  System.out.print("Enter the Employee compensation :: ");
	  emp_comp = input.nextFloat();
	 }
	 
	 public void display() {
	  
	  System.out.println("Employee number = " + emp_num);
	  System.out.println("Employee compensation = " + emp_comp);
	 }
	 

}
