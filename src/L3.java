public class L3 {

    //add the main method header below.

    /*
    Literal value is a value written directly into code
    An Expression is value written using variables or operator.
     */

    public static void main(String[] args) {

        int literalValue1 = 5;
        int literalValue2 = 12;
        int expression1 = literalValue1 + 6;
        int expression2 = literalValue2 + 6;
        int expression3 = literalValue1 + literalValue2;

        //Examples of Literal Values
        double literelExample1 = 3.4;
        boolean literelExample2 = true;
        String literelExample3 = "APPLE";

                //Example of Expression
        double expressionExample = 5 + 6;
        boolean expressionExample2 = 5 > 6;

        //bad example
        //int badExample = 5.4 + 9;

        //A String expression is called String Concatention. You8 can combine String using the +.
        String expressionexample3 = "A fruit people eat is an " + literelExample3;

        //EXAMPLE PROGRAM

        String message1 = "The store has ";
        String message2 = " apples in stock.";
        int numApples = 20;

        System.out.println("The store has 20 apples in stock.");
        System.out.println("The store has " + numApples + " apples in stock");
        System.out.println(message1 + numApples + message2);

    }
}