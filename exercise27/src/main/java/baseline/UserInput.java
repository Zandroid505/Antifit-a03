package baseline;

import java.util.Scanner;

public class UserInput {
    private static final Scanner input = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private int zipCode;
    private String employeeID;

    public UserInput() {
        // Intialize all variable to "" or 0
    }

    public void promptForEmployeeInfo() {
        // print "Enter the first name: "
        // scan in firstName

        // print "Enter the last name: "
        // scan in lastName

        // print "Enter the ZIP code: "
        // scan in zipCode

        // print "Enter the employee ID: "
        // scan in employeeID
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getEmployeeID() {
        return employeeID;
    }
}
