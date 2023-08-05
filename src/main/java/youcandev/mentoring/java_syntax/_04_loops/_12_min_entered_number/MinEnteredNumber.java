package youcandev.mentoring.java_syntax._04_loops._12_min_entered_number;

import java.util.Scanner;

/*
Minimum z wprowadzonych liczb
 */
public class MinEnteredNumber {
    public static void main(String[] args) {
        //napisz tutaj swój kod
        Scanner console = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (x < min) {
                min = x;
            }
        }
        System.out.println(min);
    }
}
