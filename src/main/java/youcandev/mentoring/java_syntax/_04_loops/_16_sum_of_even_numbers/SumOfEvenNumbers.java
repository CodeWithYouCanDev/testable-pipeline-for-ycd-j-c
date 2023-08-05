package youcandev.mentoring.java_syntax._04_loops._16_sum_of_even_numbers;

import java.util.Scanner;

/*
Suma liczb parzystych
 */
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        int sum = 0;
        //napisz tutaj swój kod
        for (int i = start; i < end; i++) {
            if (i % multiple != 0) {
                continue;
            }
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
