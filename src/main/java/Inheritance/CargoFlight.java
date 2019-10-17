package Inheritance;

public class CargoFlight extends Flight {

    private int numberOfPassengers = 15;

    @Override
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }
}
