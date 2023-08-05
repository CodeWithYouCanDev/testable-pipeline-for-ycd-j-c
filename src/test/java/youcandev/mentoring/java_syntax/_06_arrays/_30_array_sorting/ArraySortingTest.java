package youcandev.mentoring.java_syntax._06_arrays._30_array_sorting;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArraySortingTest {

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
    void shouldSortArrayCorrectly() {
        ArraySorting.array = new int[]{24, 22, 19, 15, 18, 23, 25};

        ArraySorting.main(new String[]{});

        int[] expectedOutput = {15, 18, 19, 22, 23, 24, 25};
        String expectedPrint = Arrays.toString(expectedOutput);

        assertEquals(expectedPrint, bos.toString().trim());
    }
}
