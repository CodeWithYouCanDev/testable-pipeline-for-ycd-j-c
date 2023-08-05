package youcandev.mentoring.java_syntax._03_conditional_operator._06_body_temperature_measuring;

import java.util.Scanner;

/*
Zmierzymy temperaturę ciała
 */
public class BodyTemperatureMeasuring {

    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();
        isHigh = bodyTemperature >= 37;
        isLow = bodyTemperature < 36;

        if (isHigh) {
            System.out.println("temperatura ciała jest wysoka");
        } else if (isLow) {
            System.out.println("temperatura ciała jest nizka");
        } else {
            System.out.println("temperatura ciała jest normalna");
        }
    }
}
