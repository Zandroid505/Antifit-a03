package baseline;

public class Employee {
    private String firstName;
    private String lastName;
    private String zipCode;
    private String employeeID;

    public Employee(String firstName, String lastName, String zipCode, String employeeID) {
        // Intialize fields to userInput
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
        this.employeeID = employeeID;
    }

    public String validateInput() {
        String firstNameNotFilledIn = "";
        String lastNameNotFilledIn = "";
        String firstNameLessThanTwoChar = "";
        String lastNameLessThanTwoChar = "";
        String employeeIDFormatWrong = "";
        String zipCodeFormatWrong = "";
        String outputMessage;
        int numErrors = 0;

        if(checkIfNameIsEmpty(this.firstName)) {
            firstNameNotFilledIn = "The first name must be filled in.\n";
            numErrors++;
        }

        if(checkIfNameIsEmpty(this.lastName)) {
            lastNameNotFilledIn = "The last name must be filled in.\n";
            numErrors++;
        }

        if(checkIfNameIsLessThanTwoChars(this.firstName)) {
            firstNameLessThanTwoChar = "The first name must be at least 2 characters long.\n";
            numErrors++;
        }

        if(checkIfNameIsLessThanTwoChars(this.lastName)) {
            lastNameLessThanTwoChar = "The last name must be at least 2 characters long.\n";
            numErrors++;
        }

        if(checkIfEmployeeIDFormatIsIncorrect()) {
            employeeIDFormatWrong = "The employee ID must be in the format of AA-1234.\n";
            numErrors++;
        }

        if(checkIfZipCodeFormatIsIncorrect()) {
            zipCodeFormatWrong = "The zipcode must be a 5 digit number.\n";
            numErrors++;
        }

        if(numErrors > 0) {
            outputMessage = firstNameLessThanTwoChar + lastNameLessThanTwoChar + firstNameNotFilledIn
                            + lastNameNotFilledIn + employeeIDFormatWrong + zipCodeFormatWrong;
        } else {
            outputMessage = "There were no errors found.\n";
        }

        return outputMessage;
    }

    private boolean checkIfNameIsEmpty(String name) {
        if(name.isEmpty())
            return true;
        else
            return false;
    }

    private boolean checkIfNameIsLessThanTwoChars(String name) {
        if(name.length() < 2)
            return true;
        else
            return false;
    }

    private boolean checkIfEmployeeIDFormatIsIncorrect() {
        for(int i = 0; i < 2; i++) {
            if (!((this.employeeID.charAt(i) >= 'a' && this.employeeID.charAt(i) <= 'z')
                    || (this.employeeID.charAt(i) >= 'A' && this.employeeID.charAt(i) <= 'Z'))) {
                return true;
            }
        }

        if(this.employeeID.charAt(2) != '-')
            return true;

        for(int i = 3; i < 7; i++) {
            if (!(this.employeeID.charAt(i) >= '0' && this.employeeID.charAt(i) <= '9')) {
                return true;
            }
        }

        return false;
    }

    private boolean checkIfZipCodeFormatIsIncorrect() {
        if(this.zipCode.length() != 5)
            return true;

        for(int i = 0; i < 5; i++) {
            if(!(this.zipCode.charAt(i) >= '0' && this.zipCode.charAt(i) <= '9')) {
                return true;
            }
        }

        return false;

    }
}
