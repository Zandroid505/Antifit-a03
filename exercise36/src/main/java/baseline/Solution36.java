/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

public class Solution36 {
    public static void main(String[] args) {
        StatisticsCalculator scientist = new StatisticsCalculator();

        scientist.askForNumbers();

        scientist.outputStatistics(scientist.average(scientist.getUserNumbers()), scientist.min(scientist.getUserNumbers()),
                                    scientist.max(scientist.getUserNumbers()), scientist.std(scientist.getUserNumbers()),
                                                    scientist.getUserNumbers());
    }
}
