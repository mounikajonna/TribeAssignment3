package Assignment3;

import java.util.Scanner;

public class Rectangle {
	private float width;
	private float height;
	public Rectangle(float width,float height) {
		this.width = width;
		this.height=height;
	}
	public float getwidth() {
		return width;
		
	}
	public void setwidth(float width) {
		this.width= width;
	}
	public float getheight() {
		return height;
		
	}
	public void setheight(float height) {
		this.height= height;
	}
	 public float calculateArea() {
	        return width * height;
	    }
	 public float calculatePerimeter() {
		 return 2 * (width + height);
	          
	    }
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		float n = sc.nextFloat();
		System.out.println("Enter");
		float n2 = sc.nextFloat();
		Rectangle rec = new Rectangle(n,n2);
		System.out.println("Area "+rec.calculateArea());
		System.out.println("Perimeter "+rec.calculatePerimeter());
	}
}