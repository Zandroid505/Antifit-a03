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
        this.balance = balance;
        this.apr = apr;
        this.monthlyPayment = monthlyPayment;
    }

    public int calculateMonthsUntilPaidOff() {
        double dailyAprRate = this.apr / 36500;
        double monthsToPayOff = (-1.0/30.0);

        monthsToPayOff = monthsToPayOff * Math.log(1.0 + (this.balance/this.monthlyPayment)
                * (1.0 - Math.pow((1.0 + dailyAprRate), 30.0)));
        monthsToPayOff = monthsToPayOff / Math.log(1.0 + dailyAprRate);

        if(monthsToPayOff % 1 != 0) {
            monthsToPayOff += 1.0;
        }

        return (int)monthsToPayOff;
    }

    private double roundUpNextCent(double valueToRoundUp) {
        if (valueToRoundUp >= (valueToRoundUp + 0.001)) {
            valueToRoundUp *= 100;
            valueToRoundUp += 0.5;
            valueToRoundUp = ( valueToRoundUp) / 100.0;
        }

        return valueToRoundUp;
    }

    public void outputNumberOfMonthsUntilPaidOff(int months) {
        // print "It will take you 'months' months to pay off this card."
        System.out.printf("It will take you %d months to pay off this card.", months);
    }
}
