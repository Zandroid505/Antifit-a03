package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void removeEmployeeFromList1() {
        Employee manager = new Employee();
        ArrayList<String> actual = new ArrayList<>();
        ArrayList<String> expected = new ArrayList<>();

        actual.add("Gerald Clayton");
        actual.add("Bugs Bunny");
        actual.add("Wes Montgomery");
        actual.add("Gon Freecss");
        actual.add("Kobe Thompson");

        expected.add("Gerald Clayton");
        expected.add("Bugs Bunny");
        expected.add("Wes Montgomery");
        expected.add("Gon Freecss");

        manager.setEmployeeList(actual);
        manager.removeEmployeeFromList("Kobe Thompson");

        assertEquals(expected, actual);
    }

    @Test
    void removeEmployeeFromList2() {
        Employee manager = new Employee();
        ArrayList<String> actual = new ArrayList<>();
        ArrayList<String> expected = new ArrayList<>();

        actual.add("Gerald Clayton");
        actual.add("Bugs Bunny");
        actual.add("Wes Montgomery");
        actual.add("Gon Freecss");
        actual.add("Kobe Thompson");

        expected.add("Gerald Clayton");
        expected.add("Wes Montgomery");
        expected.add("Gon Freecss");
        expected.add("Kobe Thompson");

        manager.setEmployeeList(actual);
        manager.removeEmployeeFromList("Bugs Bunny");

        assertEquals(expected, actual);
    }
}