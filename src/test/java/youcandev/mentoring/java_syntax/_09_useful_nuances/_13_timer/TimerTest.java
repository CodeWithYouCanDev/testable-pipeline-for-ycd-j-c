package youcandev.mentoring.java_syntax._09_useful_nuances._13_timer;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.atomic.AtomicLong;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimerTest {

    @Test
    void testSetTimer() throws InterruptedException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(baos));

        AtomicLong totalSleepDuration = new AtomicLong();

        // Mocking the sleeper
        Timer.Sleeper mockSleeper = totalSleepDuration::addAndGet;

        Timer.setTimer(0, 0, 0, 1, 10, mockSleeper); // Should sum up to 1010 milliseconds

        System.setOut(originalOut);

        // Check printed messages
        String output = baos.toString().trim();
        String[] lines = output.split(System.lineSeparator());

        assertEquals("Timer started!", lines[0]);
        assertEquals("♬ ♪ ♬♬♬♬ ♪♪♪♪", lines[1]);

        // Ensure that the sleep duration is correct
        assertEquals(1010, totalSleepDuration.get(), "The sleep duration was not 1010 milliseconds");
    }

}
