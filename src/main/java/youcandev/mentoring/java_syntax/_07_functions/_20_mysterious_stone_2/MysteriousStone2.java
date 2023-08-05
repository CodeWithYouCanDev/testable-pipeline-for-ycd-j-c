package youcandev.mentoring.java_syntax._07_functions._20_mysterious_stone_2;

import java.util.Scanner;

/*
Poszukiwanie rzadkiego kamienia 2
 */
public class MysteriousStone2 {

    public static String getFirstPositionPhrase = "Pomóż Kapitanowi Hawkeye znaleźć, gdzie ukryty jest kamień tajemnicy. Podaj numer kryjówki (1, 2, 3 czy 4):";
    public static String getPositionPhrase = "Kamień nie został odnaleziony. Spróbuj jeszcze raz. Podaj numer kryjówki (1, 2, 3 czy 4):";
    public static String findStonePhrase = "Hawkeye odnalazł kamień tajemnicy.";
    public static int stonePosition;
    public static int hawkeyeLives = 7;
    public static int guardianLives = 7;

    public static void main(String[] args) {
        //napisz tutaj swój kod
        stonePosition = getRandomNumber(4);
        findStone();
    }

    public static int getRandomNumber(int range) {
        return (int) (Math.random() * range) + 1;
    }

    public static void findStone() {
        System.out.println(getFirstPositionPhrase);
        Scanner scanner = new Scanner(System.in);
        int userStonePosition = scanner.nextInt();
        while (userStonePosition != stonePosition) {
            System.out.println(getPositionPhrase);
            userStonePosition = scanner.nextInt();
        }
        System.out.println(findStonePhrase);
    }

    public static void hawkeyeLostLife() {
        hawkeyeLives--;
    }

    public static void guardianLostLife() {
        guardianLives -= 2;
    }

    public static int hawkeyeAttacks() {
        return getRandomNumber(3);
    }

    public static int guardianDefends() {
        return getRandomNumber(3);
    }
}
