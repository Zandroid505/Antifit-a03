/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MagicEightBall {
    private static final Scanner input = new Scanner(System.in);
    Random rand = new Random();
    private final ArrayList<String> eightBall = new ArrayList<>();
    private String userQuestion;

    public MagicEightBall() {
      // Initialize eightBall to four possible responses
        // Initialize userQuestion to ""
    }

    public void promptForQuestion() {
        // print "What's your question?"
        // scan into userQuestion
    }

    public void generateNumber() {
        // randNum = random number 0 - 3
        // generateResponse(randNum)
    }

    public String generateResponse(int number) {
        // return eightBall(number)
    }
}
