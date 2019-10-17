//Add comment for the heck of it
import Inheritance.CargoFlight;
import Inheritance.Flight;

public class AppMain {

    public static void main(String[] args) {
        Flight flight = new CargoFlight();
        Flight flight2 = new Flight();

        System.out.println(flight2.getNumberOfPassengers());
        System.out.println(flight.getNumberOfPassengers());
    }
}
