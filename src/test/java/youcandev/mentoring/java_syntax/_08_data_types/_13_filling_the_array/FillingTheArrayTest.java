package youcandev.mentoring.java_syntax._08_data_types._13_filling_the_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FillingTheArrayTest {

    @Test
    void fillArrayWithValidInputTest() {
        Integer[] array = new Integer[5];
        FillingTheArray.fillArray(array, 3);

        for (int i = 0; i < array.length; i++) {
            assertEquals(3, array[i]);
        }
    }

    @Test
    void fillArrayWithZeroLengthTest() {
        Integer[] array = new Integer[0];
        FillingTheArray.fillArray(array, 4);

        assertEquals(0, array.length);
    }

    @Test
    void fillArrayWithDifferentValueTest() {
        Integer[] array = new Integer[10];
        FillingTheArray.fillArray(array, 7);

        for (Integer integer : array) {
            assertEquals(7, integer);
        }
    }
}
