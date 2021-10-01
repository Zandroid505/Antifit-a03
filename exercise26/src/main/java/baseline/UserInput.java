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
        this.balance = 0;
        this.apr = 0;
        this.monthlyPayment = 0;
    }

    public void askForCreditCardPaymentInfo() {
        // print "What is your balance? "
        System.out.print("What is your balance? ");
        // Scan in balance
        this.balance = Double.parseDouble(input.nextLine());

        // print "What is the APR on the card (as a percent)? "
        System.out.print("What is the APR on the card (as a percent)? ");
        // Scan in APR
        this.apr =  Double.parseDouble(input.nextLine());

        //print "What is the monthly payment you can make? "
        System.out.print("What is the monthly payment you can make? ");
        // Scan in monthlyPayment
        this.monthlyPayment = Integer.parseInt(input.nextLine());
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
