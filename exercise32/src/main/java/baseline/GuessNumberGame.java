/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    private static final Scanner input = new Scanner(System.in);
    Random rand = new Random();
    private int currentRandomNumber;
    private int numGuesses;

    public void gameManager() {
        boolean continueGame = true;
        int currentDifficulty = 0;
        String playGameAgain = "";

        System.out.println("Let's play Guess the Number!\n");

        do {
            this.numGuesses = 0;

            try {
                System.out.print("Enter the difficulty level (1, 2, or 3): " );
                currentDifficulty = input.nextInt();

                switch (currentDifficulty) {
                    case 1:
                        setCurrentRandomNumber(rand.nextInt(10) + 1);
                        runGameSelection();
                        break;
                    case 2:
                        setCurrentRandomNumber(rand.nextInt(100) + 1);
                        runGameSelection();
                        break;
                    case 3:
                        setCurrentRandomNumber(rand.nextInt(1000) + 1);
                        runGameSelection();
                        break;
                    default:
                        break;
                }
                System.out.printf("You got it in %d guess(es)%n", getNumGuesses());

                System.out.print("Do you wish to play again (Y/N)? " );

                // clear input
                input.nextLine();
                playGameAgain = input.nextLine();

                if (playGameAgain.equals("N" ) || playGameAgain.equals("n" ))
                    continueGame = false;
            }
            catch (InputMismatchException inputMismatchException) {
                    System.out.println("Only type integers. Try again." );

                    // clear input
                    input.nextLine();
                }

        } while(continueGame);

    }

    public void setCurrentRandomNumber(int currentRandomNumber) {
        this.currentRandomNumber = currentRandomNumber;
    }

    private void runGameSelection() {
        int numTemp;
        boolean guessIsWrong = true;

        System.out.println("I have my number. What's your guess? " );
        do {
            try {
                numTemp = input.nextInt();
                guessIsWrong = checkGuess(numTemp);
            }
            catch (InputMismatchException inputMismatchException) {
                System.out.println("Only type integers. Try again.");

                // clear input
                input.nextLine();
                this.numGuesses++;
            }
        } while(guessIsWrong);
    }

    public boolean checkGuess(int userGuess) {
        this.numGuesses++;
        if(userGuess == this.currentRandomNumber)
            return false;
        else if (userGuess > currentRandomNumber) {
            System.out.println("Too high. Guess again: ");
           return true;
        }
        else {
            System.out.println("Too low. Guess again: " );
            return true;
        }
    }

    public int getNumGuesses() {
        return numGuesses;
    }
}
