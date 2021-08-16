public class Average2 {
    /*
    Given two numbers, num1 and num2, output the average.
    */
    public static void main(String[] args) {
        int numBannannas = 59;
        int numApples = 23;
        int numGrapes = 269;

        int sumTotal = numApples + numGrapes + numBannannas;
        double average = sumTotal/3.0;

        System.out.println("The average amout of fruit is: " + sumTotal);
    }
}
