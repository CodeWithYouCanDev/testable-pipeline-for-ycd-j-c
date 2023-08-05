package youcandev.mentoring.java_syntax._03_conditional_operator._04_school_or_university;

import java.util.Scanner;

/*
Szkoła lub uniwersytet
 */
public class SchoolOrUniversity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18) {
            if (age >= 6)
                System.out.println("powinieneś chodzić do szkoły");
        } else
            System.out.println("czas na uniwersytet");
    }
}
