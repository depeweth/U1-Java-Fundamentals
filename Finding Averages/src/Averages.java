package src;

public class Averages {

    /*
    Create a program to output the averages of 4 values.
    Example: 12, 13, 14, 15 -> 13.5
     */

    public static void main(String[] args) {
        int testscore1 = 36;
        int testscore2 = 13;
        int testscore3 = 923;
        int testscore4 = 15;

        int sumTotal = testscore1 + testscore2 + testscore3 + testscore4;
        double average = sumTotal/4.0;

        System.out.println("The average is " + average);

    }



}
