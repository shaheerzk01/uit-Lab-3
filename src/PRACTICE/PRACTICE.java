package PRACTICE;

public class PRACTICE {
	
	public int factorial(int n) {
		int result = 1;
		for(int i=1; i<=n; i++) {
			result*=i;
		}
		return result;
	}
	
	
	
	public static void main(String[] args) {
		PRACTICE obj = new PRACTICE();
		System.out.println(obj.factorial(5));
	}

}
