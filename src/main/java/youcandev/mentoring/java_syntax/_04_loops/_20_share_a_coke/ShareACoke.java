package youcandev.mentoring.java_syntax._04_loops._20_share_a_coke;

import java.util.Scanner;

/*
Share a Coke
 */
public class ShareACoke {
    public static void main(String[] args) {
        //napisz tutaj swój kod
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        double result = firstNumber * 1. / secondNumber;
        System.out.println(result);
    }
}
