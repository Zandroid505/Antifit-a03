/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import java.util.ArrayList;

public class MultiplicationTableGenerator {
    private int number1;
    private int number2;
    private ArrayList<Integer> multiplicationTable = new ArrayList<>();

    public MultiplicationTableGenerator() {
        this.number1 = 1;
        this.number2 = 12;
    }

    public void outputMultiplicationTable() {
        int tempInt;

        for(int i = number1; i <= number2; i++) {
            for (int j = number1; j <= number2; j++) {
                tempInt = i * j;

                this.multiplicationTable.add(tempInt);
                System.out.printf("%4d", tempInt);
            }
            System.out.println();
        }
    }

    public ArrayList<Integer> getMultiplicationTable() {
        return this.multiplicationTable;
    }
}
