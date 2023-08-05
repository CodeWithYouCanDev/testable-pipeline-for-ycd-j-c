package youcandev.mentoring.java_syntax._06_arrays._10_finding_the_largest_number;

import java.util.Scanner;

/*
Znalezienie największej liczby
 */
public class FindingTheLargestNumber {
    public static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        array = new int[k];  // Allocate memory for array here

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            array[i] = scanner.nextInt();
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

}
