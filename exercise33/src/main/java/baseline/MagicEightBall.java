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
    private Random rand = new Random();
    private final ArrayList<String> eightBall = new ArrayList<>();
    private String userQuestion;

    public MagicEightBall() {
      // Initialize eightBall to four possible responses
        this.eightBall.add("Yes.");
        this.eightBall.add("No.");
        this.eightBall.add("Maybe.");
        this.eightBall.add("Ask again later.");

        this.userQuestion = "";
    }

    public void promptForQuestion() {
        System.out.println("What's your question?");
        this.userQuestion = input.nextLine();
    }

    public int generateNumber() {
        return rand.nextInt(3);
    }

    public String generateResponse(int number) {
        return this.eightBall.get(number);
    }
}
