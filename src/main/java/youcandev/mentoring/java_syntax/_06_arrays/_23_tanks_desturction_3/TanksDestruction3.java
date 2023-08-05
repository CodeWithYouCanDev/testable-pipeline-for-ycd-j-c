package youcandev.mentoring.java_syntax._06_arrays._23_tanks_desturction_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Zniszczenie czołgów 3
 */
public class TanksDestruction3 {

    public static String tank = "☖";
    public static String empty = "_";
    public static String hit = "🎯";
    public static int width = 30;
    public static int height = 10;
    public static int[][] bombs = new int[height][width];
    public static String[][] field = new String[height][width];


    public static void main(String[] args) {
        // Initialize the field with tanks
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

        // Initialize the bomb field
        for (int i = 0; i < height; i++) {
            List<Integer> indices = new ArrayList<>();
            for (int j = 0; j < width; j++) {
                indices.add(j);
            }
            Collections.shuffle(indices);

            for (int j = 0; j < width; j++) {
                if (j < 10) {
                    bombs[i][indices.get(j)] = 1;
                } else {
                    bombs[i][indices.get(j)] = 0;
                }
            }
        }

        System.out.println(Arrays.deepToString(bombs));
    }


}
