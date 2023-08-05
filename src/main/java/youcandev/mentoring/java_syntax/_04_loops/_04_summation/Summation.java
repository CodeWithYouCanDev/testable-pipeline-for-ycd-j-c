package youcandev.mentoring.java_syntax._04_loops._04_summation;

import java.util.Scanner;

/*
Sumowanie
 */
public class Summation {
    public static void main(String[] args) {
        //napisz tutaj swój kod
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        boolean isExit = false;
        while (!isExit) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum = sum + number;
            } else if (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.equals("ENTER")) {
                    isExit = true;
                }
            }
        }
        System.out.println(sum);
    }
}
