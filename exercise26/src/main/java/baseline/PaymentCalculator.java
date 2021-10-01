/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */


package baseline;

public class PaymentCalculator {
    private double balance;
    private double apr;
    private int monthlyPayment;

    public PaymentCalculator(double balance, double apr, int monthlyPayment) {
        // balance = userInput
        // apr = userInput
        // monthlyPayment = userInput
    }

    public int calculateMonthsUntilPaidOff() {
        // dailyAprRate = apr / 365;

        //return roundUpNextCent((-(1/3) * log(1 + roundUpNextCent(balance/monthlyPayment) * (1 - (1 + dailyAprRate)^30)) / log(1 + dailyAprRate))
    }

    private double roundUpNextCent(double valueToRoundUp) {
        // If valueToRoundUp is faction of cent
            // valueToRoundUp *= 100
            // valueToRoundUp += 0.5
            // valueToRoundUp = valueToRoundUp / 100

        // return valueToRoundUp
    }

    private void outputNumberOfMonthsUntilPaidOff(int months) {
        // print "It will take you 'months' months to pay off this card."
    }
}
