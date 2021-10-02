/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {
    private static final Scanner input = new Scanner(System.in);
    Random rand = new Random();
    private int currentRandomNumber;
    private int numGuesses;

    public void gameManager() {
        // boolean continueGame = true
        // int currentDifficulty = 0
        // char playGameAgain

        // print "Let's play Guess the Number!"

        // do
            // numGuesses = 0

            // try
                // print "Enter the difficulty level (1, 2, or 3): "
                // scan input into currentDifficulty
            // catch(inputMismatchException)
                // print "Only type integers. Try again."
                // clear input

            // Switch(currentDifficulty)
                // 1
                    // setCurrentRandomNumber(randomNumber 1-10)
                    // numGuesses = runGameSelection()
                // 2
                    // setCurrentRandomNumber(randomNumber 1-100)
                    // numGuesses = runGameSelection()
                // 3
                    // setCurrentRandomNumber(randomNumber 1-1000)
                    // numGuesses = runGameSelection()
            // print "You got it in 'numGuesses' guesses!"

            // print "Do you wish to play again (Y/N)? "
            // scan into playGameAgain
            // if(playGameAgain == 'N' or playGameAgain == 'n')
                // continueGame = false

        // while(continueGame)
    }

    public void setCurrentRandomNumber(int currentRandomNumber) {
        this.currentRandomNumber = currentRandomNumber;
    }

    public void runGameSelection() {
        // int numTemp
        // boolean guessIsWrong;

        // do
            // try
                // print "I have my number. What's your guess? "
                // scan into numTemp
                // guessIsWrong = checkGuess(numTemp)
            // catch(inputMismatchException)
                // print "Only type integers. Try again."
                // clear input
                // numGuessesTemp++
        // while(guessIsWrong)
    }

    public boolean checkGuess(int userGuess) {
        // numGuessesTemp++
        // if(userGuess == currentRandomNumber)
            // return false
        // else if (userGuess > currentRandomNumber)
            // print "Too high. Guess again: "
            // return true
        // else
            // print "Too low. Guess again: "
            // return true
    }

    public int getNumGuesses() {
        return numGuesses;
    }
}
