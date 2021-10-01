/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import java.util.Scanner;

public class UserInput {
    private static final Scanner input = new Scanner(System.in);
    private double balance;
    private double apr;
    private int monthlyPayment;

    public UserInput() {
        // balance = 0
        // apr = 0
        // monthlyPayment = 0
    }

    public void askForCreditCardPaymentInfo() {
        // print "What is your balance? "
        // Scan in balance

        // print "What is the APR on the card (as a percent)? "
        // Scan in APR

        //print "What is the monthly payment you can make? "
        // Scan in monthlyPayment
    }

    public double getBalance() {
        return balance;
    }

    public double getApr() {
        return apr;
    }

    public int getMonthlyPayment() {
        return monthlyPayment;
    }
}
