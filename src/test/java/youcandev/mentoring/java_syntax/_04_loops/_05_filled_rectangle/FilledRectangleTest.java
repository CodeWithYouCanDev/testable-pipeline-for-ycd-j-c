package youcandev.mentoring.java_syntax._04_loops._05_filled_rectangle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FilledRectangleTest {

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
    void testFilledRectangle() {
        FilledRectangle.main(new String[]{});

        String expectedOutput = "QQQQQQQQQQ\r\n" +
                "QQQQQQQQQQ\r\n" +
                "QQQQQQQQQQ\r\n" +
                "QQQQQQQQQQ\r\n" +
                "QQQQQQQQQQ\r\n";

        assertEquals(expectedOutput, outContent.toString(), "The rectangle's output should match the expected format.");
    }
}
