package youcandev.mentoring.java_syntax._06_arrays._29_array_splitting;

import java.util.Arrays;

/*
Podział tablicy
 */
public class ArraySplitting {

    public static int[][] multiArray = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        //napisz tutaj swój kod
        int firstPart = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        multiArray[0] = Arrays.copyOfRange(array, 0, firstPart);
        multiArray[1] = Arrays.copyOfRange(array, firstPart, array.length);
        System.out.println(Arrays.deepToString(multiArray));
        System.out.println(Arrays.deepToString(multiArray));
    }
}
