package PROGRAM6;

public abstract class Vehicle {
	
	protected String License_number;
	protected String make;
	protected String model;
	protected double price;
	
	public Vehicle(String License_number, String make, String model, double price) {
		this.License_number = License_number;
		this.make = make;
		this.model = model;
		this.price = price;
	}

	public String getLicense_number() {
		return License_number;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}
	
	abstract void fly();
	abstract void passengers();
	abstract void usage();
	abstract void track();

}
