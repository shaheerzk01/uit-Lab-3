package PROGRAM6;

public class Car extends Vehicle{
	
	String type;

	public Car(String type,String License_number, String make, String model, double price) {
		super(License_number, make, model, price);
		this.type = type;
	}

	@Override
	public void fly() {
		System.out.println("A car cannot fly");
	}

	@Override
	public void passengers() {
		System.out.println("A car can take upto 4 passengers maximum");
	}

	@Override
	public void usage() {
		System.out.println("A car is use for personal usage");
	}

	@Override
	public void track() {
		System.out.println("A car uses roads as their tracks");
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", License_number=" + License_number + ", make=" + make + ", model=" + model
				+ ", price=" + price + "]";
	}

}
