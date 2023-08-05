package youcandev.mentoring.java_syntax._04_loops._13_second_smallest_number;

import java.util.Scanner;

/*
Druga najmniejsza liczba
 */
public class SecondSmallestNumber {
    public static void main(String[] args) {
        //napisz tutaj swój kod
        Scanner console = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        while (console.hasNextInt()) {
            int tmp = console.nextInt();
            if (tmp < min) {
                secondMin = min;
                min = tmp;
            } else if (tmp > min && tmp < secondMin) {
                secondMin = tmp;
            }
        }

        System.out.println(secondMin);
    }
}
