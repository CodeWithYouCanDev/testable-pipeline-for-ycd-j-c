package youcandev.mentoring.java_syntax._06_arrays._17_displaying_3d_array;

/*
Wyświetlanie tablicy 3D
 */
public class Displaying3DArray {
    public static int[][][] multiArray = new int[][][]
            {{{10, 23, 41}, {13}}, {{41, 53}, {}}, {{2}, {5}, {1}, {6, 8}}};

    public static void main(String[] args) {
        //napisz tutaj swój kod
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                for (int k = 0; k < multiArray[i][j].length; k++) {
                    System.out.print(multiArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println("----------");
        }
    }
}
