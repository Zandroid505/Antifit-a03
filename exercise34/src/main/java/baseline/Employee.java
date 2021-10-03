/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    private static final Scanner input = new Scanner(System.in);
    private ArrayList<String> employeeList = new ArrayList<>();
    private int numberOfEmployees;

    public Employee() {
        //Intialize personnel
        //Intialize numberOfEmployees
    }

    public void outputEmployeeList() {
        // print "There are 'numberOfEmployees':"
        // print "'employeeList'"
    }

    public void removeEmployee() {
        // print "Enter an employee name to remove: "
        // tempString = userInput
        // removeEmployee(tempString)
        // numberOfEmployees--
        // return employeeList
    }

    public void removeEmployeeFromList(String employeeToTerminate) {
        // remove employeeToTerminate from employeeList
    }

    public void setEmployeeList(ArrayList<String> employeeList) {
        this.employeeList = employeeList;
    }
}
