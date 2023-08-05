package youcandev.mentoring.java_syntax._06_arrays._09_finding_the_smallest_number;

import java.util.Scanner;

/*
Znalezienie najmniejszej liczby
 */
public class FindingTheSmallestNumber {

    public static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        array = new int[k];  // Allocate memory for array here

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < k; i++) {
            array[i] = scanner.nextInt();
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }

}
