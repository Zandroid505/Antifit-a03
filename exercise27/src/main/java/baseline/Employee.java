package baseline;

public class Employee {
    private String firstName;
    private String lastName;
    private String zipCode;
    private String employeeID;

    public Employee(String firstName, String lastName, String zipCode, String employeeID) {
        // Intialize fields to userInput
    }

    public String validateInput() {
        // firstNameNotFilledIn = ""
        // lastNameNotFilledIn = ""
        // firstNameLessThanTwoChar = ""
        // lastNameLessThanTwoChar = ""
        // employeeIDFormatWrong = ""
        // zipCodeNotNum = ""
        // int numErrors = 0

        //if(Call checkIfNameIsFilledIn(firstName) for firstName isn't correct)
            // firstNameNotFilledIn = "The first name must be filled in."
            // numErrors++

        //if(Call checkIfNameIsFilledIn(lastName) for lastName isn't correct)
            // lastNameNotFilledIn = "The last name must be filled in."
            // numErrors++

        //if(Call checkIfNameIsMoreThanTwoCharactersLong(firstName) for firstName isn't correct)
            // firstNameLessThanTwoChar = "The first name must be at least 2 characters long."
            // numErrors++

        //if(Call checkIfNameIsMoreThanTwoCharactersLong(firstName) for lastName isn't correct)
            // lastNameLessThanTwoChar = "The last name must be at least 2 characters long."
            // numErrors++

        // if(Call checkIfEmployeeIDIsCorrectFormat() for employeeID isn't correct)
            // employeeIDFormatWrong = "The employee ID must be in the format of AA-1234."
            // numErrors++

        // if(Call checkIfZipCodeFormatIsCorrect() for zipCode isn't correct)
            // zipCodeNotFormatWrong = "The zipcode must be a 5 digit number."
            // numErrors++

        // if(numErrors > 0)
            // outputMessage = "'firstNameNotFilledIn' + 'lastNameNotFilledIn' + 'firstNameLessThanTwoChar' + 'lastNameLessThanTwoChar'
                                                                    // + 'employeeIDFormatWrong' + 'zipCodeNotNum'
        // else
            // outputMessage = "There were no errors found"

        // return outputMessage
    }

    private boolean checkIfNameIsFilledIn(String name) {
        // if(string is empty)
            // return false
        // else
            // return true
    }

    private boolean checkIfNameIsMoreThanTwoCharactersLong() {
        // if(string is less than two characters)
            // return false
        // else
            // return true
    }

    private boolean checkIfEmployeeIDIsCorrectFormat() {
        // arrTemp = employeeID
        // for(iterate through first two characters to confirm they are letters)
            // if(not letter)
                // return false

        // if(third character is != '-')
            //return false

        // for(iterate through last four characters to confirm they are numbers)
            // if(not number)
            // return false

        // return true
    }

    private boolean checkIfZipCodeFormatIsCorrect() {
        // if(zipCode length != 5)
            // return false
        // if(zipCode is not a number)
            // return false

        // return true

    }
}
