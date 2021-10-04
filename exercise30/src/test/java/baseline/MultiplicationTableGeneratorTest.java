/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTableGeneratorTest {

    @Test
    void checkIfNumbersCreatedAreCorrect() {
        MultiplicationTableGenerator multiplyManny = new MultiplicationTableGenerator();

        multiplyManny.outputMultiplicationTable();
        // Element in multiplicationTable ArrayList
        assertEquals(42, multiplyManny.getMultiplicationTable().get(6*12+5));
    }
}