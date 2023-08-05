package youcandev.mentoring.java_syntax._08_data_types._13_filling_the_array;
/*
Wypełnianie tablicy
 */

import java.util.Arrays;

public class FillingTheArray {
    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        fillArray(array, 7);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value) {
        //napisz tutaj swój kod
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
    }
}
