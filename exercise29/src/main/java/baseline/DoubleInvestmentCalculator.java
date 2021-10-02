/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoubleInvestmentCalculator {
    private static final Scanner input = new Scanner(System.in);
    private int rateOfReturn;
    private int years;

    public DoubleInvestmentCalculator() {
        this.rateOfReturn = 0;
        this.years = 0;
    }

    public void askForRateOfReturn() {
        boolean continueLoop = true;

        do {
            try {
                System.out.print("What is the rate of return? ");
                this.rateOfReturn = input.nextInt();
                calculateRateOfReturn(this.rateOfReturn);
                continueLoop = false;
            }
            catch (InputMismatchException inputMismatchException) {
                input.nextLine();
                System.out.println("Sorry. That's not a valid input.");
            }
            catch (ArithmeticException arithmeticException) {
                input.nextLine();
                System.out.println("Sorry. That's not a valid input.");
            }
        } while(continueLoop);
    }

    public void calculateRateOfReturn(int rateOfReturn) {
        double yearsTemp = 72.0 / rateOfReturn;
        
        if(yearsTemp % 1 != 0)
            yearsTemp += 1.0;

        this.years = (int)yearsTemp;
    }

    public int getYears() {
        return (int)years;
    }

    public void outputYearsToDoubleInvestment() {
        System.out.println("It will take " + years + " years to double your initial investment.");
    }
}
