package PROGRAM6;

public class Bus extends Vehicle{
	
	public Bus(String License_number, String make, String model, double price) {
		super(License_number, make, model, price);
	}

	@Override
	public void fly() {
		System.out.println("A bus cannot fly");
		
	}

	@Override
	public void passengers() {
		System.out.println("A bus can take upto 50 passengers");
		
	}

	@Override
	public void usage() {
		System.out.println("A bus is use for public transport");
		
	}

	@Override
	public void track() {
		System.out.println("A bus uses roads as their track");
		
	}

	@Override
	public String toString() {
		return "Bus [License_number=" + License_number + ", make=" + make + ", model=" + model + ", price=" + price
				+ "]";
	}

}
