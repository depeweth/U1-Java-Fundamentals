public class SteamDiscount {

    /*
    A game on Steam costs $60.00, but is currently on sale for 20% off. Create a program to display how much the game costs after the discount.
     */
    public static void main(String[] args) {
        double cost = 60.00;
        double discount = 0.20;

        double percentage = cost * discount;
        double total = cost - percentage;

        System.out.println("The total is: " + total);

    }
}
