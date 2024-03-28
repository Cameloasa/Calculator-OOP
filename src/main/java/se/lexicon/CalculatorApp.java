package se.lexicon;

import java.util.Scanner;

import static java.lang.System.*;

public class CalculatorApp {
    // Step1: Define the main method
    // Step2: Create Scanner
    // Step3: Add a Loop to repeatedly display the menu
    // Step4: Get the user's choice from the scanner
    // Step5: Implement the converter operations(Exchange Operations)
    // Step6: Perform operations based on the user's choice using thr switch-case statement
    // Step7: Display output
    // Step8: Continue the loop as long as user's choice is not 0

    // mainMethod
    // printMenu
    // getUserInput
    // performOperations

    /* Start
         Define Main method -public static void()
         Create a scanner
         Add a loop to repeatedly display the menu
     */
    public static void start(){
        Scanner scanner = new Scanner(System.in);
        // declare a variable - user's choice
        int choice;
        //ask user input
        System.out.println("Enter your choice:");
        /* create a loop do(display menu) - if(choice is not zero) - while
        Print menu for user while user's choice is not zero
         */
        do {
            displayMenu();
            choice = scanner.nextInt();
            if (choice != 0) {
                double result = performOperation(choice);
                System.out.println("Result: " + result);}
        }while (choice !=0);

        System.out.println("Application exit :");

    }


    /*PrintMenu
        private static void
        print all the operation on console
    */
    private static void displayMenu(){
        out.println("Calculator Menu");
        out.println("1.Addition :");
        out.println("2.Subtraction :");
        out.println("3.Multiplication :");
        out.println("4.Division :");
        out.println("0.Exit :");
    }


    /*Perform Operation
    private static void(int choice) - parameters
    Scanner
    declare a variable result
    switch (choice)
     */
    private static double performOperation(int choice){
        double result = 0.0;
        switch (choice){
            case 1:
                result = performAddition();
                break;
            case 2:
                result = performSubtraction();
                break;
            case 3:
                result = performMultiplication();
                break;
            case 4:
                result = performDivision();
                break;
            default:
                throw new IllegalArgumentException("Invalid operation :");
        }
        return result;

    }
        /*Methods for operations

         */

    private static double performAddition(){
        Scanner scanner  = new Scanner(in);
        out.println("Please,enter a number :");
        double number1 = scanner.nextDouble();
        out.println("Please,enter another number :");
        double number2 = scanner.nextDouble();
        return   (number1 + number2);


    }
    private static double performSubtraction(){
        Scanner scanner  = new Scanner(in);
        out.println("Please,enter a number :");
        double number1 = scanner.nextDouble();
        out.println("Please,enter another number :");
        double number2 = scanner.nextDouble();
        return (number1 - number2);
    }
    private static double performMultiplication(){
        Scanner scanner  = new Scanner(in);
        out.println("Please,enter a number :");
        double number1 = scanner.nextDouble();
        out.println("Please,enter another number :");
        double number2 = scanner.nextDouble();
        return number1 * number2;
    }
    private static double performDivision(){
        Scanner scanner  = new Scanner(in);
        out.println("Please,enter a number :");
        double number1 = scanner.nextDouble();
        out.println("Please,enter another number :");
        double number2 = scanner.nextDouble();
        if (number2 == 0) {
            throw new IllegalArgumentException("Division by zero is not allowded");
        }
        return number1 / number2;
    }

}
