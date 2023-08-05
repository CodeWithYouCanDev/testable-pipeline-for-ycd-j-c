package youcandev.mentoring.java_syntax._04_loops._10_sum_of_even_numbers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfEvenNumbersTest {

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
    void testSumOfEvenNumbers() {
        SumOfEvenNumbers.main(new String[]{});

        int expectedSum = 0;
        for (int i = 2; i <= 100; i += 2) {
            expectedSum += i;
        }

        assertEquals(expectedSum + "\r\n", outContent.toString());
    }
}
