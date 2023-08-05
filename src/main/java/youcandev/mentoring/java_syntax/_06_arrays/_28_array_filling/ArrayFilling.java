package youcandev.mentoring.java_syntax._06_arrays._28_array_filling;

import java.util.Arrays;

/*
Wypełnienie tablicy
 */
public class ArrayFilling {

    public static int[] array = new int[20];
    public static int start = 7;
    public static int end = 20;

    public static void main(String[] args) {
        //napisz tutaj swój kod
        int firstPart = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        Arrays.fill(array, 0, firstPart, start);
        Arrays.fill(array, firstPart, array.length, end);
        System.out.println(Arrays.toString(array));
    }
}
