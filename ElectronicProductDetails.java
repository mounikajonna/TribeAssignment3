package Assignment3;

public class ElectronicProductDetails {
	String productID;
	String name;
	double price;

	public ElectronicProductDetails(String productID, String name, double price) {
			        this.productID = productID;
			        this.name = name;
			        this.price = price;
			    }

	public double applyDiscount(double discountPercentage) {
		double discountAmount = price * (discountPercentage / 100);
		price -= discountAmount;
		return price;
	}

	public double calculateFinalPrice() {
		return price;
	}

	public void displayDetails() {
		System.out.println("Product ID: " + productID);
		System.out.println("Product Name: " + name);
		System.out.println("Price: ₹" + price);
	}
}

class WashingMachine extends ElectronicProductDetails {
	int warrantyPeriod;

	public WashingMachine(String productID, String name, double price, int warrantyPeriod) {
		super(productID, name, price);
		this.warrantyPeriod = warrantyPeriod;
	}

	public void extendWarranty(int additionalMonths) {
		warrantyPeriod += additionalMonths;
		System.out.println("Warranty extended by " + additionalMonths + " months.");
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Warranty Period: " + warrantyPeriod + " months");
	}

	public static void main(String[] args) {
		WashingMachine washingMachine = new WashingMachine("Samsung123", "FrontLoad Washing Machine", 45000, 24);

		System.out.println("Before Discount:");
		washingMachine.displayDetails();

		double finalPrice = washingMachine.applyDiscount(20);
		System.out.println("Price after 10% Discount: ₹" + finalPrice);

		washingMachine.extendWarranty(24);

		System.out.println("\nAfter Warranty Extension:");
		washingMachine.displayDetails();
	}
}
