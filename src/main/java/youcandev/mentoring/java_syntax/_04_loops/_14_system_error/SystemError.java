package youcandev.mentoring.java_syntax._04_loops._14_system_error;

import java.util.Random;
import java.util.Scanner;

/*
Błąd w systemie
 */
public class SystemError {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        if (inputNumber <= 0) {
            System.out.println("Błąd. Wprowadzona liczba musi byc większa od 0.");
            return;
        }
//
//        int count = 1;
//        while (true) {
//            int randomNumber = new Random().nextInt(inputNumber + 1);
//            if (inputNumber == randomNumber) {
//                System.out.println("Próba №" + count);
//                break;
//            }
//            count++;
//        }
        for (int i = 1; true; i++) {
            int randomNumber = new Random().nextInt(inputNumber + 1);
            if (inputNumber == randomNumber) {
                System.out.println("Próba №" + i);
                break;
            }
        }
    }
}
