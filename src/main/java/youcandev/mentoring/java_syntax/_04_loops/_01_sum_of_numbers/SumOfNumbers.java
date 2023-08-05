package youcandev.mentoring.java_syntax._04_loops._01_sum_of_numbers;

import java.util.Scanner;

/*
Suma ciągu liczb
 */
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        //napisz tutaj swój kod
        while (number > 0) {
            sum += number;
            number--;
        }

        System.out.println(sum);
    }
}
