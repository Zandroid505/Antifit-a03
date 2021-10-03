package baseline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StatisticsCalculator {
    private static final Scanner input = new Scanner(System.in);
    private int amntOfNumbers;
    private ArrayList<Double> userNumbers= new ArrayList<>();

    public StatisticsCalculator() {
        this.amntOfNumbers = 0;
    }

    public void askForNumbers() {
        boolean continueLoop = true;
        String tempString;

        do {
            try {
                System.out.print("Enter a number: " );
                tempString = input.nextLine();

                if (tempString.equals("done" ))
                    continueLoop = false;
                else
                    addNumberToUserNumbers(Double.parseDouble(tempString));
            }
            catch(NumberFormatException numberFormatException) {
                System.out.println("Your input was incorrect. Type in another number or done to exit.");

                // Clear the input
                input.nextLine();
            }
        } while(continueLoop);

    }

    private void addNumberToUserNumbers(double number) {
        this.userNumbers.add(number);
        this.amntOfNumbers++;
    }

    public void setAmntOfNumbers(int amntOfNumbers) {
        this.amntOfNumbers = amntOfNumbers;
    }

    public ArrayList<Double> getUserNumbers() {
        return this.userNumbers;
    }

    public double average(ArrayList<Double> numberList) {
        double sum = 0;

        for(int i = 0; i < this.amntOfNumbers; i++) {
            sum += numberList.get(i);
        }

        return (double)Math.round((sum / this.amntOfNumbers) * 100) / 100;
    }

    public double min(ArrayList<Double> numberList) {
        return Collections.min(numberList);
    }

    public double max(ArrayList<Double> numberList) {
        return Collections.max(numberList);
    }

    public double std(ArrayList<Double> numberList) {
        double sum = 0;
        double squaredSum = 0;
        double stdTemp;

        for(int i = 0; i < this.amntOfNumbers; i++) {
            sum += numberList.get(i);
            squaredSum += Math.pow(numberList.get(i), 2);
        }

        stdTemp = (squaredSum - (Math.pow(sum, 2) / this.amntOfNumbers));
        stdTemp = stdTemp / (this.amntOfNumbers);
        stdTemp = Math.sqrt(stdTemp);

        return (double)Math.round(stdTemp * 100) / 100;
    }

    public void outputStatistics(double userAverage, double userMin, double userMax, double userStd, ArrayList<Double> allNumbers) {
        System.out.print("Numbers: ");
        for(int i = 0; i < this.amntOfNumbers; i++)
            System.out.printf("%6.2f, ", allNumbers.get(i));

        System.out.printf("%nThe average is %.2f%n", userAverage);
        System.out.printf("The minimum is %.2f%n", userMin);

        System.out.printf("The maximum is %.2f%n", userMax);
        System.out.printf("The standard deviation is %.2f%n", userStd);
    }
}
