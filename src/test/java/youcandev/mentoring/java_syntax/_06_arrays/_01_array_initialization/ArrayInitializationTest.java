package youcandev.mentoring.java_syntax._06_arrays._01_array_initialization;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayInitializationTest {

    @BeforeEach
    void setUp() {
        // Run the main method before each test to ensure firstArray is properly initialized
        ArrayInitialization.main(new String[]{});
    }

    @Test
    void testFirstArrayIsPublicAndStatic() {
        // Checks if firstArray exists and is of type int[]
        assertNotNull(ArrayInitialization.firstArray);
        assertTrue(ArrayInitialization.firstArray instanceof int[]);
    }

    @Test
    void testFirstArrayHasSizeOf10() {
        assertEquals(10, ArrayInitialization.firstArray.length);
    }

    @Test
    void testThirdElementIs5() {
        // Check the third element (index 2) is 5
        assertEquals(5, ArrayInitialization.firstArray[2]);
    }

    @Test
    void testOtherElementsUnmodified() {
        // Check all other elements are 0 (default value)
        for (int i = 0; i < ArrayInitialization.firstArray.length; i++) {
            if (i != 2) {
                assertEquals(0, ArrayInitialization.firstArray[i]);
            }
        }
    }
}
