package Assignment3;

public class TravelBooking {
	public void searchFlights() {
		System.out.println("Searching for available flights...");
		System.out.println("1. Flight from New Korea to Japan - Price: ₹37,500");
		System.out.println("2. Flight from Japan to Hongkong - Price: ₹33,750");
		System.out.println("3. Flight from London to New York - Price: ₹50,000");
	}

	public void searchHotels() {
		System.out.println("Searching for available hotels...");
		System.out.println("1. Hotel A in Japan - Price: ₹22,250 per night");
		System.out.println("2. Hotel B in Hongkong - Price: ₹30,000 per night");
		System.out.println("3. Hotel C in New York - Price: ₹25,500 per night");
	}

	public void bookFlight(String flight) {
		System.out.println("Booking the flight: " + flight);
		System.out.println("Flight booked successfully!");
	}

	public void bookHotel(String hotel) {
		System.out.println("Booking the hotel: " + hotel);
		System.out.println("Hotel booked successfully!");
	}

	public void cancelFlight(String flight) {
		System.out.println("Canceling the flight booking: " + flight);
		System.out.println("Flight canceled successfully!");
	}

	public void cancelHotel(String hotel) {
		System.out.println("Canceling the hotel booking: " + hotel);
		System.out.println("Hotel canceled successfully!");
	}

	public static void main(String[] args) {
		        TravelBooking travelSystem = new TravelBooking();
		        
		        travelSystem.searchFlights();
		        travelSystem.searchHotels();

		        travelSystem.bookFlight("Flight from Korea to Japan");
		        travelSystem.bookHotel("Hotel A in Japan");

		        travelSystem.cancelFlight("Flight from Japan to Hongkong");
		        travelSystem.cancelHotel("Hotel A in Hongkong");

		        System.out.println("\nAfter Cancellation:");
		        travelSystem.searchFlights();
		        travelSystem.searchHotels();
		    }

}
