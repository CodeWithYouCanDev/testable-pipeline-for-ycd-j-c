package youcandev.mentoring.java_syntax._09_useful_nuances._11_countdown_with_delay;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringTokenizer;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountdownWithDelayTest {

    @Test
    void testCountDown() throws InterruptedException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(baos));

        long startTime = System.currentTimeMillis();
        CountdownWithDelay.countDown();
        long endTime = System.currentTimeMillis();

        System.setOut(originalOut);
        String output = baos.toString();

        StringTokenizer tokenizer = new StringTokenizer(output, System.lineSeparator());
        assertEquals("3", tokenizer.nextToken().trim());
        assertEquals("2", tokenizer.nextToken().trim());
        assertEquals("1", tokenizer.nextToken().trim());
        assertEquals("Start!", tokenizer.nextToken().trim());

        // Ensure that it took approximately 3 seconds (with a small margin for execution delay)
        long duration = endTime - startTime;
        assertTrue(duration >= 3000 && duration < 3100);
    }

    private void assertTrue(boolean condition) {
        if (!condition) {
            throw new AssertionError("Condition not true");
        }
    }
}
