package youcandev.mentoring.java_syntax._09_useful_nuances._03_the_smallest_number_in_the_array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TheSmallestNumberInTheArrayTest {

    @Test
    void testMin() {
        assertEquals(1, TheSmallestNumberInTheArray.min(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        assertEquals(-10, TheSmallestNumberInTheArray.min(new int[]{0, -1, -2, -3, -4, -5, -6, -7, -8, -10}));
        assertEquals(0, TheSmallestNumberInTheArray.min(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
        assertEquals(5, TheSmallestNumberInTheArray.min(new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 5}));
    }

    @Test
    void testMinWithEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> TheSmallestNumberInTheArray.min(new int[]{}));
    }
}
