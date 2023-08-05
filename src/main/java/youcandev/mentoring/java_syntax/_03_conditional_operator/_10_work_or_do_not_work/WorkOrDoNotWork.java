package youcandev.mentoring.java_syntax._03_conditional_operator._10_work_or_do_not_work;

import java.util.Scanner;

/*
Pracować czy nie pracować
 */
public class WorkOrDoNotWork {
    public static void main(String[] args) {
        //napisz tutaj swój kod
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 20 || age > 60) {
            System.out.println("nie trzeba pracować");
        }
    }
}
