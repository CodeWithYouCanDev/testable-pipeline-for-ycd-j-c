package java_syntax._02_variable_types_and_console_output._18_reading_and_transforming_strings;

import java.util.Scanner;

/*
Odczytywanie i transformacja ciągów
 */
public class ReadingAndTransformingStrings {
    public static void main(String[] args) {
        //napisz tutaj swój kod
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        System.out.println(str3);
        System.out.println(str2.toUpperCase());
        System.out.println(str1.toLowerCase());
    }
}
