package youcandev.mentoring.java_syntax._04_loops._11_max_entered_number;

import java.util.Scanner;

/*
Maksimum z wprowadzonych liczb
 */
public class MaxEnteredNumber {
    public static void main(String[] args) {
        //napisz tutaj swój kod
        Scanner console = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (x % 2 == 0 && x > max) {
                max = x;
            }
        }
        System.out.println(max);
    }
}
