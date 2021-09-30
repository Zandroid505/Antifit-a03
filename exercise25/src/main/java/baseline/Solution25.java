/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

public class Solution25 {
    public static void main(String[] args) {
        UserInput instructions = new UserInput();

        // User prompt for PW
        instructions.askForPassword();
        Password user = new Password(instructions.getUserPW());

        // Run PWStrengthDescriptionOutput(Run PWEvaluator(Run passwordValidator method with userString))
        user.passwordStrengthDescriptionOutput(user.passwordEvaluator(user.passwordValidator(instructions.getUserPW())));
    }
}
