/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import java.util.Scanner;

public class UserInput {
    private static final Scanner input = new Scanner(System.in);
    private String userPW;

    public UserInput() {
        userPW = "";
    }

    public void askForPassword() {
        // print "Type in your password to test its strength: "
        // Scan in input into userPW
    }

    public String getUserPW() {
        return userPW;
    }
}
