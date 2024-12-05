package Assignment3;

public abstract class ShapeMethods {
	public abstract double area();
	public abstract int perimeter();
}

class Rectangles extends ShapeMethods{
	
	int height;
	int width;
	
	public Rectangles(int height,int width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public double area() {
		return height*width;
		
	}

	@Override
	public int perimeter() {
		return 2*(height+width);
	}
	
}

class Circles extends ShapeMethods{
	
	double radius;
	
	public Circles(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI*radius*radius;
	}

	@Override
	public int perimeter() {
		
		return (int) (2*Math.PI*radius);
	}
	
}

class Triangle extends ShapeMethods{
	
	double sideA,sideB,sideC;
	
	public Triangle(double sideA,double sideB,double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	@Override
	public double area() {
		double s = (sideA + sideB + sideC)/2;
		return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
	}

	@Override
	public int perimeter() {
		return (int) (sideA+sideB+sideC);
	}
	
}
