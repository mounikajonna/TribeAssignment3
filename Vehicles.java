package Assignment3;

public class Vehicles {
	String make;
	String model;
	int year;

	public Vehicles(String make, String model, int year) {
	        this.make = make;
	        this.model = model;
	        this.year = year;
	    }

	public void displayDetails() {
		System.out.println("Make: " + make);
		System.out.println("Model: " + model);
		System.out.println("Year: " + year);
	}
}

class Car extends Vehicles {
	double trunkSize;

	public Car(String make, String model, int year, double trunkSize) {
		super(make, model, year);
		this.trunkSize = trunkSize;
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Trunk Size: " + trunkSize + " cubic feet");
	}
}

class Truck extends Vehicles {
	double payloadCapacity;

	public Truck(String make, String model, int year, double payloadCapacity) {
		super(make, model, year);
		this.payloadCapacity = payloadCapacity;
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Payload Capacity: " + payloadCapacity + " kg");
	}

	public static void main(String[] args) {
		Car car = new Car("Toyota", "Camry", 2020, 15.1);
		Truck truck = new Truck("Ford", "F-150", 2022, 3300);

		System.out.println("Car Details:");
		car.displayDetails();

		System.out.println("\nTruck Details:");
		truck.displayDetails();
	}
}
