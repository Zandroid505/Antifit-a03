/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

public class KarvonenHeartRateCalculator {
    private int age;
    private int restingHR;

    public KarvonenHeartRateCalculator() {
        // Intialize fields to userInput
    }

    public void outputTargetHR() {
        // print "Resting Pulse: 'restingHR'"
        // print "Age: 'age'"

        // print "Intensity    | Rate"
        // print "-------------|-----"
        // print "55%
        // for(i = 55% to 95%)
            // print "'i'%----------| calculateTargetHR(i)"

    }

    public int calculateTargetHR(int intensity) {
        // return(((220 - age) - restingHR) * (intensity / 100)) + restingHR
    }

}
