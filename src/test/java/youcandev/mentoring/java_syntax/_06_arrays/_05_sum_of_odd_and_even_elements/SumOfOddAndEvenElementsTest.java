package youcandev.mentoring.java_syntax._06_arrays._05_sum_of_odd_and_even_elements;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfOddAndEvenElementsTest {

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
    void testSumsOfOddAndEvenElements() {
        // Act
        SumOfOddAndEvenElements.main(new String[]{});

        // Sum of even numbers from 11 to 20 is 12 + 14 + 16 + 18 + 20 = 80
        // Sum of odd numbers from 11 to 20 is 11 + 13 + 15 + 17 + 19 = 75
        String expectedOutput = "80; 75" + System.lineSeparator();

        // Assert
        assertEquals(expectedOutput, outContent.toString());
    }
}
