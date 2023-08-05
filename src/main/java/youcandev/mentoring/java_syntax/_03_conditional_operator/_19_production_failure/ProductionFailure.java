package youcandev.mentoring.java_syntax._03_conditional_operator._19_production_failure;

import java.util.Scanner;

public class ProductionFailure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj hasło:");
        String inputPassword = scanner.nextLine();

        if ("QWERTY".equalsIgnoreCase(inputPassword)) {
            System.out.println("Zalogowano!");
        } else {
            System.out.println("Hasło jest niepoprawne!");
        }
    }
}
