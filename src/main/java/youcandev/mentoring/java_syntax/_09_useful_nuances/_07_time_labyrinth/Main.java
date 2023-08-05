package youcandev.mentoring.java_syntax._09_useful_nuances._07_time_labyrinth;

import java.util.Random;

public class Main {

    public int findCorrectKey() {
        Random random = new Random();
        int attempt;
        int result;
        int tries = 0;
        do {
            attempt = random.nextInt(TimeLabyrinth.maxRange - TimeLabyrinth.minRange) + TimeLabyrinth.minRange;
            result = TimeLabyrinth.tryKey(attempt);
            tries++;
        } while (attempt != result && tries < 30);
        return result;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.findCorrectKey());
    }
}
