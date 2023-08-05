package youcandev.mentoring.java_syntax._06_arrays._31_binary_search;

import java.util.Arrays;

/*
Wyszukiwanie binarne
 */
public class BinarySearch {

    public static int[] array = {15, 22, 17, 25, 5, 10, 15};
    public static int elementValue = 5;

    public static void main(String[] args) {
        //napisz tutaj swój kod
        int[] arrayCopy = Arrays.copyOf(array, array.length);
        Arrays.sort(arrayCopy);
        boolean result = Arrays.binarySearch(arrayCopy, elementValue) >= 0;
        System.out.println(result);
    }
}
