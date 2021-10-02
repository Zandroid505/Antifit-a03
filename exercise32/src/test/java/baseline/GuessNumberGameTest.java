package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessNumberGameTest {

    @Test
    public void checkNumberOfGuessesForfiveAttempts() {
        GuessNumberGame dan = new GuessNumberGame();

        dan.setCurrentRandomNumber(4);

        dan.checkGuess(7);
        dan.checkGuess(2);
        dan.checkGuess(9);
        dan.checkGuess(3);
        dan.checkGuess(4);

        assertEquals(5, dan.getNumGuesses());
    }

    @Test
    public void checkNumberOfGuessesForTenAttempts() {
        GuessNumberGame dan = new GuessNumberGame();

        dan.setCurrentRandomNumber(5);

        dan.checkGuess(7);
        dan.checkGuess(2);
        dan.checkGuess(9);
        dan.checkGuess(3);
        dan.checkGuess(4);
        dan.checkGuess(7);
        dan.checkGuess(2);
        dan.checkGuess(9);
        dan.checkGuess(3);
        dan.checkGuess(5);

        assertEquals(10, dan.getNumGuesses());
    }

    public void checkNumberOfGuessesForFifteenAttempts() {
        GuessNumberGame dan = new GuessNumberGame();

        dan.setCurrentRandomNumber(1);

        dan.checkGuess(7);
        dan.checkGuess(2);
        dan.checkGuess(9);
        dan.checkGuess(3);
        dan.checkGuess(4);
        dan.checkGuess(7);
        dan.checkGuess(2);
        dan.checkGuess(9);
        dan.checkGuess(3);
        dan.checkGuess(4);
        dan.checkGuess(7);
        dan.checkGuess(2);
        dan.checkGuess(9);
        dan.checkGuess(3);
        dan.checkGuess(1);

        assertEquals(15, dan.getNumGuesses());
    }

}