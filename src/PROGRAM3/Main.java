package PROGRAM3;

public class Main {
	
	public static void main(String[] args) {
		try {
				  Employee e[] = new Employee[3];
				  
				  for(int i=0; i<3; i++) {
				   
				   e[i] = new Employee();
				   e[i].getInput();
				  }
				  
				  System.out.println("**** Data Entered as below ****");
				  
				  for(int i=0; i<3; i++) {
				   
				   e[i].display();
				  }
		}catch(Exception e) {
			System.out.println("Error");
		}
	
	}

}
