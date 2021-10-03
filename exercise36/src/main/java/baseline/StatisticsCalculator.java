package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class StatisticsCalculator {
    private static final Scanner input = new Scanner(System.in);
    private int amntOfNumbers;
    private ArrayList<Double> userNumbers= new ArrayList<Double>();

    public StatisticsCalculator() {
        this.amntOfNumbers = 0;
    }

    public void askForNumbers() {
        // continueLoop = true
        // stringTemp
        // do
            // try
                // print "Enter a number: "
                // scan into tempString
                // if(tempString == "done")
                    //continueLoop = false
                // else
                    // addNumberToUserNumbers(parseDouble(stringTemp))
            // catch(NumberFormatException)
                // print "Your input was incorrect. Type in another number or done to exit."
        //while(continueLoop)
    }

    private void addNumberToUserNumbers(int number) {
        // add number to userNumbers
        // amntOfNumbers++
    }

    public void setAmntOfNumbers(int amntOfNumbers) {
        this.amntOfNumbers = amntOfNumbers;
    }

    public ArrayList<Double> getUserNumbers() {
        return userNumbers;
    }

    public double average(ArrayList<Double> numberList) {
        // sum
        //for(amntOfNumbers)
            // sum += numberList[i]

        // return (double)Math.round((sum / amntOfNumbers) * 100) / 100
    }

    public double min(ArrayList<Double> numberList) {
        // return minimum number in numberList
    }

    public double max(ArrayList<Double> numberList) {
        // return maximum number in numberList
    }

    public double std(ArrayList<Double> numberList) {
        // sum
        // squaredSum

        //for(amntOfNumbers)
            // sum += numberList[i]

        //for(amntOfNumbers)
            // squaredSum += (numberList[i])^2

        // return (double)Math.round((squaredSum - ((sum)^2/amntOfNumbers)) / (amntOfNumbers - 1)) * 100) / 100
    }

    public void outputStatistics(double userAverage, double userMin, double userMax, double userStd) {
        // print "The average is 'average'"
        // print "The minimum is 'min'"
        // print "The maximum is 'max'"
        // print "The standard deviation is 'std'"
    }
}
