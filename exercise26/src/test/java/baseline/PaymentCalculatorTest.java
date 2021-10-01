package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOffForBob() {
        PaymentCalculator brokeBob = new PaymentCalculator(100000, 10, 1000);

        assertEquals(213, brokeBob.calculateMonthsUntilPaidOff());
    }

    @Test
    void calculateMonthsUntilPaidOffForSteve() {
        PaymentCalculator smartSteve = new PaymentCalculator(10000, 7, 100);

        assertEquals(150, smartSteve.calculateMonthsUntilPaidOff());
    }
}