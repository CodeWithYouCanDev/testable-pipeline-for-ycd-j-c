package youcandev.mentoring.java_syntax._04_loops._09_not_divisible_by_3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NotDivisibleBy3Test {

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
    void testSumNotDivisibleBy3() {
        NotDivisibleBy3.main(new String[]{});

        int expectedSum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 != 0) {
                expectedSum += i;
            }
        }

        assertEquals(expectedSum + "\r\n", outContent.toString());
    }
}
