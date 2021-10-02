/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumCalculator {
    private static final Scanner input = new Scanner(System.in);
    private double sum;

    public SumCalculator() {
        // Intialize sum to 0
    }

    public void askForNumbers() {
        boolean continueLoop = true;
        double numberTemp;
        int counter = 0;

        do {
            try {
                continueLoop = true;
                System.out.print("Enter a number: ");
                numberTemp = input.nextDouble();
                addNumberToSum(numberTemp);

                counter++;
                continueLoop = false;
            }
            catch (InputMismatchException inputMismatchException) {
                System.err.printf("%nException: %s%n", inputMismatchException);
                input.nextLine(); // Discard input
                System.out.println("You must enter only numbers. Try again.");
            }
        } while(counter < 5 || continueLoop);
    }

    public void addNumberToSum(double number) {
        this.sum += number;
    }

    public double getSum() {
        return this.sum;
    }

    public void outputSum() {
        // print "The total is 'sum'."
        System.out.println("The total is " + this.sum + ".");
    }
}
