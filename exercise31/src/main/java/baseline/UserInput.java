/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    private static final Scanner input = new Scanner(System.in);
    private int age;
    private int restingHR;

    public UserInput() {
        this.age = 0;
        this.restingHR = 0;
    }

    public void askForUserInfo() {
        boolean continueLoop = true;
        do {
            try {
                System.out.print("How old are you? " );
                this.age = input.nextInt();

                System.out.print("What is your resting heart rate? " );
                this.restingHR = input.nextInt();

                continueLoop = false;
            } catch (InputMismatchException inputMismatchException) {
                input.nextLine(); // Discard input
                System.out.println("You must enter only numbers. Try again." );
            }
        } while(continueLoop);
    }

    public int getAge() {
        return this.age;
    }

    public int getRestingHR() {
        return this.restingHR;
    }
}
