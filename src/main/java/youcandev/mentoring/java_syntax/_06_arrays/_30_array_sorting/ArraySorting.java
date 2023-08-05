package youcandev.mentoring.java_syntax._06_arrays._30_array_sorting;

import java.util.Arrays;

/*
Sortowanie tablicy
 */
public class ArraySorting {

    public static int[] array = {24, 22, 19, 15, 18, 23, 25};

    public static void main(String[] args) {
        //napisz tutaj swój kod
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
