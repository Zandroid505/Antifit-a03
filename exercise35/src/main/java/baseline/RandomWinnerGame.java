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

    public RandomWinnerGame() {
        this.numberOfContestants = 0;
    }

    public void gameManager() {
        String tempString;
        boolean continueLoop = true;

        do {
            System.out.print("Enter a name: ");
            tempString = input.nextLine();
            if(tempString.isEmpty())
                continueLoop = false;
            else
                addNameToList(tempString);
        } while(continueLoop);
    }

    public void addNameToList(String name) {
        // Add name to contestants
        this.contestants.add(name);
        this.numberOfContestants++;
    }

    public int generateRandomNumber() {
        return rand.nextInt(numberOfContestants);
    }

    public String selectWinner(int winnerIndex) {
        return this.contestants.get(winnerIndex);
    }

    public void displayWinner(String winner) {
        System.out.println("The winner is... " + winner);
    }

    public void setNumberOfContestants(int numberOfContestants) {
        this.numberOfContestants = numberOfContestants;
    }

    public ArrayList<String> getContestants() {
        return contestants;
    }
}
