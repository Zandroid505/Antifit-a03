/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Zakaria Antifit
 */

package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void validateInputForLessThanTwoCharacterFirstName() {
        Employee b = new Employee("b", "Jeffrey", "35678", "JB-5674");

        assertEquals("The first name must be at least 2 characters long.\n", b.validateInput());
    }

    @Test
    void validateInputForLessThanTwoCharacterLastName() {
        Employee b = new Employee("Bobby", "J", "35678", "JB-5674");

        assertEquals("The last name must be at least 2 characters long.\n", b.validateInput());
    }

    @Test
    void validateInputForBlankFirstName() {
        Employee b = new Employee("", "Jeffrey", "35678", "JB-5674");

        assertEquals("The first name must be at least 2 characters long.\nThe first name must be filled in.\n", b.validateInput());
    }

    @Test
    void validateInputForBlankLastName() {
        Employee b = new Employee("Bobby", "", "35678", "JB-5674");

        assertEquals("The last name must be at least 2 characters long.\nThe last name must be filled in.\n", b.validateInput());
    }

    @Test
    void validateInputForIncorrectZipCodeWithLetter() {
        Employee b = new Employee("Bobby", "Jeffrey", "35A34", "JB-5674");

        assertEquals("The zipcode must be a 5 digit number.\n", b.validateInput());
    }

    @Test
    void validateInputForIncorrectZipCodeWithMoreThanFiveDigits() {
        Employee b = new Employee("Bobby", "Jeffrey", "352634", "JB-5674");

        assertEquals("The zipcode must be a 5 digit number.\n", b.validateInput());
    }

    @Test
    void validateInputForIncorrectEmployeeIDFormat() {
        Employee b = new Employee("Bobby", "Jeffrey", "35678", "BJE-5674");

        assertEquals("The employee ID must be in the format of AA-1234.\n", b.validateInput());
    }


}