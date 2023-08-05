package youcandev.mentoring.java_syntax._03_conditional_operator._14_ternary_operator;

import java.util.Scanner;

/*
Trójargmuentowy operator
 */
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
//        String result = number < 5 ? "liczba jest mniejsza niż 5" : number > 5
//                ? "liczba jest większa niż 5" : "liczba równa się 5";
//        System.out.println(result);
        if (number < 5) {
            System.out.println("liczba jest mniejsza niż 5");
        } else if (number > 5) {
            System.out.println("liczba jest większa niż 5");
        } else {
            System.out.println("liczba równa się 5");
        }
    }
}
