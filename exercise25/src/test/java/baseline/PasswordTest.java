package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordTest {

    @Test
    void checkIfPasswordStrengthMethodWorksForVeryWeakPasswords() {
        String PW = "58473";
        Password user = new Password(PW);

        int expected = 1;
        int actual = user.passwordStrength(PW);

        assertEquals(expected, actual);
    }

    @Test
    void checkIfPasswordStrengthMethodWorksForWeakPasswords() {
        String PW = "tkledhe";
        Password user = new Password(PW);

        int expected = 2;
        int actual = user.passwordStrength(PW);

        assertEquals(expected, actual);
    }

    @Test
    void checkIfPasswordStrengthMethodWorksForStrongPasswords() {
        String PW = "dfei6kdp";
        Password user = new Password(PW);

        int expected = 3;
        int actual = user.passwordStrength(PW);

        assertEquals(expected, actual);
    }

    @Test
    void checkIfPasswordStrengthMethodWorksForVeryStrongPasswords() {
        String PW = "teid$@53";
        Password user = new Password(PW);

        int expected = 4;
        int actual = user.passwordStrength(PW);

        assertEquals(expected, actual);
    }


    @Test
    void checkIfPasswordEvaluatorMethodWorksForVeryWeakPassword() {
        int PWStrength = 1;
        Password user = new Password("58473");

        String expected = "very weak password.";
        String actual = user.passwordEvaluator(PWStrength);

        assertEquals(expected, actual);
    }

    @Test
    void checkIfPasswordEvaluatorMethodWorksForWeakPassword() {
        int PWStrength = 2;
        Password user = new Password("tkledhe");

        String expected = "weak password.";
        String actual = user.passwordEvaluator(PWStrength);

        assertEquals(expected, actual);
    }

    @Test
    void checkIfPasswordEvaluatorMethodWorksForStrongPassword() {
        int PWStrength = 3;
        Password user = new Password("dfei6kdp");

        String expected = "strong password.";
        String actual = user.passwordEvaluator(PWStrength);

        assertEquals(expected, actual);
    }

    @Test
    void checkIfPasswordEvaluatorMethodWorksForVeryStrongPassword() {
        int PWStrength = 4;
        Password user = new Password("teid$@53");

        String expected = "very strong password.";
        String actual = user.passwordEvaluator(PWStrength);

        assertEquals(expected, actual);
    }
}