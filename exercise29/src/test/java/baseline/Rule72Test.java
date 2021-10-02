package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Rule72Test {

    @Test
    public void calculateRateOfReturnForJeff() {
        Rule72 jeff = new Rule72();

        jeff.calculateRateOfReturn(3);
        assertEquals(24, jeff.getYears());
    }

    @Test
    public void calculateRateOfReturnForHannah() {
        Rule72 hannah = new Rule72();

        hannah.calculateRateOfReturn(3);
        assertEquals(24, hannah.getYears());
    }

}