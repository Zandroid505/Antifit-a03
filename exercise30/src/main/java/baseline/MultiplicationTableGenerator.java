/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

public class MultiplicationTableGenerator {
    private int number1;
    private int number2;
    private StringBuilder multiplicationTable = new StringBuilder( );

    public MultiplicationTableGenerator() {
        this.number1 = 1;
        this.number2 = 12;
    }

    public void outputMultiplicationTable() {
        int tempInt;

        for(int i = number1; i <= number2; i++) {
            for (int j = number1; j <= number2; j++) {
                tempInt = i * j;

                if(j != 12) {
                    //multiplicationTable.append("    " );
                }
                System.out.printf("%4d", tempInt);


                multiplicationTable.append(tempInt);
            }
            System.out.println();
            multiplicationTable.append("\n");
        }
    }

    public StringBuilder getMultiplicationTable() {
        return multiplicationTable;
    }
}
