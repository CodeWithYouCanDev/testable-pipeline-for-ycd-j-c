package youcandev.mentoring.java_syntax._06_arrays._22_tanks_destruction_2;

import java.util.Arrays;

/*
Zniszczenie czołgów 2
 */
public class TanksDestruction2 {

    public static String tank = "☖";
    public static String empty = "_";
    public static String hit = "🎯";
    public static int width = 30;
    public static int height = 10;
    public static String[][] field = new String[height][width];

    public static void main(String[] args) {
        //napisz tutaj swój kod
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
        System.out.println(Arrays.deepToString(field));


    }
}
