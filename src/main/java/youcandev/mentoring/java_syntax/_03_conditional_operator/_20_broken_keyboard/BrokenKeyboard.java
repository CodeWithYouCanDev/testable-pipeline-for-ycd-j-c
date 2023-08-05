package youcandev.mentoring.java_syntax._03_conditional_operator._20_broken_keyboard;

import java.util.Scanner;

/*
Zepsuta klawiatura
 */
public class BrokenKeyboard {
    public static String secret = "AdMIn";

    public static void main(String[] args) {
        //napisz tutaj swój kod
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (password.equals(secret)) {
            System.out.println("dostęp przyznany");
        } else {
            System.out.println("dostęp zabroniony");
        }
    }
}
