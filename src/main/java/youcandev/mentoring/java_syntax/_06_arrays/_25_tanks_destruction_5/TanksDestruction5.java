package youcandev.mentoring.java_syntax._06_arrays._25_tanks_destruction_5;

import java.util.Arrays;

/*
Zniszczenie czołgów 5
 */
public class TanksDestruction5 {

    public static String tank = "☖";
    public static String empty = "_";
    public static String hit = "🎯";
    public static int width = 30;
    public static int height = 10;
    public static int[][] bombs = new int[height][width];
    public static String[][] field = new String[height][width];

    public static void main(String[] args) {
        //napisz tutaj swój kod
        //fill field array by tanks
        for (int i = 0; i < height; i++) {
            int tankPosition = (int) (Math.random() * width);
            for (int j = 0; j < width; j++) {
                if (j == tankPosition) {
                    field[i][j] = tank;
                } else {
                    field[i][j] = empty;
                }
            }
        }

        //fill the bomb array while tanks are still alive
        int tanksCount = 10;
        while (tanksCount > 0) {
            //fill bombs array
            for (int i = 0; i < height; i++) {
                int bombsPosition = (int) (Math.random() * width);
                for (int j = 0; j < width; j++) {
                    if (j == bombsPosition) {
                        bombs[i][j] = 1;
                    } else {
                        bombs[i][j] = 0;
                    }
                }
            }
            //check if tans was destroyed
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if (bombs[i][j] == 1 && field[i][j].equals(tank)) {
                        field[i][j] = hit;
                        tanksCount--;
                    }
                }
            }
        }

        System.out.println(Arrays.deepToString(field));
    }
}
