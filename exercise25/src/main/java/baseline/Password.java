/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

public class Password {
    private String userPW;
    private int PWStrength;
    private String PWStrengthDescription;

    public Password(String userPW) {
        // Intialize userPW to userInput
        // Intialize PWStrength to 0
        // Intialize PWStrengthDescription to ""
    }

    public int passwordStrength(String userPW) {
        // If password contains only digits and is less than eight characters
            // PWStrength = 1
        // If password contains only letters and is fewer than eight characters
            // PWStrength = 2
        // If password contains letters, at least one number, and at least eight characters
            // PWStrength = 3
        // If password contains letters, numbers, special characters and is at least eight characters
            // PWStrength = 4

        // Return PWStrength
    }

    public String passwordEvaluator(int PWStrength) {
        // If PWStrength == 1
            // PWStrengthDescription = "very weak password."
        // If PWStrength == 2
            // PWStrengthDescription = "weak password."
        // If PWStrength == 3
            // PWStrengthDescription = "strong password."
        // If PWStrength == 4
            // PWStrength = "very strong password."

        // return PWStrengthDescription
    }

    public void PWStrengthDescriptionOutput(String PWStrengthDescription) {
        // print "The password 'userPW' is a 'PWStrengthDescription'"
    }
}
