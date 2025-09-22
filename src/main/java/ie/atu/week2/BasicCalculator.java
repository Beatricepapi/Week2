package ie.atu.week2;

import java.util.Scanner;

public class BasicCalculator {
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

        double sum = firstNum + secondNum;
        System.out.println("The number is " + sum);
    }
}
