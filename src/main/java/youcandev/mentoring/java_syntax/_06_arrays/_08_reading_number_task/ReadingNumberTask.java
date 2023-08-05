package youcandev.mentoring.java_syntax._06_arrays._08_reading_number_task;

import java.util.Scanner;

/*
Zadanie z odczytem liczb
 */
public class ReadingNumberTask {
    public static void main(String[] args) {
        //napisz tutaj swój kod
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        int[] data = new int[k];
        for (int i = 0; i < k; i++) {
            data[i] = scanner.nextInt();
        }

        if (k % 2 == 0) {
            for (int i = data.length - 1; i >= 0; i--) {
                System.out.println(data[i]);
            }
        } else {
            for (int i = 0; i < data.length; i++) {
                System.out.println(data[i]);
            }
        }

    }
}
