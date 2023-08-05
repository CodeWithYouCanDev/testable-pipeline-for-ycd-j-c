package youcandev.mentoring.java_syntax._06_arrays._21_tanks_destruction;

/*
Zniszczenie czołgów
 */
public class TanksDestruction {
    public static String tank = "☖";
    public static String empty = "_";
    public static String hit = "🎯";
    public static int width = 30;
    public static int height = 10;
    public static String[][] field = new String[height][width];

    public static void main(String[] args) {
        //napisz tutaj swój kod
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                field[i][j] = empty;
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }

    }
}
