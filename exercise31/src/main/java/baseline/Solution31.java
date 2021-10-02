/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

public class Solution31 {
    public static void main(String[] args) {
        UserInput bobbyInfo = new UserInput();

        bobbyInfo.askForUserInfo();

        KarvonenHeartRateCalculator bobby = new KarvonenHeartRateCalculator(bobbyInfo.getAge(), bobbyInfo.getRestingHR());
        bobby.outputTargetHR();

    }
}
