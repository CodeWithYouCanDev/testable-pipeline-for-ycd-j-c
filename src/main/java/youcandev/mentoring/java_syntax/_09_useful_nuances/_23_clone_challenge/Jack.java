package youcandev.mentoring.java_syntax._09_useful_nuances._23_clone_challenge;

import java.util.Random;

/*
Wyzwanie z klonami
 */
public class Jack {
    public int identifier;

    {
        Random random = new Random();
        for (int i = 0; i < 9; i++) {
            identifier += random.nextInt(10) * Math.pow(10, i);
        }
    }
}
