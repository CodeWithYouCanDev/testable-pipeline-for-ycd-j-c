package youcandev.mentoring.java_syntax._06_arrays._16_creating_two_dimensional_array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class CreatingTwoDimensionalArrayTest {

    @BeforeEach
    void setUp() {
        CreatingTwoDimensionalArray.multiArray = null; // reset the static field before each test
    }

    @Test
    void testArrayCreation() {
        String simulatedUserInput = "5\n1\n7\n5\n9\n3\n";
        System.setIn(new ByteArrayInputStream(simulatedUserInput.getBytes()));

        CreatingTwoDimensionalArray.main(new String[]{});

        assertNotNull(CreatingTwoDimensionalArray.multiArray, "The multiArray should be initialized.");
        assertEquals(5, CreatingTwoDimensionalArray.multiArray.length, "The multiArray should have 5 rows.");

        int[] expectedSizes = {1, 7, 5, 9, 3};

        for (int i = 0; i < CreatingTwoDimensionalArray.multiArray.length; i++) {
            assertEquals(expectedSizes[i], CreatingTwoDimensionalArray.multiArray[i].length,
                    "The row at index " + i + " should have a length of " + expectedSizes[i] + ".");
        }
    }
}
