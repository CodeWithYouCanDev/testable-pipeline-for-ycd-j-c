package youcandev.mentoring.java_syntax._08_data_types._14_filling_the_array_2;

import java.util.Arrays;

/*
Wypełnianie tablicy 2
 */
public class FillingTheArray2 {

    public static void main(String[] args) {
        Integer[] array = new Integer[10];
        fillArray(array, 7, 3, 8);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value, int begin, int end) {
        //napisz tutaj swój kod
        for (int i = begin; i <= end; i++) {
            array[i] = value;
        }
    }
}

