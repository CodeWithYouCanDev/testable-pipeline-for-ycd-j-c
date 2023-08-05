package youcandev.mentoring.java_syntax._04_loops._15_even_numbers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EvenNumbersTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testPrintedEvenNumbers() {
        EvenNumbers.main(new String[]{});

        String expected = "2\r\n4\r\n6\r\n8\r\n10\r\n12\r\n14\r\n";
        assertEquals(expected, outContent.toString());
    }
}
