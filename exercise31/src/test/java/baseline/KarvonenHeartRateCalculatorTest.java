package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KarvonenHeartRateCalculatorTest {

    @Test
    void calculateTargetHRAtIntensity55() {
        KarvonenHeartRateCalculator danTheRunner = new KarvonenHeartRateCalculator(35, 70);

        assertEquals(133,danTheRunner.calculateTargetHR(95));
    }

    @Test
    void calculateTargetHRAtIntensity70() {
        KarvonenHeartRateCalculator danTheRunner = new KarvonenHeartRateCalculator(35, 70);

        assertEquals(150,danTheRunner.calculateTargetHR(70));
    }

    @Test
    void calculateTargetHRAtIntensity95() {
        KarvonenHeartRateCalculator danTheRunner = new KarvonenHeartRateCalculator(35, 70);

        assertEquals(179,danTheRunner.calculateTargetHR(95));
    }
}