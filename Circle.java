package Assignment3;

import java.util.Scanner;

public class Circle {
	private double radius;
	

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double calculateArea() {
	//return Math.PI *radius*radius;
	return Math.PI * Math.pow(radius, 2); // area = πr²
		
	}
	

	public double calculateCircumference() {
		return 2 * Math.PI * radius; // circumference = 2πr
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		double n = sc.nextDouble();
		Circle c1 = new Circle(n);
		System.out.println("Area "+c1.calculateArea());
		System.out.println("Circumference "+c1.calculateCircumference());
	}

	
}
