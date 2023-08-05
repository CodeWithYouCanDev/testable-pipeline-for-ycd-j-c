package youcandev.mentoring.java_syntax._09_useful_nuances._07_time_labyrinth;

import java.util.Random;

/*
Labirynt czasu
 */
public class TimeLabyrinth {
    private static final int trueKey = new Random().nextInt(1000);

    public static int minRange = 0;
    public static int maxRange = 1000;

    private static int numberOfAttempts = 0;

    public static int tryKey(int attempt) {
        numberOfAttempts++;
        System.out.printf("Próba nr %d: %d%n", numberOfAttempts, attempt);
        int result;

        if (trueKey > attempt) {
            minRange = attempt;
            result = maxRange;
        } else if (trueKey < attempt) {
            maxRange = attempt;
            result = minRange;
        } else {
            System.out.println("Poprawnie!");
            return attempt;
        }

        System.out.printf("Nie udało się :( Nowy zakres: (%d;%d)%n%n", minRange, maxRange);
        return result;
    }
}
