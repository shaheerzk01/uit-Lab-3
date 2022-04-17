package PROGRAM4;

public class main_circle {
	
	public static void main(String[] args) {
		try {
			circle obj = new circle(3.14, 14.5);
			System.out.println(obj.area());
			System.out.println(obj.circumference());
		}catch(Exception e) {
			System.out.println("Error");
		}

	}

}
