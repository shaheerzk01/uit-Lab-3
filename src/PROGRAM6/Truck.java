package PROGRAM6;

public class Truck extends Vehicle{
	
	public Truck(String License_number, String make, String model, double price) {
		super(License_number, make, model, price);
		
	}

	@Override
	public void fly() {
		System.out.println("A truck cannot fly");
		
	}

	@Override
	void passengers() {
		System.out.println("A truck cantake upto 10 passengers");
		
	}

	@Override
	public void usage() {
		System.out.println("A truck is used for transporting goods");
	}

	@Override
	public void track() {
		System.out.println("A truck uses roads as their tracks");
		
	}

	@Override
	public String toString() {
		return "Truck [License_number=" + License_number + ", make=" + make + ", model=" + model + ", price=" + price
				+ "]";
	}

}
