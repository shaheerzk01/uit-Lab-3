package PROGRAM6;

public class Aeroplane extends Vehicle{
	
	public Aeroplane(String License_number, String make, String model, double price) {
		super(License_number, make, model, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("An aeroplane can fly");
		
	}

	@Override
	public void passengers() {
		System.out.println("An Aeroplane can take more than 300 passengers");
		
	}

	@Override
	public void usage() {
		System.out.println("An areoplane is used for public transport");
		
	}

	@Override
	public void track() {
		System.out.println("An aeroplane does not required any track only for take off it requires runway");
		
	}

	@Override
	public String toString() {
		return "Aeroplane [Aeroplane ID=" + License_number + ", make=" + make + ", model=" + model + ", price="
				+ price + "]";
	}
	

}
