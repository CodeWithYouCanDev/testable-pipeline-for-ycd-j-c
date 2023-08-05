package youcandev.mentoring.java_syntax._08_data_types._14_filling_the_array_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FillingTheArray2Test {

    @Test
    void fillArrayWithValidRangeTest() {
        Integer[] array = new Integer[10];
        FillingTheArray2.fillArray(array, 5, 2, 7);

        for (int i = 0; i < array.length; i++) {
            if (i >= 2 && i <= 7) {
                assertEquals(5, array[i]);
            } else {
                assertNull(array[i]);
            }
        }
    }

    @Test
    void fillArrayWithEntireRangeTest() {
        Integer[] array = new Integer[5];
        FillingTheArray2.fillArray(array, 3, 0, 4);

        for (Integer integer : array) {
            assertEquals(3, integer);
        }
    }

    @Test
    void fillArrayWithNoRangeTest() {
        Integer[] array = new Integer[5];
        FillingTheArray2.fillArray(array, 2, 3, 2);

        for (Integer integer : array) {
            assertNull(integer);
        }
    }

    @Test
    void fillArrayWithEndLessThanBeginTest() {
        Integer[] array = new Integer[10];
        FillingTheArray2.fillArray(array, 4, 7, 5);

        for (Integer integer : array) {
            assertNull(integer);
        }
    }
}
