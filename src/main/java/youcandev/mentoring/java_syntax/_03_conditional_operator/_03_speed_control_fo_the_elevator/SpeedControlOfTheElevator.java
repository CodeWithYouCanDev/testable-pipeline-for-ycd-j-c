package youcandev.mentoring.java_syntax._03_conditional_operator._03_speed_control_fo_the_elevator;

import java.util.Scanner;

/*
Regulacja prędkości windy
 */
public class SpeedControlOfTheElevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = scanner.nextInt();

        if (speed < 0)
            System.out.println("System error!");
        else if (speed > 3) {
            System.out.println("Prędkość windy jest zbyt wysoka, redukujemy...");
            speed = 3;
        } else {
            System.out.println("Prędkość windy jest w normie");
        }
    }
}
