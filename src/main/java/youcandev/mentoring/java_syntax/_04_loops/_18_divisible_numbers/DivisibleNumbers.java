package youcandev.mentoring.java_syntax._04_loops._18_divisible_numbers;

import java.util.Scanner;

/*
Liczby Podzielne
 */
public class DivisibleNumbers {
    public static void main(String[] args) {
        //napisz tutaj swój kod
        Scanner scanner = new Scanner(System.in);

        int i;
        do {
            i = scanner.nextInt();
            System.out.println(i);
        } while (i % 10 != 0);
    }
}
