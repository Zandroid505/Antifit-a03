/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

public class Solution33 {
    public static void main(String[] args) {
        MagicEightBall mikey = new MagicEightBall();

        mikey.promptForQuestion();
        System.out.println(mikey.generateResponse(mikey.generateNumber()));
    }
}
