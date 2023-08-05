package youcandev.mentoring.java_syntax._06_arrays._19_initialization_and_filling_multi_array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InitializationAndFillingMultiArrayTest {

    @Test
    void testArrayInitializationAndFilling() {
        // Call the main method to initialize and fill the array
        InitializationAndFillingMultiArray.main(new String[]{});

        // Check if the array is not null
        assertNotNull(InitializationAndFillingMultiArray.array, "The array is not initialized.");

        // Test the length of each sub-array
        assertEquals(1, InitializationAndFillingMultiArray.array[0].length, "The length of the sub-array at index 0 is incorrect.");
        assertEquals(3, InitializationAndFillingMultiArray.array[1].length, "The length of the sub-array at index 1 is incorrect.");
        assertEquals(5, InitializationAndFillingMultiArray.array[2].length, "The length of the sub-array at index 2 is incorrect.");
        assertEquals(7, InitializationAndFillingMultiArray.array[3].length, "The length of the sub-array at index 3 is incorrect.");
        assertEquals(9, InitializationAndFillingMultiArray.array[4].length, "The length of the sub-array at index 4 is incorrect.");

        // Check the values in the sub-arrays
        assertArrayEquals(new int[]{0}, InitializationAndFillingMultiArray.array[0], "Values in the sub-array at index 0 are incorrect.");
        assertArrayEquals(new int[]{1, 2, 3}, InitializationAndFillingMultiArray.array[1], "Values in the sub-array at index 1 are incorrect.");
        assertArrayEquals(new int[]{2, 3, 4, 5, 6}, InitializationAndFillingMultiArray.array[2], "Values in the sub-array at index 2 are incorrect.");
        assertArrayEquals(new int[]{3, 4, 5, 6, 7, 8, 9}, InitializationAndFillingMultiArray.array[3], "Values in the sub-array at index 3 are incorrect.");
        assertArrayEquals(new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12}, InitializationAndFillingMultiArray.array[4], "Values in the sub-array at index 4 are incorrect.");
    }
}
