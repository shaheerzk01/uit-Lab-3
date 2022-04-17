package Questions;

public class Test2 {
	
    private int count;
	
	public  int getCount() {
		return count;
	}
	
	public static int factorial(int n) {
		int result = 1;
		for(int i=1; i<=n; i++) {
			result*=i;
		}
		return result;
	}

	public static void main(String[] args) {
		
		Test2 obj = new Test2();
		obj.count = 2;
		obj.getCount();
		System.out.println(obj.factorial(5));
		

	}

}
