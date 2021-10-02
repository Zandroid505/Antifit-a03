/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

public class KarvonenHeartRateCalculator {
    private int age;
    private int restingHR;

    public KarvonenHeartRateCalculator(int age, int restingHR) {
        this.age = age;
        this.restingHR = restingHR;
    }

    public void outputTargetHR() {
        System.out.println("Resting Pulse: " + this.restingHR);
        System.out.println("Age: \n" + this.age);

        System.out.println("Intensity    | Rate");
        System.out.println("-------------|-----");
        for(int i = 55; i <= 95; i += 5)
            System.out.printf("%d%%          | %.0f bpm%n", i, calculateTargetHR(i));

    }

    public double calculateTargetHR(int intensity) {
        return Math.round((((220.0 - this.age) - this.restingHR) * (intensity / 100.0)) + this.restingHR);
    }

}
