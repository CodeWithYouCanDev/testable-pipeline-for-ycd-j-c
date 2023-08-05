package youcandev.mentoring.java_syntax._04_loops._07_mysterious_numbe;

import java.util.Scanner;

/*
Tajemnicza liczba
 */
public class MysteriousNumber {
    public static void main(String[] args) {
        System.out.println("Wprowadż liczbę całkowitą:");

        checkNumber(3);
    }

    public static void checkNumber(int number) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;
        //napisz tutaj swój kod
        while (scanner.hasNextInt()) {
            inputNumber = scanner.nextInt();
            if (inputNumber == number) {
                System.out.println("Tajemnicza liczba to " + inputNumber);
                break;
            }
            System.out.println("Spróbuj jeszcze raz");
        }
    }
}
