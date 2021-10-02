/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleInvestmentCalculatorTest {

    @Test
    public void calculateRateOfReturnForJeff() {
        DoubleInvestmentCalculator jeff = new DoubleInvestmentCalculator();

        jeff.calculateRateOfReturn(3);
        assertEquals(24, jeff.getYears());
    }

    @Test
    public void calculateRateOfReturnForHannah() {
        DoubleInvestmentCalculator hannah = new DoubleInvestmentCalculator();

        hannah.calculateRateOfReturn(7);
        assertEquals(11, hannah.getYears());
    }

}