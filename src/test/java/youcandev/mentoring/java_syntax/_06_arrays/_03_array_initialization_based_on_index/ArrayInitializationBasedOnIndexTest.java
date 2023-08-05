package youcandev.mentoring.java_syntax._06_arrays._03_array_initialization_based_on_index;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static youcandev.mentoring.java_syntax._06_arrays._03_array_initialization_based_on_index.ArrayInitializationBasedOnIndex.EVEN;
import static youcandev.mentoring.java_syntax._06_arrays._03_array_initialization_based_on_index.ArrayInitializationBasedOnIndex.ODD;

class ArrayInitializationBasedOnIndexTest {

    @Test
    void testArrayInitialization() {
        // Act
        ArrayInitializationBasedOnIndex.main(new String[]{});

        // Assert
        assertEquals(7, ArrayInitializationBasedOnIndex.strings.length);
        assertEquals(ODD, ArrayInitializationBasedOnIndex.strings[0]);
        assertEquals(EVEN, ArrayInitializationBasedOnIndex.strings[1]);
        assertEquals(ODD, ArrayInitializationBasedOnIndex.strings[2]);
        assertEquals(EVEN, ArrayInitializationBasedOnIndex.strings[3]);
        assertEquals(ODD, ArrayInitializationBasedOnIndex.strings[4]);
        assertEquals(EVEN, ArrayInitializationBasedOnIndex.strings[5]);
        assertEquals(ODD, ArrayInitializationBasedOnIndex.strings[6]);
    }
}
