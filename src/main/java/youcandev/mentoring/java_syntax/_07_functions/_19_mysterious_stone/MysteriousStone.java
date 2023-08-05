package youcandev.mentoring.java_syntax._07_functions._19_mysterious_stone;

import java.util.Scanner;

/*
Poszukiwanie rzadkiego kamienia
 */
public class MysteriousStone {

    public static String getFirstPositionPhrase = "Pomóż Kapitanowi Hawkeye znaleźć, gdzie ukryty jest kamień tajemnicy. Podaj numer kryjówki (1, 2, 3 czy 4):";
    public static String getPositionPhrase = "Kamień nie został odnaleziony. Spróbuj jeszcze raz. Podaj numer kryjówki (1, 2, 3 czy 4):";
    public static String findStonePhrase = "Hawkeye odnalazł kamień tajemnicy.";
    public static int stonePosition;

    public static void main(String[] args) {
        //napisz tutaj swój kod
        stonePosition = getRandomNumber(4);
        findStone();
    }

    protected static int getRandomNumber(int range) {
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

}
