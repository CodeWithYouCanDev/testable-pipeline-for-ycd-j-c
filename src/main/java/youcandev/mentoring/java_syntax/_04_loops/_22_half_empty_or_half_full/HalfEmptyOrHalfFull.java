package youcandev.mentoring.java_syntax._04_loops._22_half_empty_or_half_full;

import java.util.Scanner;

/*
Czy kubek jest do połowy  pusty czy do połowy  pełny?
 */
public class HalfEmptyOrHalfFull {
    public static void main(String[] args) {
        double glass = 0.5;
        //napisz tutaj swój kod
        Scanner scanner = new Scanner(System.in);
        boolean isOptimist = scanner.nextBoolean();
        int result;
        if (isOptimist) {
            result = (int) Math.ceil(glass);
        } else {
            result = (int) Math.floor(glass);
        }
        System.out.println(result);
    }
}
