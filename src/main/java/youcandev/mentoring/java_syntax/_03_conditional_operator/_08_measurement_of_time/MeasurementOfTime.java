package youcandev.mentoring.java_syntax._03_conditional_operator._08_measurement_of_time;

import java.util.Scanner;

/*
Pomiar czasu
 */
public class MeasurementOfTime {
    public static String halfAnHour = "pół godziny minęło";
    public static String lessThanHalfAnHour = "mniej niż pół godziny minęło";
    public static String moreThanHalfAnHour = "więcej niż pół godziny minęło";

    public static void main(String[] args) {
        //napisz tutaj swój kod
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        if (hours == 0 && minutes == 30) {
            System.out.println(halfAnHour);
        } else if (hours == 0 && minutes < 30) {
            System.out.println(lessThanHalfAnHour);
        } else {
            System.out.println(moreThanHalfAnHour);
        }
    }
}
