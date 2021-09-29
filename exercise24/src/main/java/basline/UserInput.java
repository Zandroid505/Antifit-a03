/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package basline;

import java.util.Scanner;

public class UserInput {
    private static final Scanner input = new Scanner(System.in);
    private String word1;
    private String word2;

    public UserInput(String word1, String word2) {
        this.word1 = word1;
        this.word2 = word2;
    }

    public void askForInput() {
        // Prompt user for two strings
        // Scan in first string
        // Scan in second string
    }

    public String getWord1() {
        return word1;
    }

    public String getWord2() {
        return word2;
    }
}
