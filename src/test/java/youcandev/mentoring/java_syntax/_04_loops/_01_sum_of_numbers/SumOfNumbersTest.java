package youcandev.mentoring.java_syntax._04_loops._01_sum_of_numbers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfNumbersTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    private void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @Test
    void testSumForNumber5() {
        provideInput("5\n");
        SumOfNumbers.main(new String[]{});
        assertEquals("15\r\n", outContent.toString());
    }

    @Test
    void testSumForNumber0() {
        provideInput("0\n");
        SumOfNumbers.main(new String[]{});
        assertEquals("0\r\n", outContent.toString());
    }

    @Test
    void testSumForNegativeNumber() {
        provideInput("-3\n");
        SumOfNumbers.main(new String[]{});
        assertEquals("0\r\n", outContent.toString());
    }
}
