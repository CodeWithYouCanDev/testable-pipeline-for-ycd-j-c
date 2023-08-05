package youcandev.mentoring.java_syntax._04_loops._06_unfilled_rectangle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UnfilledRectangleTest {

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
    void testUnfilledRectangle() {
        UnfilledRectangle.main(new String[]{});

        String expectedOutput = "BBBBBBBBBBBBBBBBBBBB\r\n" +
                "B                  B\r\n" +
                "B                  B\r\n" +
                "B                  B\r\n" +
                "B                  B\r\n" +
                "B                  B\r\n" +
                "B                  B\r\n" +
                "B                  B\r\n" +
                "B                  B\r\n" +
                "BBBBBBBBBBBBBBBBBBBB\r\n";

        assertEquals(expectedOutput, outContent.toString(), "The rectangle's output should match the expected format.");
    }
}
