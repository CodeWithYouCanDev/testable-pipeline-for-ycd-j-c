package youcandev.mentoring.java_syntax._03_conditional_operator._17_strings_comparing;

import java.util.Scanner;

/*
Porównanie napisów
 */
public class StringsComparing {
    public static void main(String[] args) {
        //napisz tutaj swój kod
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine();
        String string2 = sc.nextLine();
        if (string1.equals(string2)) {
            System.out.println("linie są takie same");
        } else {
            System.out.println("linie są różne");
        }
    }
}
