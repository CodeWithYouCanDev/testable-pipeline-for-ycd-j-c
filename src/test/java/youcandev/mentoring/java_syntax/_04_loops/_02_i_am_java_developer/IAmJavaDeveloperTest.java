package youcandev.mentoring.java_syntax._04_loops._02_i_am_java_developer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class IAmJavaDeveloperTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testPrintJobHundredTimes() {
        IAmJavaDeveloper.main(new String[]{});

        long count = outContent.toString()
                .lines()
                .filter(line -> "Jestem Java Developerem".equals(line))
                .count();

        assertTrue(count == 100, "The message 'Jestem Java Developerem' should be printed 100 times.");
    }
}
