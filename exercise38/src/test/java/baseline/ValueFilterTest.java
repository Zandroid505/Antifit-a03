package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ValueFilterTest {

    @Test
    void checkIfMethodDividesStringAndConvertsToNumbers() {
        ValueFilter user = new ValueFilter();
        ArrayList<Integer> actual = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        String testString = "3 9 7 5 6 2";

        actual = user.divideString(testString);

        expected.add(3);
        expected.add(9);
        expected.add(7);
        expected.add(5);
        expected.add(6);
        expected.add(2);

        assertEquals(expected, actual);

    }

    @Test
    void checkIfMethodReturnsEvenNumbersInArray() {
        ValueFilter user = new ValueFilter();
        ArrayList<Integer> actual = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();

        actual.add(3);
        actual.add(9);
        actual.add(7);
        actual.add(5);
        actual.add(6);
        actual.add(2);

        actual = user.filterEvenNumbers(actual);

        expected.add(6);
        expected.add(2);

        assertEquals(expected, actual);
    }
}