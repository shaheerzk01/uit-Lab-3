package PROGRAM6;

public class Train extends Vehicle{
	
	public Train(String License_number, String make, String model, double price) {
		super(License_number, make, model, price);
	}

	@Override
	public void fly() {
		System.out.println("A train cannot fly");
		
	}

	@Override
	public void passengers() {
		System.out.println("A train can take upto more than 500 passengers");
		
	}

	@Override
	public void usage() {
		System.out.println("A train is use for public transport");
		
	}

	@Override
	public void track() {
		System.out.println("A train uses railway tracks");
		
	}

	@Override
	public String toString() {
		return "Train [Train ID=" + License_number + ", make=" + make + ", model=" + model + ", price=" + price
				+ "]";
	}


}
