/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RandomWinnerGameTest {

    @Test
    void checkIfNamesAreAddedToArrayListCorrectly() {
        RandomWinnerGame tester1 = new RandomWinnerGame();
        ArrayList<String> expected = new ArrayList<>();
        ArrayList<String> actual = new ArrayList<>();

        expected.add("Tommy");
        expected.add("Samy");
        expected.add("Sally");

        tester1.addNameToList("Tommy");
        tester1.addNameToList("Samy");
        tester1.addNameToList("Sally");

        assertEquals(expected, actual);
    }

    @Test
    void checkIfRandomNumberGeneratorDoesntChooseIndexOutOfBounds() {
        RandomWinnerGame tester2 = new RandomWinnerGame();
        tester2.setNumberOfContestants(8);

        int actual = tester2.generateRandomNumber();

        assertTrue(actual >= 0 && actual < 8);
    }

    @Test
    void selectWinner() {
        RandomWinnerGame tester3 = new RandomWinnerGame();
        ArrayList<String> testArr = new ArrayList<>();

        testArr.add("Tommy");
        testArr.add("Samy");
        testArr.add("Sally");

        assertEquals("Samy", tester3.selectWinner(1));
    }
}