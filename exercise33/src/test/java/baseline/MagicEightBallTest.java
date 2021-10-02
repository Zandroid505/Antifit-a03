package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MagicEightBallTest {
    MagicEightBall magician = new MagicEightBall();
    ArrayList<String> eightBall = new ArrayList<>();

    @Test
    void generateResponse1() {
        eightBall.add("Yes.");
        eightBall.add("No.");
        eightBall.add("Maybe.");
        eightBall.add("Ask again later.");

        assertEquals(eightBall.get(0), magician.generateResponse(0));
    }

    @Test
    void generateResponse2() {
        eightBall.add("Yes.");
        eightBall.add("No.");
        eightBall.add("Maybe.");
        eightBall.add("Ask again later.");

        assertEquals(eightBall.get(1), magician.generateResponse(1));
    }

    @Test
    void generateResponse3() {
        eightBall.add("Yes.");
        eightBall.add("No.");
        eightBall.add("Maybe.");
        eightBall.add("Ask again later.");

        assertEquals(eightBall.get(2), magician.generateResponse(2));
    }

    @Test
    void generateResponse4() {
        eightBall.add("Yes.");
        eightBall.add("No.");
        eightBall.add("Maybe.");
        eightBall.add("Ask again later.");

        assertEquals(eightBall.get(3), magician.generateResponse(3));
    }
}