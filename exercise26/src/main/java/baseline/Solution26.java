/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

public class Solution26 {
    public static void main(String[] args) {
        UserInput user = new UserInput();

        // User prompts with input
        user.askForCreditCardPaymentInfo();

        // Create PaymentCalculator object with input
        PaymentCalculator userInfo = new PaymentCalculator(user.getBalance(), user.getApr(), user.getMonthlyPayment());

        // OutputMonthsUntilPaidOff(calculateMonthsUntilPaidOff())
        userInfo.outputNumberOfMonthsUntilPaidOff(userInfo.calculateMonthsUntilPaidOff());
    }
}
