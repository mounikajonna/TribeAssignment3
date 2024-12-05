package Assignment3;

public class Shaping {
public static void main(String[] args) {
		
		ShapeMethods rect = new Rectangles(2, 3);
		System.out.println("area is: "+ rect.area());
		System.out.println("perimeter is: "+ rect.perimeter());
		
		ShapeMethods cir = new Circles(8);
		System.out.println("area is: "+ cir.area());
		System.out.println("perimeter is: "+ cir.perimeter());
		
		ShapeMethods sh = new Triangle(2, 3, 6);
		System.out.println("area is: "+ sh.area());
		System.out.println("perimeter is: "+ sh.perimeter());
	}
}
