public class Main {
    public static void main(String[] args) {


        double myLunchCost = 12.50;
        int numberOfKidsInFamily = 4;
        boolean isItRaining = false;
        double priceOfGallonOfGas = 3.14;
        int favoriteNumber = 15;
        double shoeSize = 10.5;
        String birthMonth = "June";
        String fullName = "Mason Pyle";

        // Print out the values of variables
        System.out.println("Variables:");
        System.out.println("Cost of my lunch: " + myLunchCost);
        System.out.println("Number of kids in my family: " + numberOfKidsInFamily);
        System.out.println("Is it raining? " + (isItRaining ? "Yes" : "No"));
        System.out.println("Price of a gallon of gas: " + priceOfGallonOfGas);
        System.out.println("My favorite number: " + favoriteNumber);
        System.out.println("My shoe size: " + shoeSize);
        System.out.println("My birth month: " + birthMonth);
        System.out.println("My full name: " + fullName);


        // Declare and initialize integer variables
        int intOperandA = 1;
        int intOperandB = 2;
        int intSum = 3;
        int intProduct = 4;
        int intDifference = 5;
        int intQuotient = 6;
        int intModulo = 7;

        // Declare and initialize double variables
        double doubleOperandA = 1.5;
        double doubleOperandB = 2.5;
        double doubleSum = 3.5;
        double doubleProduct = 4.5;
        double doubleDifference = 5.5;
        double doubleQuotient = 6.5;


        // Perform arithmetic operations on integer variables
        intSum = intOperandA + intOperandB;
        intProduct = intOperandA * intOperandB;
        intDifference = intOperandA - intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;

        // Display results of arithmetic operations on integers
        System.out.println("Integer Operations:");
        System.out.println("Sum: " + intSum);
        System.out.println("Product: " + intProduct);
        System.out.println("Difference: " + intDifference);
        System.out.println("Quotient: " + intQuotient);
        System.out.println("Modulo: " + intModulo);


        // Perform arithmetic operations on double variables
        doubleSum = doubleOperandA + doubleOperandB;
        doubleProduct = doubleOperandA * doubleOperandB;
        doubleDifference = doubleOperandA - doubleOperandB;
        doubleQuotient = doubleOperandA / doubleOperandB;

        // Display results of arithmetic operations on doubles
        System.out.println("\nDouble Operations:");
        System.out.println("Sum: " + doubleSum);
        System.out.println("Product: " + doubleProduct);
        System.out.println("Difference: " + doubleDifference);
        System.out.println("Quotient: " + doubleQuotient);
    }
}
