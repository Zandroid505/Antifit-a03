/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import java.util.Scanner;

public class UserInput {
    private static final Scanner input = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private String zipCode;
    private String employeeID;

    public UserInput() {
        // Initialize all variable to ""
        this.firstName = "";
        this.lastName = "";
        this.zipCode = "";
        this.employeeID = "";

    }

    public void promptForEmployeeInfo() {
        // print "Enter the first name: "
        System.out.print("Enter the first name: ");
        // scan in firstName
        this.firstName = input.nextLine();

        // print "Enter the last name: "
        System.out.print("Enter the last name: ");
        // scan in lastName
        this.lastName = input.nextLine();

        // print "Enter the ZIP code: "
        System.out.print("Enter the ZIP code: ");
        // scan in zipCode
        this.zipCode = input.nextLine();

        // print "Enter the employee ID: "
        System.out.print("Enter the employee ID: ");
        // scan in employeeID
        this.employeeID = input.nextLine();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getEmployeeID() {
        return employeeID;
    }
}
