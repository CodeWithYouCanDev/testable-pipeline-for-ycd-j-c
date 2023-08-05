package youcandev.mentoring.java_syntax._07_functions._21_mysterious_stone_3;

import java.util.Scanner;

/*
Poszukiwanie rzadkiego kamienia 3
 */
public class MysteriousStone3 {

    public static String getFirstPositionPhrase = "Pomóż Kapitanowi Hawkeye znaleźć, gdzie ukryty jest kamień tajemnicy. Podaj numer kryjówki (1, 2, 3 czy 4):";
    public static String getPositionPhrase = "Kamień nie został odnaleziony. Spróbuj jeszcze raz. Podaj numer kryjówki (1, 2, 3 czy 4):";
    public static String findStonePhrase = "Hawkeye odnalazł kamień tajemnicy.";
    public static String hawkeyeAttackPhrase = "Hawkeye trafia w cel!";
    public static String guardianDefendPhrase = "Strażnik Kamienia skutecznie się broni!";
    public static int stonePosition;
    public static int hawkeyeLives = 7;
    public static int guardianLives = 7;

    public static void main(String[] args) {
        //napisz tutaj swój kod
        stonePosition = getRandomNumber(4);
        findStone();
        battle();
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

    public static void battle() {
        while (hawkeyeLives > 0 && guardianLives > 0) {
            if (hawkeyeAttacks() == guardianDefends()) {
                System.out.println(guardianDefendPhrase);
                hawkeyeLostLife();
            } else {
                System.out.println(hawkeyeAttackPhrase);
                guardianLostLife();
            }
        }

    }
}
