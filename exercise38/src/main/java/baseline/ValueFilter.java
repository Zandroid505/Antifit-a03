package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class ValueFilter {
    private static final Scanner input = new Scanner(System.in);
    private String userNumbers;
    private int amntOfNumbers;
    private ArrayList<Integer> originalNumbers = new ArrayList<>();
    private ArrayList<Integer> evenNumbers = new ArrayList<>();

    public ValueFilter() {
        this.userNumbers = "";
        this.amntOfNumbers = 0;
    }

    public void askForNumbers() {
        // print "Enter a list of numbers, separate by spaces: "
        // scan input into userNumbers
    }

    public String getUserNumbers() {
        return userNumbers;
    }

    public ArrayList<Integer> divideString(String userNumbers) {
        // tempStringArr = userNumbers.split(" ")
        // amntOfNumbers = length of tempStringArr

        // for(amntOfNumbers)
            // numberTemp = convertStringToNumber(part of userNumbers)
            // add numberTemp to originalNumbers

        // return originalNumbers
    }

    private int convertStringToNumber(String number) {
        // tempInt
        // continueLoop = false

        // do
            // try
                // tempInt = parse String to int
                // return tempInt
            // Catch(NumberFormatException)
                // print "One of your inputs was not a number. Type in a number to replace it"
                // number = userInput
                // continueLoop = true
        // while(continueLoop)
    }

    public ArrayList<Integer> getOriginalNumbers() {
        return originalNumbers;
    }

    public ArrayList<Integer> filterEvenNumbers(ArrayList<Integer> originalNumberArray) {
        // for(amntOfNumbers)
            // if(originalNumberArray[i] % 2 == 0)
                // add originalNumberArray[i] to evenNumbers

        // return evenNumbers
    }

    public ArrayList<Integer> getEvenNumbers() {
        return evenNumbers;
    }

    public void outputEvenNumbers() {
        // print "The even numbers are "
        // for(amntOfNumbers)
            // print "evenNumbers[i] "
    }

}
