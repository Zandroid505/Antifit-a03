/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class ValueFilter {
    private static final Scanner input = new Scanner(System.in);
    private String userNumberString;
    private int amntOfNumbers;
    private int amntOfEvenNumbers;
    private ArrayList<Integer> originalNumberArray = new ArrayList<>();
    private ArrayList<Integer> evenNumbers = new ArrayList<>();

    public ValueFilter() {
        this.userNumberString = "";
        this.amntOfNumbers = 0;
        this.amntOfEvenNumbers = 0;
    }

    public void askForNumbers() {
        System.out.print("Enter a list of numbers, separate by spaces: ");
        this.userNumberString = input.nextLine();
    }

    public String getUserNumberString() {
        return userNumberString;
    }

    public ArrayList<Integer> divideString(String userNumbers) {
        String[] tempStringArr = userNumbers.split(" ");
        this.amntOfNumbers = tempStringArr.length;

        for(int i = 0; i < this.amntOfNumbers; i++)
            this.originalNumberArray.add(convertStringToNumber(tempStringArr[i]));

        return this.originalNumberArray;
    }

    private int convertStringToNumber(String number) {
        int tempInt = 0;
        boolean continueLoop = false;

        do {
            try {
                tempInt = Integer.parseInt(number);
            }
            catch (NumberFormatException numberFormatException) {
                System.out.print("One of your inputs was not a number. Type in a number to replace it: ");
                number = input.nextLine();
                continueLoop = true;
            }
        } while(continueLoop);

        return tempInt;
    }

    public void setAmntOfNumbers(int amntOfNumbers) {
        this.amntOfNumbers = amntOfNumbers;
    }

    public ArrayList<Integer> filterEvenNumbers(ArrayList<Integer> originalNumberArray) {
        for(int i = 0; i < this.amntOfNumbers; i++) {
            if(originalNumberArray.get(i) % 2 == 0) {
                this.evenNumbers.add(originalNumberArray.get(i));
                this.amntOfEvenNumbers++;
            }
        }

        return this.evenNumbers;
    }

    public void outputEvenNumbers(ArrayList<Integer> evenNumberArray) {
        System.out.print("The even numbers are");
        for(int i = 0; i < this.amntOfEvenNumbers; i++)
            System.out.printf("%2d", evenNumberArray.get(i));

        System.out.println(".");
    }

}
