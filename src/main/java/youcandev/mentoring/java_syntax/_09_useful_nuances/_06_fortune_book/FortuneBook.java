package youcandev.mentoring.java_syntax._09_useful_nuances._06_fortune_book;

import java.util.Random;

/*
Księga wróżb
//todo CODE CHANGE
 */
public class FortuneBook {
    static final String FOR_SURE = "Z pewnością";
    static final String YES_DEFINITELY = "Tak, na pewno";
    static final String PROBABLY = "Prawdopodobnie";
    static final String MAYBE_YES = "Może tak";
    static final String NOT_NOW = "Nie teraz";
    static final String TRY_AGAIN = "Spróbuj ponownie";
    static final String DONT_THINK_SO = "Nie sądzę";
    static final String HIGHLY_UNLIKELY = "Wysoce nieprawdopodobne";

    public static String getFortune() {
        // napisz tutaj swój kod
        int random = new Random().nextInt(8);
        if (random == 0) {
            return FOR_SURE;
        } else if (random == 1) {
            return YES_DEFINITELY;
        } else if (random == 2) {
            return PROBABLY;
        } else if (random == 3) {
            return MAYBE_YES;
        } else if (random == 4) {
            return NOT_NOW;
        } else if (random == 5) {
            return TRY_AGAIN;
        } else if (random == 6) {
            return DONT_THINK_SO;
        } else if (random == 7) {
            return HIGHLY_UNLIKELY;
        } else {
            return null;
        }
    }
}
