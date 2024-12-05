package Assignment3;

public class TrafficLight {
	String color;
	int duration;

	public TrafficLight(String color, int duration) {
		this.color = color;
		this.duration = duration;
	}

	public boolean isRed() {
		return this.color.equalsIgnoreCase("red");
	}

	

	public boolean isGreen() {
		return this.color.equalsIgnoreCase("green");
	}

	public void displayState() {
		System.out.println("Current color: " + this.color + ", Duration: " + this.duration);
	}

	public void changeColor(String newcolor, int newduration) {
		if (newcolor.equals("red") || newcolor.equals("yellow") || newcolor.equals("green")) {
			this.color = newcolor;
			this.duration = newduration;
			System.out.println("Traffic light changed to " + newcolor + " for " + newduration + " sec");
		} else {
			System.out.println("Invalid color");
		}
	}

	public static void main(String[] args) {
		TrafficLight tl = new TrafficLight("Red", 20);
		tl.displayState();
		tl.changeColor("green", 45);
	}
}
