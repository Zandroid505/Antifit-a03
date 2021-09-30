/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

public class Password {
    private final String userPassword;
    private int passwordStrength;
    private String passwordStrengthDescription;
    private int amntOfNumbers;
    private int amntOfLetters;

    public Password(String userPassword) {
        // Intialize userPW to userInput
        this.userPassword = userPassword;

        // Intialize PWStrength to 0
        passwordStrength = 0;

        // Intialize PWStrengthDescription to ""
        passwordStrengthDescription = "";
        amntOfNumbers = 0;
        amntOfLetters = 0;

    }

    public int passwordValidator(String userPW) {
        // If password contains only digits and is less than eight characters
        if(checkForNumbers(userPW) && userPW.length() < 8) {
            passwordStrength = 1;
        }

        // If password contains only letters and is fewer than eight characters
        if(checkForLetters(userPW) && userPW.length() < 8 && amntOfNumbers <= 0) {
            passwordStrength = 2;
        }

        // If password contains letters, at least one number, and at least eight characters
        if(userPW.length() >= 8 && amntOfNumbers > 0 && amntOfLetters > 0) {
            passwordStrength = 3;
        }

        // If password contains letters, numbers, special characters and is at least eight characters
        if(userPW.length() >= 8 && amntOfNumbers > 0 && amntOfLetters > 0 && checkForSpecialCharacter(userPW)) {
            passwordStrength = 4;
        }

        // Return PWStrength
        return passwordStrength;
    }

    private boolean checkForNumbers(String userPW) {
        boolean onlyNumbers = true;

        for (int i = 0; i < userPW.length(); i++) {
            if (userPW.charAt(i) >= '0' && userPW.charAt(i) <= '9') {
                amntOfNumbers++;
            } else {
                onlyNumbers = false;
            }
        }
        return onlyNumbers;
    }

    private boolean checkForLetters(String userPW) {
        boolean onlyLetters = true;

        for (int i = 0; i < userPW.length(); i++) {
            if ((userPW.charAt(i) >= 'a' && userPW.charAt(i) <= 'z') || (userPW.charAt(i) >= 'A' && userPW.charAt(i) <= 'Z')) {
                amntOfLetters++;
            } else {
                onlyLetters = false;
            }
        }
        return onlyLetters;
    }

    private boolean checkForSpecialCharacter(String userPW) {
        for(int i = 0; i < userPW.length(); i++) {
            if(!(Character.isDigit(userPW.charAt(i))) && !(Character.isLetter(userPW.charAt(i))) && !(Character.isWhitespace(userPW.charAt(i)))) {
                return true;
            }
        }
        return false;
    }



    public String passwordEvaluator(int passwordStrength) {
        // If passwordStrength == 1
        if(passwordStrength == 1)
            passwordStrengthDescription = "very weak password.";

        // If passwordStrength == 2
        if(passwordStrength == 2)
            passwordStrengthDescription = "weak password.";

        // If passwordStrength == 3
        if(passwordStrength == 3)
            passwordStrengthDescription = "strong password.";

        // If passwordStrength == 4
        if(passwordStrength == 4)
            passwordStrengthDescription = "very strong password.";

        // return PWStrengthDescription
        return passwordStrengthDescription;
    }

    public void passwordStrengthDescriptionOutput(String passwordStrengthDescription) {
        // print "The password 'userPW' is a 'passwordStrengthDescription'"
        System.out.printf("The password '%s' is a %s%n", userPassword, passwordStrengthDescription);
    }
}
