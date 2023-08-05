package youcandev.mentoring.java_syntax._03_conditional_operator._07_three_digits;

import java.util.Scanner;

/*
Trzy liczby
 */
public class ThreeDigits {
    public static void main(String[] args) {
        //napisz tutaj swój kod
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        if (number1 == number2 && number2 == number3) {
            System.out.println(number1 + " " + number2 + " " + number3);
        } else if (number1 == number3) {
            System.out.println(number1 + " " + number3);
        } else if (number2 == number3) {
            System.out.println(number2 + " " + number3);
        } else if (number1 == number2) {
            System.out.println(number1 + " " + number2);
        }
    }
}
