package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {

    @Test
    void askForNumbersMattyMath() {
        SumCalculator mattyMath = new SumCalculator();

        mattyMath.addNumberToSum(4);
        mattyMath.addNumberToSum(7);
        mattyMath.addNumberToSum(9);
        mattyMath.addNumberToSum(2);
        mattyMath.addNumberToSum(8);

        assertEquals(30.0, mattyMath.getSum());
    }

    @Test
    void askForNumbersTraceyTrig() {
        SumCalculator traceyTrig = new SumCalculator();

        traceyTrig.addNumberToSum(1);
        traceyTrig.addNumberToSum(1);
        traceyTrig.addNumberToSum(9);
        traceyTrig.addNumberToSum(6);
        traceyTrig.addNumberToSum(5);

        assertEquals(22.0, traceyTrig.getSum());
    }
}