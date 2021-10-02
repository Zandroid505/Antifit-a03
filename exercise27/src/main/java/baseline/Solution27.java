/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

public class Solution27 {
    public static void main(String[] args) {
        UserInput employeeInfo = new UserInput();

        // Call prompt and scan in employee information
        employeeInfo.promptForEmployeeInfo();

        // Create employee object with userInput
        Employee employee1 = new Employee(employeeInfo.getFirstName(), employeeInfo.getLastName(),
                                    employeeInfo.getZipCode(), employeeInfo.getEmployeeID());

        System.out.print(employee1.validateInput());
    }
}
