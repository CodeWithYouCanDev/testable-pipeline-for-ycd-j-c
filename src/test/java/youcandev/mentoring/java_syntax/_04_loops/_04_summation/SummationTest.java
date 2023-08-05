package youcandev.mentoring.java_syntax._04_loops._04_summation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SummationTest {

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
    void testSummation() {
        String simulatedUserInput = "5\n10\n-5\n0\nENTER\n";
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        Summation.main(new String[]{});

        String expectedOutput = "10\r\n";
        assertEquals(expectedOutput, outContent.toString(), "The summation output should be 10.");
    }
}
