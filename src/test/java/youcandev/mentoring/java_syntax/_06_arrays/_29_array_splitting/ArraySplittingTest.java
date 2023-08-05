package youcandev.mentoring.java_syntax._06_arrays._29_array_splitting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArraySplittingTest {

    private final ByteArrayOutputStream bos = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(bos));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void shouldSplitEvenLengthArrayCorrectly() {
        ArraySplitting.array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        ArraySplitting.main(new String[]{});

        int[][] expectedOutput = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}};
        String expectedPrint = Arrays.deepToString(expectedOutput) + "\r\n" + Arrays.deepToString(expectedOutput);

        assertEquals(expectedPrint, bos.toString().trim());
    }

    @Test
    void shouldSplitOddLengthArrayCorrectly() {
        ArraySplitting.array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        ArraySplitting.main(new String[]{});

        int[][] expectedOutput = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11}};
        String expectedPrint = Arrays.deepToString(expectedOutput) + "\r\n" + Arrays.deepToString(expectedOutput);

        assertEquals(expectedPrint, bos.toString().trim());
    }
}
