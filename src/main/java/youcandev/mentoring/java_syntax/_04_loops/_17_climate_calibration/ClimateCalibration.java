package youcandev.mentoring.java_syntax._04_loops._17_climate_calibration;

import java.util.Scanner;

/*
Kalibracja klimatu
 */
public class ClimateCalibration {
    public static void main(String[] args) {
        //napisz tutaj swój kod
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
            }
        }
        System.out.println(sum / 5);
    }
}
