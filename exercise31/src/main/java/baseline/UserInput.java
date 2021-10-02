/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import java.util.Scanner;

public class UserInput {
    private static final Scanner input = new Scanner(System.in);
    private int age;
    private int restingHR;

    public UserInput() {
        // Intialize fields to 0
    }

    public void askForUserInfo() {
        //Try
        // print "How old are you? "
        // scan into age

        // print "What is your resting heart rate? "
        // scan into restingHR
        // Catch(InvalidArgumentException)
    }

    public int getAge() {
        return age;
    }

    public int getRestingHR() {
        return restingHR;
    }
}
