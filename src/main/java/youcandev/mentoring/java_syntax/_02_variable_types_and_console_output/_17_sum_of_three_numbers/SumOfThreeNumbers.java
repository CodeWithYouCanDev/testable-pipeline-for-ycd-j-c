package java_syntax._02_variable_types_and_console_output._17_sum_of_three_numbers;
/*
Suma trzech liczb
 */


import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args) {
        //napisz tutaj swój kod
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        System.out.println(number1 + number2 + number3);
    }
}
