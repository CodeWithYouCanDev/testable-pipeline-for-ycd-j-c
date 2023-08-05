package youcandev.mentoring.java_syntax._06_arrays._27_multi_array_comparison;

import java.util.Arrays;

/*
Porównanie tablic dwuwymiarowych
 */
public class MultiArrayComparison {

    public static int[][] firstArray = new int[][]{{10, 20, 30, 40}, {5, 6, 7, 8}, {15, 14, 12, 12}};
    public static int[][] secondArray = new int[][]{{10, 20, 30, 40}, {5, 6, 7, 8}, {15, 14, 12, 12}};

    public static void main(String[] args) {
        System.out.println(Arrays.deepEquals(firstArray, secondArray));
    }
}
