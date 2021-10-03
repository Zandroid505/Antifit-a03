/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

public class Solution38 {
    public static void main(String[] args) {
        ValueFilter evenNumberLover = new ValueFilter();

        evenNumberLover.askForNumbers();

        evenNumberLover.outputEvenNumbers(evenNumberLover.filterEvenNumbers(evenNumberLover.divideString(evenNumberLover.getUserNumberString())));
    }
}
