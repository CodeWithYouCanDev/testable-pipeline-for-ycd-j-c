package youcandev.mentoring.java_syntax._06_arrays._28_array_filling;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArrayFillingTest {

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
    void shouldFillEvenLengthArrayCorrectly() {
        ArrayFilling.array = new int[20];
        ArrayFilling.start = 7;
        ArrayFilling.end = 20;

        ArrayFilling.main(new String[]{});

        String[] expectedOutput = new String[20];
        Arrays.fill(expectedOutput, 0, 10, "7");
        Arrays.fill(expectedOutput, 10, 20, "20");

        assertEquals(Arrays.toString(expectedOutput), bos.toString().trim());
    }

    @Test
    void shouldFillOddLengthArrayCorrectly() {
        ArrayFilling.array = new int[21];
        ArrayFilling.start = 7;
        ArrayFilling.end = 20;

        ArrayFilling.main(new String[]{});

        String[] expectedOutput = new String[21];
        Arrays.fill(expectedOutput, 0, 11, "7");
        Arrays.fill(expectedOutput, 11, 21, "20");

        assertEquals(Arrays.toString(expectedOutput), bos.toString().trim());
    }
}
