package youcandev.mentoring.java_syntax._06_arrays._14_reversing_two_dimensional_array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversingTwoDimensionalArrayTest {

    private ByteArrayOutputStream outputStream;

    @BeforeEach
    public void setUp() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testArrayReversal() {
        // Call the main method to execute the code
        ReversingTwoDimensionalArray.main(new String[]{});

        // Construct the expected output before and after the array reversal
        String expectedOutputBefore =
                "[1, 2, 3, 4]" + System.lineSeparator() +
                        "[4, 5, 6, 7]" + System.lineSeparator() +
                        "[7, 8, 9, 0]" + System.lineSeparator() +
                        System.lineSeparator();

        String expectedOutputAfter =
                "[7, 8, 9, 0]" + System.lineSeparator() +
                        "[4, 5, 6, 7]" + System.lineSeparator() +
                        "[1, 2, 3, 4]" + System.lineSeparator() +
                        System.lineSeparator();

        String expectedOutput = expectedOutputBefore + expectedOutputAfter;

        // Compare the captured output with the expected output
        assertEquals(expectedOutput, outputStream.toString());
    }
}
