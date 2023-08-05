package youcandev.mentoring.java_syntax._09_useful_nuances._04_calculating_route;

import java.util.Arrays;

/*
Obliczanie trasy
 */
public class CalculatingRoute {

    public static int[][] caveCoordinates = new int[][]{
            {123, 456, 789}, {987, 654, 321}, {132, 465, 798}, {246, 579, 813},
            {357, 924, 861}, {468, 237, 915}, {579, 348, 102}, {690, 459, 213},
            {789, 123, 456}, {890, 234, 567}, {102, 345, 678}, {213, 456, 789},
            {312, 678, 901}, {423, 789, 102}, {534, 890, 213}, {645, 901, 324},
            {756, 102, 435}, {867, 213, 546}, {978, 324, 657}, {102, 435, 768},
            {213, 546, 879}, {324, 657, 980}, {435, 768, 102}, {546, 879, 213},
            {657, 980, 324}};

    public static double[] safePath = new double[25];

    public static void main(String[] args) {
        // napisz tutaj swój kod
        int i = 0;

        for (int[] coordinates : caveCoordinates) {
            int x = coordinates[0];
            int y = coordinates[1];
            int z = coordinates[2];
            double result = Math.sin(x) * Math.PI + Math.cos(y) * Math.min(x, Math.min(y, z)) + Math.tan(y) / Math.log(z);

            if (result >= 50 && result <= 150) {
                safePath[i] = result;
                i++;
            }
        }
        System.out.println(Arrays.toString(safePath));

    }
}
