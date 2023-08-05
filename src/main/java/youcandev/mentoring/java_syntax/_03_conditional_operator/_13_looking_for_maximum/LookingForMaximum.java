package youcandev.mentoring.java_syntax._03_conditional_operator._13_looking_for_maximum;

import java.util.Scanner;

/*
Szukamy maksymum
 */
public class LookingForMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
//        if (numberA > numberB) {
//            System.out.println(numberA);
//        } else {
//            System.out.println(numberB);
//        }
        int result = numberA > numberB ? numberA : numberB;
        System.out.println(result);
    }
}
