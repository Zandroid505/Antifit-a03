/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import java.util.Scanner;

public class UserInput {
    private static final Scanner input = new Scanner(System.in);
    private String word1;
    private String word2;

    public UserInput() {
        word1 = "";
        word2 = "";
    }

    public void askForInput() {
        // Prompt user for two strings
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");

        // Scan in first string
        System.out.print("Enter the first string: ");
        word1 = input.nextLine();

        // Scan in second string
        System.out.print("Enter the second string: ");
        word2 = input.nextLine();
    }

    public String getWord1() {
        return word1;
    }

    public String getWord2() {
        return word2;
    }
}
