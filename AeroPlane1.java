package Assignment3;

import java.time.LocalTime;

public class AeroPlane1 {
	String flightNumber;
	String destination;
	LocalTime departureTime;
	boolean isDelayed;

	AeroPlane1(String flightNumber, String destination, LocalTime departureTime) {
		this.departureTime = departureTime;
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.isDelayed = false;
	}

	public String checkFlightStatus() {
		if (isDelayed) {
			return "Flight " + flightNumber + " to " + destination + " is delayed.";
		} else {
			return "Flight " + flightNumber + " to " + destination + " is on time.";
		}
	}

	public void delayFlight(int minutes) {
		isDelayed = true;
		departureTime = departureTime.plusMinutes(minutes);
	}

	public String checkIfFlightIsOnTime(LocalTime currentTime) {
		if (currentTime.isBefore(departureTime)) {
			return "Flight " + flightNumber + " is on time. Departure is at " + departureTime;
		} else if (currentTime.equals(departureTime)) {
			return "Flight " + flightNumber + " is departing now.";
		} else {
			return "Flight " + flightNumber + " has already departed.";
		}
	}

	public static void main(String[] args) {
		AeroPlane1 airplane = new AeroPlane1("AirIndia", "Us", LocalTime.of(8, 40));
		System.out.println(airplane.checkFlightStatus());
		airplane.delayFlight(15);
		System.out.println(airplane.checkFlightStatus());
		System.out.println(airplane.checkIfFlightIsOnTime(LocalTime.of(8, 40)));
		System.out.println(airplane.checkIfFlightIsOnTime(LocalTime.of(9, 0)));
	}
}
