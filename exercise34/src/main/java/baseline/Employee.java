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
        this.employeeList.add("John Smith");
        this.employeeList.add("Jackie Jackson");
        this.employeeList.add("Chris Jones");
        this.employeeList.add("Amanda Cullen");
        this.employeeList.add("Jeremy Goodwin");

        this.numberOfEmployees = 5;
    }

    public void outputEmployeeList() {
        System.out.printf("There are %d employees:%n", this.numberOfEmployees);

        for(int i = 0; i < this.numberOfEmployees; i++)
            System.out.println(this.employeeList.get(i));

        System.out.println();
    }

    public void removeEmployee() {
        System.out.print("Enter an employee name to remove: ");
        removeEmployeeFromList(input.nextLine());
    }

    public void removeEmployeeFromList(String employeeToTerminate) {
        // remove employeeToTerminate from employeeList
        if(this.employeeList.contains(employeeToTerminate)) {
            for(int i = 0; i < this.numberOfEmployees; i ++) {
                if(this.employeeList.get(i).equals(employeeToTerminate)) {
                    this.employeeList.remove(i);
                    this.numberOfEmployees--;
                }
            }
        } else {
            System.out.println("\nEmployee not found.\n");
        }
    }

    public void setEmployeeList(ArrayList<String> employeeList) {
        this.employeeList = employeeList;
    }
}
