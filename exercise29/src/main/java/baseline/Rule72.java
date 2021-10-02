package baseline;

import java.util.Scanner;

public class Rule72 {
    private static final Scanner input = new Scanner(System.in);
    private double rateOfReturn;
    private double years;

    public Rule72() {
        // Initialize rateOfReturn to 0
    }

    public void askForRateOfReturn() {
        boolean continueLoop = true;

        //do
            // print "What is the rate of return? "
            // scan in rateOfReturn
            // Catch(InputMismatchException and ArithmeticException)
            // calculateRateOfReturn(rateOfReturn) (if no exceptions)
            // continueLoop = false (if no exceptions)
        //while(continueLoop)
    }

    public void calculateRateOfReturn(double rateOfReturn) {
        // years = 72 / rateOfReturn
        //if(years % 1 != 0)
            // years += 1.0
    }

    public int getYears() {
        return (int)years;
    }

    public void outputYearsToDoubleInvestment() {
        // print "It will take 'years' years to double your initial investment."
    }
}
