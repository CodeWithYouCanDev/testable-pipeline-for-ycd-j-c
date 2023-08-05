package youcandev.mentoring.java_syntax._04_loops._21_wind_speed;

import java.util.Scanner;

/*
Prędkość wiatru
 */
public class WindSpeed {
    public static void main(String[] args) {
        //napisz tutaj swój kod
        Scanner scanner = new Scanner(System.in);
        int speedInMetersPerSecond = scanner.nextInt();
        int speedInKilometersPerHour = (int) Math.round(speedInMetersPerSecond * 3.6);
        System.out.println(speedInKilometersPerHour);
    }
}
