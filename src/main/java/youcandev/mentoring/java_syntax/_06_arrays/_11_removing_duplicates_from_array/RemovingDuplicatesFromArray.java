package youcandev.mentoring.java_syntax._06_arrays._11_removing_duplicates_from_array;

import java.util.Scanner;

/*
Usuwanie duplikatów z tablicy
 */
public class RemovingDuplicatesFromArray {
    public static String[] consoleLines;

    public static void main(String[] args) {
        //napisz tutaj swój kod
        Scanner scanner = new Scanner(System.in);
        consoleLines = new String[10];
        for (int i = 0; i < 10; i++) {
            consoleLines[i] = scanner.nextLine();
        }
        for (int i = 0; i < consoleLines.length; i++) {
            String currentString = consoleLines[i];
            for (int j = i + 1; j < consoleLines.length; j++) {
                if (currentString == null) {
                    break;
                }
                if (currentString.equals(consoleLines[j])) {
                    consoleLines[j] = null;
                    consoleLines[i] = null;
                }
            }
        }

        for (String consoleLine : consoleLines) {
            System.out.println(consoleLine + ", ");
        }
    }
}
