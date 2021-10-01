package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void validateInputForLessThanTwoCharacterFirstName() {
        Employee b = new Employee("b", "Jeffrey", "35678", "JB-5674");

        assertEquals(b.validateInput(), "The first name must be at least 2 characters long.");
    }

    @Test
    void validateInputForLessThanTwoCharacterLastName() {
        Employee b = new Employee("Bobby", "J", "35678", "JB-5674");

        assertEquals(b.validateInput(), "The last name must be at least 2 characters long.");
    }

    @Test
    void validateInputForBlankFirstName() {
        Employee b = new Employee("", "Jeffrey", "35678", "JB-5674");

        assertEquals(b.validateInput(), "The first name must be filled in.");
    }

    @Test
    void validateInputForBlankLastName() {
        Employee b = new Employee("Bobby", "", "35678", "JB-5674");

        assertEquals(b.validateInput(), "The last name must be filled in.");
    }

    @Test
    void validateInputForIncorrectZipCodeWithLetter() {
        Employee b = new Employee("Bobby", "Jeffrey", "35A34", "JB-5674");

        assertEquals(b.validateInput(), "The zipcode must be a 5 digit number.");
    }

    @Test
    void validateInputForIncorrectZipCodeWithMoreThanFiveDigits() {
        Employee b = new Employee("Bobby", "Jeffrey", "352634", "JB-5674");

        assertEquals(b.validateInput(), "The zipcode must be a 5 digit number.");
    }

    @Test
    void validateInputForIncorrectEmployeeIDFormat() {
        Employee b = new Employee("Bobby", "Jeffrey", "352634", "BJE-5674");

        assertEquals(b.validateInput(), "The employee ID must be in the format of AA-1234.");
    }


}