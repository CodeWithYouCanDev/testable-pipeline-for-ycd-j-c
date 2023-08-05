package youcandev.mentoring.java_syntax._06_arrays._31_binary_search;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BinarySearchTest {

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
    void testElementFoundInArray() {
        int[] originalArray = {15, 22, 17, 25, 5, 10, 15};
        BinarySearch.array = Arrays.copyOf(originalArray, originalArray.length);
        BinarySearch.elementValue = 5;

        BinarySearch.main(new String[]{});

        assertEquals("true", bos.toString().trim());
        assertTrue(Arrays.equals(originalArray, BinarySearch.array));
    }

    @Test
    void testElementNotFoundInArray() {
        int[] originalArray = {15, 22, 17, 25, 10, 15};
        BinarySearch.array = Arrays.copyOf(originalArray, originalArray.length);
        BinarySearch.elementValue = 5;

        BinarySearch.main(new String[]{});

        assertEquals("false", bos.toString().trim());
        assertTrue(Arrays.equals(originalArray, BinarySearch.array));
    }
}
