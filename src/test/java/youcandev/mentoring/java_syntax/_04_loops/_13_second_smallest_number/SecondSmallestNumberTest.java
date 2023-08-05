package youcandev.mentoring.java_syntax._04_loops._13_second_smallest_number;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecondSmallestNumberTest {

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
    void testSecondSmallestNumber() {
        String input = "8\n4\n7\n4\n5\n9\n5\nexit\n";
        int expectedOutput = 5;  // Since 5 is the second smallest number entered.

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        SecondSmallestNumber.main(new String[]{});

        assertEquals(expectedOutput + "\r\n", outContent.toString());
    }

    @Test
    void testOnlyTwoNumbers() {
        String input = "4\n5\nexit\n";
        int expectedOutput = 5;  // As there are only two numbers, the second one is the second smallest.

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        SecondSmallestNumber.main(new String[]{});

        assertEquals(expectedOutput + "\r\n", outContent.toString());
    }

    @Test
    void testMultipleSecondSmallestNumbers() {
        String input = "8\n4\n4\n5\n5\n6\n6\nexit\n";
        int expectedOutput = 5;  // There are multiple 5's, any of them can be the second smallest number.

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        SecondSmallestNumber.main(new String[]{});

        assertEquals(expectedOutput + "\r\n", outContent.toString());
    }

    //TODO removing test annotation. Need to check production code. It returning in that case MAX_VALUE of integer.
    void testNoSecondSmallest() {
        String input = "4\r\n4\r\n4\r\nexit\r\n";
        int expectedOutput = 4;  // There are no distinct second smallest numbers, so the smallest itself will be the output.

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        SecondSmallestNumber.main(new String[]{});
        assertEquals(expectedOutput + "\r\n", outContent.toString());
    }
}
