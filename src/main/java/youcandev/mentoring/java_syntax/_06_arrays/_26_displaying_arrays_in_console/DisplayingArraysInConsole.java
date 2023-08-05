package youcandev.mentoring.java_syntax._06_arrays._26_displaying_arrays_in_console;

import java.util.Arrays;

/*
Wyświetlanie tablic w Konsoli
 */
public class DisplayingArraysInConsole {

    public static String[][] strings = new String[][]{{"🙂", "🙂", "🙂", "🙂"}, {"🙃", "🙃", "🙃", "🙃"},
            {"😋", "😋", "😋", "😋"}, {"😎", "😎", "😎", "😎"}};
    public static int[][] ints = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(strings));
        System.out.println(Arrays.deepToString(ints));
    }
}
