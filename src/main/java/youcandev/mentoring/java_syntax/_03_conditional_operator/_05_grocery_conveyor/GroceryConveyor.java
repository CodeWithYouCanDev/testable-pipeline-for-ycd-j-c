package youcandev.mentoring.java_syntax._03_conditional_operator._05_grocery_conveyor;

import java.util.Scanner;

/*
Przewożnik spożywczy
 */
public class GroceryConveyor {
    public static void main(String[] args) {
        //napisz tutaj swój kod
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int number4 = sc.nextInt();
        if (number1 > 0) {
            System.out.println(number1);
        }
        if (number2 > 0) {
            System.out.println(number2);
        }
        if (number3 > 0) {
            System.out.println(number3);
        }
        if (number4 > 0) {
            System.out.println(number4);
        }
    }
}
