package youcandev.mentoring.java_syntax._06_arrays._16_creating_two_dimensional_array;

import java.util.Scanner;

/*
Tworzenie dwuwymiarowej tablicy
 */
public class CreatingTwoDimensionalArray {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //napisz tutaj swój kod
        Scanner scanner = new Scanner(System.in);

        int k = Integer.parseInt(scanner.nextLine());

        multiArray = new int[k][];
        for (int i = 0; i < k; i++) {
            int size = Integer.parseInt(scanner.nextLine());
            multiArray[i] = new int[size];
        }
    }
}
