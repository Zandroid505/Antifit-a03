package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {

    @Test
    void askForNumbersMattyMath() {
        SumCalculator mattyMath = new SumCalculator();

        mattyMath.addNumbersToSum(4);
        mattyMath.addNumbersToSum(7);
        mattyMath.addNumbersToSum(9);
        mattyMath.addNumbersToSum(2);
        mattyMath.addNumbersToSum(8);

        assertEquals(30, mattyMath.getSum());
    }

    @Test
    void askForNumbersTraceyTrig() {
        SumCalculator traceyTrig = new SumCalculator();

        traceyTrig.addNumbersToSum(4);
        traceyTrig.addNumbersToSum(7);
        traceyTrig.addNumbersToSum(9);
        traceyTrig.addNumbersToSum(2);
        traceyTrig.addNumbersToSum(8);

        assertEquals(30, traceyTrig.getSum());
    }
}