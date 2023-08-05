package youcandev.mentoring.java_syntax._06_arrays._20_multi_arrays_comparing;

import java.util.Arrays;

/*
Porównanie tablic dwuwymiarowych
 */
public class MultiArraysComparing {
    public static int[][] firstArray = {{1, 10, 10}, {11, 8, 9}, {7, 10, 64}};
    public static int[][] secondArray = {{1, 10, 10}, {11, 8, 9}, {7, 10, 64}};

    public static char[][] message = {
            {'T', 'A', 'S', 'K'},
            {'S', 'U', 'C', 'C', 'E', 'S', 'S', 'F', 'U', 'L', 'L', 'Y'},
            {'C', 'O', 'M', 'P', 'L', 'E', 'T', 'E', 'D'}
    };

    public static void main(String[] args) {
        if (Arrays.deepEquals(firstArray, secondArray)) {
            System.out.println(Arrays.deepToString(message));
        }
    }
}
