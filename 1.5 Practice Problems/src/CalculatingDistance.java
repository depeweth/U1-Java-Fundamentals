public class CalculatingDistance {

    /*
    Create a program that calculates a vehicle's distance based on speed traveled and time traveled.

    Example: 55 mph for 45 minutes -> 41.25 miles

    */


    public static void main(String[] args) {
        double milesPrHour = 40.0;
        double hours = .5;

        double distanceTraveled = milesPrHour/hours;

        System.out.println("You have traveled: " + distanceTraveled + " miles");
    }
}