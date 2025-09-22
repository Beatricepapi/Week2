package ie.atu.week2;

import java.util.Scanner;

public class BasicCalculatorSwitch {
    public static void main(String[] args) {
        //Prompt the user for a second number
        //Display the total to the screen
        Scanner scan1 = new Scanner(System.in);
        //Please first number
        System.out.println("Please enter a number: ");
        double firstNum = scan1.nextDouble();
        System.out.println("You entered " + firstNum);

        //Please enter second number
        System.out.println("Please enter a second number: ");
        double secondNum = scan1.nextDouble();
        System.out.println("You entered " + secondNum);

        System.out.println("Please choose an operation (add, subtract, multiply, divide): ");
        String operation = scan1.next();

        //Perform the operation
        boolean validOperation = true;
        double result = switch (operation) {
            case "add" -> {
                yield firstNum + secondNum;
            }
            case "subtract" -> firstNum - secondNum;
            case "multiply" -> firstNum * secondNum;
            case "divide" -> firstNum / secondNum;

            default -> {
                System.out.println("Invalid operation");
                yield 0; //yield in default
            }
        };

        System.out.println("The answer is: " + result);

    }
}
