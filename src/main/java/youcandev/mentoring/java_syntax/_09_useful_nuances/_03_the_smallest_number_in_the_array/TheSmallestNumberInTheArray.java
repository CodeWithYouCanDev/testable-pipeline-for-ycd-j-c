package youcandev.mentoring.java_syntax._09_useful_nuances._03_the_smallest_number_in_the_array;

import java.util.Scanner;

/*
Najmniejsza liczba w tablicy
//TODO code change
 */
public class TheSmallestNumberInTheArray {
    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        if (ints == null || ints.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }
        int minimum = ints[0];
        for (int i = 1; i < ints.length; i++) {
            minimum = Math.min(minimum, ints[i]);
        }
        return minimum;
    }


    public static int[] getArrayOfTenElements() {
        //napisz tutaj swój kod
        int[] intArray = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }
}
