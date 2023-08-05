package youcandev.mentoring.java_syntax._03_conditional_operator._15_high_accuracy;

import java.util.Scanner;

/*
Wysoka precyzja
 */
public class HighAccuracy {
    public static void main(String[] args) {
        //napisz tutaj swój kod
        Scanner sc = new Scanner(System.in);
        double double1 = sc.nextDouble();
        double double2 = sc.nextDouble();
        if (Math.abs(double1 - double2) < 0.000001) {
            System.out.println("liczby są równe");
        } else {
            System.out.println("liczby nie są równe");
        }
    }
}
