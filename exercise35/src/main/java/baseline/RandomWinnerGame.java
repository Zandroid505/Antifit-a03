/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomWinnerGame {
    private Random rand = new Random();
    private static final Scanner input = new Scanner(System.in);
    private ArrayList<String> contestants = new ArrayList<>();
    private int numberOfContestants;

    public void gameManager() {
        // tempString
        // continueLoop = true

        // do
            //print "Enter a name: "
            // scan into tempString
            //if(string is empty)
                // continueLoop = false
            //else
                // addNameToList(tempString)
        // while(continueLoop)
    }

    public void addNameToList(String name) {
        // Add name to contestants
        // numberOfContestants++
    }

    public int generateRandomNumber() {
        //return randomNumber: 0 - (numberOfContestants - 1)
    }

    public String selectWinner(int winnerIndex) {
        // return contestants(winnerIndex)
    }

    public void displayWinner(String winner) {
        // print "The winner is...'winner'"
    }

    public void setNumberOfContestants(int numberOfContestants) {
        this.numberOfContestants = numberOfContestants;
    }
}
